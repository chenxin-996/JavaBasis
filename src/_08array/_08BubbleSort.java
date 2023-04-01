package _08array;

import java.util.Arrays;

/**
 * @author: ChenXin
 * @createTime: 2022-11-25 10:30
 * @Description: 冒泡排序
 * @version: 1.0.0
 */

public class _08BubbleSort {

    /**
     * 什么是冒泡排序？
     * 就是在操作数组中，对数组进行排序，不断比较数组中相邻的两个元素，较小者向上浮，较大者向下沉（反过来也可以），最后得到一个有序的序列
     * 在线动画演示地址：http://tools.jb51.net/aideddesign/paixu_ys
     */

    private static void bubbleSort(int[] array) {
        System.out.println("冒泡排序前：" + Arrays.toString(array));
        // 外层遍历，一共要遍历多少趟
        for (int j = array.length; j > 0; j--) {
            // 实现一轮数据排序，每一轮可以让其中一个元素达到最终位置
            for (int i = 1; i < array.length; i++) {
                // 两两互相比较，后面的元素要比前面的元素大
                if (array[i] < array[i - 1]) {
                    // 交换位置
                    int temp = array[i];
                    array[i] = array[i - 1];
                    array[i - 1] = temp;
                }
            }
        }

        System.out.println("冒泡排序后：" + Arrays.toString(array));
    }

    public static void main(String[] args) {
        bubbleSort(new int[]{18, 28, 12, 52, 20, 38});
    }
}