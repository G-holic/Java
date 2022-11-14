package cn.itcast.utils;

import com.alibaba.druid.pool.DruidDataSourceFactory;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.Properties;

public class JDBCTools2 {
    /*
    整个项目中，有一个数据库连接池对象就可以了
     */
    private static DataSource dataSource;
    private static ThreadLocal<Connection> threadLocal = new ThreadLocal<>();

    static{
        try {
            //静态代码块，在类初始化时执行，只执行一次
            Properties properties = new Properties();
            properties.load(JDBCTools2.class.getClassLoader().getResourceAsStream("druid.properties"));
            dataSource = DruidDataSourceFactory.createDataSource(properties);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static Connection getConnection() throws SQLException {
        Connection connection = threadLocal.get();
        if(connection == null){
            connection = dataSource.getConnection();
            threadLocal.set(connection);//让当前线程存储这个共享的连接，存储到内部的ThreadLocalMap中，key是ThreadLocal对象,value就是Connection对象
        }
        return connection;
    }

    public static void freeConnection() throws SQLException {
        Connection connection = threadLocal.get();
        connection.setAutoCommit(true);
        connection.close();
        threadLocal.remove();
    }
}
