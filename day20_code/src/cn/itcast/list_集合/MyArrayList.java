package cn.itcast.list_集合;

import java.util.Arrays;
import java.util.Iterator;

/*
MyArrayList模仿ArrayList动态数组类的实现。
MyArrayList是一个容器，是一个集合，用来存储对象的。
（1）元素的类型是什么？不确定，可以使用泛型
<E>：Element Type元素类型
（2）内部是动态数组，要有数组结构
暂且声明为Object[]
（3）声明一个实例变量来记录实际存储的元素个数
 */
public class MyArrayList<E> implements Iterable<E> {
    //    private E[] all = new E[5];// 无法创建
    private Object[] all = new Object[5];
    private int total;

    /**
     * 获取元素个数的方法
     *
     * @return int
     */
    public int size() {
        return total;
    }

    private void grow() {// 扩容方法
        // 考虑数组是否已满，需要扩容
        if (total >= all.length) {
            all = Arrays.copyOf(all, all.length + (all.length >> 1));//扩容为原来的1.5倍
        }
    }
    /**
     * 添加元素
     *
     * @param e E：添加一个元素到当前集合中
     */


    public void add(E e) {
        grow();
        /*all[total] = e;
        total++;*/
        all[total++] = e;
    }


    public void add(int index, E e) {
        // 检查下标
        if (index < 0 || index > total) {
            throw new IndexOutOfBoundsException(index + "越界");
        }
        // 考虑数组是否已满，需要扩容
        grow();

        // 把[index]位置的元素往后移动
        /*
        假设all.length = 10，total= 7， index = 3，正常下标[0,6]
        all[6] -> all[7]
        all[5] -> all[6]
        all[4] -> all[5]
        all[3] -> all[4]
        移动元素的个数是4， total - index
         */
        System.arraycopy(all, index, all, index + 1, total - index);// 移动total-index个

        all[index] = e;
        total++;
    }

    /**
     * 返回index位置的元素
     *
     * @param index int 下标
     * @return E 元素
     */
    public E get(int index) {
        // 判断index的合法性
        checkIndex(index);
        return (E) all[index];
    }

    private void checkIndex(int index) {
        // 判断index的合法性
        if (index < 0 || index >= total) { // 查询最多查询total-1
            throw new IndexOutOfBoundsException(index + "越界");
        }
    }

    /**
     * 查询obj在当前集合中的位置
     *
     * @param obj Object
     * @return int 如果有多个重复的，只返回第1个的下标。如果不存在返回-1
     */
    public int indexOf(Object obj) {
        /*
        思路：遍历all数组，如果元素和obj一样，就返回下标，如果遍历没有一样的，返回-1
        * */
        if (obj != null) {
            for (int i = 0; i < total; i++) {
                if (obj.equals(all[i])) {
                    return i;
                }
            }

        } else {
            for (int i = 0; i < all.length; i++) {
                if (all[i] == obj) { // null == null 是相等的
                    return i;
                }
            }
        }

        return -1;
    }

    /**
     * 查询obj在当前集合中的位置
     *
     * @param obj Object
     * @return int 如果有多个重复的，只返回最后一个的下标。如果不存在返回-1
     */
    public int lastIndexOf(Object obj) {
        /*
        思路：遍历all数组，如果元素和obj一样，就返回下标，如果遍历没有一样的，返回-1
        * */
        if (obj != null) {
            for (int i = total - 1; i >= 0; i--) {
                if (obj.equals(all[i])) {
                    return i;
                }
            }

        } else {
            for (int i = total - 1; i >= 0; i--) {
                if (all[i] == obj) { // null == null 是相等的
                    return i;
                }
            }
        }

        return -1;
    }

    /**
     * 判断obj是否在当前集合中
     *
     * @param obj Object 查询的目标对象
     * @return boolean 存在就返回true，不存在返回false
     */
    public boolean contains(Object obj) {
        return indexOf(obj) != -1; // 不等于-1就是true
    }

    /**
     * 修改index位置的元素
     *
     * @param index int 下标
     * @param e     E 目标对象
     */
    public void set(int index, E e) {
        // 判断index合法性
        checkIndex(index);
        all[index] = e;
    }

    /**
     * 替换集合中obj元素为e
     *
     * @param obj Object 目标对象
     * @param e   E 新对象
     */
    public void set(Object obj, E e) {
        /*
        两种实现方案：一种替换所有找到的，第二种是替换第一个找到的
        * */
        // 这里选择实现第二种
        int index = indexOf(obj);
        if (index != -1) {
            set(index, e);
        }
    }

    /**
     * 删除index位置的元素
     *
     * @param index int 下标
     */

    public void remove(int index) {
        /*
        思路：先把index位置后面往前移动，再把最后一个位置置为null
         */
        /*
        假设all.length=10, total = 7, index = 3, 有效元素的范围[0,6]
        all[4]->all[3]
        all[5]->all[4]
        all[6]->all[5]
        一共往前复制了3个元素，total-index-1
         */
        System.arraycopy(all, index + 1, all, index, total - index - 1);
        /*all[total-1]=null;
        total--;*/
        all[--total] = null;
    }

    /**
     * 删除目标对象
     *
     * @param obj Object 目标对象
     */
    public void remove(Object obj) {
        /*
        方案：（1）删除所有重复的obj（2）删除第一个找到的obj
         */
        //这里选择方案二
        int index = indexOf(obj);
        if (index != -1) {
            remove(index);
        }
    }

    /**
     * 把现在集合中的所有元素用数组返回
     *
     * @return Object[] 返回元素的数组
     */
    public Object[] toArray() {
        return Arrays.copyOf(all, total);// 传入数组和长度
    }


    @Override
    public Iterator<E> iterator() {
        return new Itr();
    }

    private class Itr implements Iterator<E> {
        int cursor; // 初始化游标

        @Override
        public boolean hasNext() {
            return cursor < total;
        }

        @Override
        public E next() {
            return (E) all[cursor++];
        }
    }
}
