package cn.itcast08.exer.param;

public class ArraysToolsTest {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4, 5};

        ArrayTools tools = new ArrayTools();
        System.out.println("扩大之前，nums数组：");
        System.out.println(tools.toString(nums));

        // 把nums扩大为原来的2倍
        nums = tools.grow(nums);

        System.out.println("扩大之后，nums数组：");
        System.out.println(tools.toString(nums));
    }
}
