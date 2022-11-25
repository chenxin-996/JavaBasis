package _08Array;

import java.util.Arrays;
/**
 * @author: ChenXin
 * @createTime: 2022-11-25 10:36
 * @Description: 选择排序
 * @version: 1.0.0
 */

public class _09SelectionSort {

    /**
     * 什么是选择排序？
     * 1.默认把数组中角标为0的元素当作最小，记录起来
     * 2.与后续所有元素进行比较
     * 3.选择出最小的元素
     * 4.把最小的数值跟第0个角标的元素进行交换
     * 5.依次往重复进行，当第二次变量出来最小的元素时应该与角标为1的进行置换，以此类推
     */

    private static void selectionSort(int[] array) {
        //1.定义一个变量，记录最小值的角标
        int min;
        for (int j = 0; j < array.length; j++) {
            min = j;
            //2.与后续所有元素进行比较
            for (int i = j + 1; i <= array.length - 1; i++) {
                //3.选择出最小的元素
                if (array[i] < array[min]) {
                    min = i;
                }
            }
            //4.把最小的数值跟第0个角标的元素进行交换
            int temp = array[j];
            array[j] = array[min];
            array[min] = temp;
        }
        System.out.println(Arrays.toString(array));
    }

    public static void main(String[] args) {
        //测试输出
        selectionSort(new int[]{10, 30, 28, 12, 52, 2, 88, 61, 8, 38});
    }
}