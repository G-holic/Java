package cn.itcast06.class06;

/*
从小到大
冒泡排序：
    相邻元素比较，如果前面的比后面的元素“大”，就交换它们。
    经过多轮，每一轮只能确定一个元素到达正确的位置。


第一轮：{6,9(前),2,9(后),1};
    第1次，arr[0]与arr[1]比较，arr[0]>arr[1]，6>9不成立
    第2次，arr[1]与arr[2]比较，arr[1]>arr[2]，9>2成立，交换 arr[1]与arr[2]     {6,2,9(前),9(后),1};
    第3次，arr[2]与arr[3]比较，arr[2]>arr[3]，9(前)>9(后)，不成立
    第4次，arr[3]与arr[4]比较，arr[3]>arr[4]，9(后)>1成立，交换arr[3]与arr[4]   {6,2,9(前),1，9(后)};
    第一轮只是实现了“最大值”到达最右边

第二轮：   {6,2,9(前),1，9(后)};
    第1次，arr[0]与arr[1]比较，arr[0]>arr[1]，6>2成立，交换arr[0]与arr[1]  {2,6,9(前),1，9(后)};
    第2次，arr[1]与arr[2]比较，arr[1]>arr[2]，6>9(前)，不成立
    第3次，arr[2]与arr[3]比较，arr[2]>arr[3]，9(前)>1，成立，交换arr[2]与arr[3]  {2,6,1，9(前),9(后)};

第三轮： {2,6,1，9(前),9(后)};
    第1次，arr[0]与arr[1]比较，arr[0]>arr[1]，2>6不成立
    第2次，arr[1]与arr[2]比较，arr[1]>arr[2]，6>1成立，交换 arr[1]与arr[2]    {2,1,6，9(前),9(后)};

第四轮：{2,1,6，9(前),9(后)};
    第1次，arr[0]与arr[1]比较，arr[0]>arr[1]，2>1成立，交换arr[0]与arr[1]   {1,2,6，9(前),9(后)};

 */
public class Test02BubbleSort {
    public static void main(String[] args) {
        int[] arr = {6, 9, 2, 9, 1};

        //冒泡排序
        /*
        外循环：控制轮数   轮数 = arr.length-1
        内循环：控制每一轮的相邻元素的比较和交换

        arr.length=5
        i=1,2,3,4
         */
//        for (int i = 0; i < arr.length-i; i++) {
//        }
        for (int i = 1; i < arr.length; i++) {
            /*
            第一轮：i=1
                arr[0]与arr[1]       arr[j]与arr[j+1]  j=0
                arr[1]与arr[2]       arr[j]与arr[j+1]  j=1
                arr[2]与arr[3]       arr[j]与arr[j+1]  j=2
                arr[3]与arr[4]       arr[j]与arr[j+1]  j=3        j<4  j<arr.length-i
            第二轮：i=2
                arr[0]与arr[1]       arr[j]与arr[j+1]  j=0
                arr[1]与arr[2]       arr[j]与arr[j+1]  j=1
                arr[2]与arr[3]       arr[j]与arr[j+1]  j=2        j<3
            第三轮：i=3
                arr[0]与arr[1]       arr[j]与arr[j+1]  j=0
                arr[1]与arr[2]       arr[j]与arr[j+1]  j=1        j<2
            第四轮：i=4
                arr[0]与arr[1]       arr[j]与arr[j+1]  j=0        j<1


            相邻元素：
                arr[j] arr[j+1]
             */
            for (int j = 0; j < arr.length - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);

        }
    }
}
