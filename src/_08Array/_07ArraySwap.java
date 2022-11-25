package _08Array;

import java.util.Arrays;

/**
 * @author: ChenXin
 * @createTime: 2022-11-25 10:25
 * @Description: 数组元素的交换
 * @version: 1.0.0
 */

public class _07ArraySwap {

    /**
     * 对一个数组中的两个元素进行位置互换
     * 例如：[10,20]改成[20,10]
     * <p>
     * 思路：
     * 1.先把第一个元素取出来，临时存起来
     * 2.把第二个元素赋值给第一个元素的位置
     * 3.再把临时存起来的元素赋值给第二个元素
     */

    private static void changeArray() {
        //声明一个数组
        int[] numbers = {10, 20};
        //打印初始状态
        System.out.println(Arrays.toString(numbers));
        //把角标为0的元素取出来，临时存起来
        int temp = numbers[0];
        //把角标为1的元素赋值给角标为0的元素
        numbers[0] = numbers[1];
        //再把临时存起来的元素赋值给角标为1的元素
        numbers[1] = temp;
        //打印交换结果
        System.out.println(Arrays.toString(numbers));
    }

    public static void main(String[] args) {
        changeArray();
    }
}