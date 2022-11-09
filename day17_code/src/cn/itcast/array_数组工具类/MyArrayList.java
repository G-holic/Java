package cn.itcast.array_数组工具类;

import java.util.Arrays;
import java.util.Iterator;

/*
MyArrayList：动态数组的数据结构
MyArrayList：容器类，里面可以存储元素
 */
public class MyArrayList implements Iterable {
    private Object[] all = new Object[5];
    private int total;// 记录实际的元素的个数

    /*
    添加的数组的末尾
     */
    public void add(Object element) {
        grow();
        all[total++] = element;
    }

    private void grow() {
        if (total >= all.length) {
            // all = Arrays.copyOf(all, all.length+1); //每次扩1个   优点：不会浪费，缺点：扩容频率太高
            //  all = Arrays.copyOf(all, all.length*2); //每次扩大为原来的2倍  优点：扩容频率低，缺点：很可能浪费
            all = Arrays.copyOf(all, all.length + (all.length >> 1)); //每次扩大为原来的1.5倍  上面的折中
        }
    }

    /*
    添加到数组的[index]位置，类似于插入
     */
    public void add(int index, Object element) {
        // 校验index，合理的插入范围[0,total]
        if (index < 0 || index > total) {
            throw new IndexOutOfBoundsException(index + "越界，合理范围是:[0" + "," + total + "]");
        }

        /*
        考虑是否要扩容
            把插入位置[index]及其后面的元素后移
         */
        grow();
         /*
        假设 all.length= 10，total = 6 ， index = 1
        [0,5]
        arr[1],arr[2],arr[3],arr[4],arr[5]得移
         */
        System.arraycopy(all, index, all, index + 1, total - index); // index->index+1  移多少个：是total减去index
        all[index] = element;
        total++;//元素个数也要+1
    }

    // 删除[index]位置的元素
    public void remove(int index) {
        // 校验index，合理的插入范围[0,total-1]
        if (index < 0 || index > total) {
            throw new IndexOutOfBoundsException(index + "越界，合理范围是:[0" + "," + (total - 1) + "]");
        }
        // 元素前移。最后[total-1]的位置为null
        System.arraycopy(all, index + 1, all, index, total - index - 1);

         /*
        假设 all.length= 10，total = 6 ， index = 1
        [0,5]
        移动
        arr[2]->arr[1]
        arr[3]->arr[2]
        arr[4]->arr[3]
        arr[5]->arr[4]
         */
//        all[total - 1] = null;
//        total--;
        all[--total] = null;
    }

    @Override
    public Iterator iterator() {
        return new Itr();
    }

    private class Itr implements Iterator {
        int cursor = 0;// 游标，默认指向第一个元素

        @Override
        public boolean hasNext() {
            // cursor正确的范围是[0,total-1]
            return cursor < total;
        }

        @Override
        public Object next() {
            return all[cursor++];
        }
    }
}
