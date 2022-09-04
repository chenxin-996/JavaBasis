package _04JavaOperator;


/**
 * @author: ChenXin
 * @createTime: 2022-09-04 16:55
 * @Description: 三元运算符
 * @version: 1.0.0
 */

import java.util.Scanner;

/**
 * 什么是表达式？
 * 执行指定的运算，能够得出某一个特定的值，我们称这个式子为表达式
 * 得出的值为数值，是算术表达式
 * 如果得出的值是boolean  称它是逻辑表达式
 */

public class _05Ternary {

    /**
     * 三元运算符
     * 格式：逻辑表达式 ？ 表达式1 ： 表达式2
     * 如果逻辑表达式的值为true  就返回表达式1的值
     * 如果逻辑表达式的值为false 就返回表达式2的值
     */

    public static void main(String[] args) {

        //算术表达式，返回值是一个数值类型
        int a = 2 + 5;
        //逻辑表达式，返回值是一个boolean类型
        boolean t = a > 5;

        //需求：求一个数是偶数还是奇数
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入一个数：");
        int number = scanner.nextInt();

        //判断它除于2之后，有没有余数，如果余数为0就是偶数，否则就是奇数
        String result = number % 2 == 0 ? "偶数" : "奇数";
        System.out.println(result);

        //需求：从键盘任意输入3个整数，然后用条件运算符输出3个数中的最大的那个数
        Scanner scanner1 = new Scanner(System.in);
        System.out.println("请输入第一个数：");
        int number1 = scanner1.nextInt();
        System.out.println("请输入第二个数：");
        int number2 = scanner1.nextInt();
        System.out.println("请输入第三个数：");
        int number3 = scanner1.nextInt();

        int max = number1 > number2 ? (number1 > number3 ? number1 : number3) : (number2 > number3 ? number2 : number3);
        System.out.println("最大值为：" + max);

    }
}