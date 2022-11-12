package cn.itcast.dao;

import cn.itcast.utils.JDBCTools;

import java.lang.reflect.Field;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public abstract class BaseDAOImpl {
    //通用的增、删、改的操作
    //sql中包含？参数，需要设置？的值
    //如果sql中没有?，那么调用这个方法时，不用传args对应的实参
    //如果sql中有5个?，那么调用这个方法时，要给args传入对应的5个实参
    protected int update(String sql, Object... args) throws SQLException {
        // 获取连接
        Connection conn = JDBCTools.getConnection();

        PreparedStatement pst = conn.prepareStatement(sql);
        // 设置?的值
        if (args != null && args.length > 0) {
            for (int i = 0; i < args.length; i++) {
                pst.setObject(i + 1, args[i]);
            }
        }

        // 执行sql
        int len = pst.executeUpdate();

        // 释放连接
        JDBCTools.freeConnection(conn);
        return len;
    }

    //查询多个对象的通用方法
    protected <T> List<T> getList(Class<T> clazz, String sql, Object... args) throws SQLException, IllegalAccessException, InstantiationException, NoSuchFieldException {
        // 获取连接
        Connection conn = JDBCTools.getConnection();

        PreparedStatement pst = conn.prepareStatement(sql);

        if (args != null && args.length > 0) {
            for (int i = 0; i < args.length; i++) {
                pst.setObject(i + 1, args[i]);
            }
        }

        List<T> list = new ArrayList<>();
        ResultSet rs = pst.executeQuery();

        // 结果集的元数据对象
        ResultSetMetaData metaData = rs.getMetaData();
        int columnCount = metaData.getColumnCount();// 得到列数
        while (rs.next()) {
            // 每一行是一个对象
            T t = clazz.newInstance();
            for (int i = 1; i <= columnCount; i++) {
                Object value = rs.getObject(i);// 得到每一行的某一列  value是t对象的某个属性值

//                String columnName = metaData.getColumnName(i);// 获取第i列的列名称
                String columnName = metaData.getColumnLabel(i);//获取第i列的列名称或别名，如果指定了别名就按照别名来处理
                Field field = clazz.getDeclaredField(columnName);//根据列名称获取Department或Employee类的某个属性
                field.setAccessible(true);
                field.set(t, value);// 设置t对象的field属性值
            }
            list.add(t);
        }

        // 释放连接
        JDBCTools.freeConnection(conn);

        return list;
    }

    //查询单个对象的通用方法
    protected <T> T getBean(Class<T> clazz, String sql, Object... args) throws SQLException, NoSuchFieldException, InstantiationException, IllegalAccessException {
        List<T> list = getList(clazz, sql, args);
        if (list != null && list.size() > 0) {
            return list.get(0);
        }
        return null;
    }
}
