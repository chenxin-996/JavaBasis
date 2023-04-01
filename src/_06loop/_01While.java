package _06loop;

/**
 * @author: ChenXin
 * @createTime: 2022-11-11 16:28
 * @Description: while循环语句
 * @version: 1.0.0
 */

public class _01While {

    /**
     * 语法格式
     * while(逻辑表达式)｛
     * 循环体（要重复执行的代码）
     * ｝
     * 只有满足条件时，才会执行循环体
     * 也就是逻辑表达式为真时，去才执行循环体，直到循环条件为false时，整个循环条件才会结束
     * 什么是死循环？
     * 就是逻辑表达式的结果一直都为true
     */

    public static void main(String[] args) {

        // 打印数字1-10，最原始的方法

//        System.out.println("1");
//        System.out.println("2");
//        System.out.println("3");
//        System.out.println("4");
//        System.out.println("5");
//        System.out.println("6");
//        System.out.println("7");
//        System.out.println("8");
//        System.out.println("9");
//        System.out.println("10");

        System.out.println("****************************分隔符****************************");

        // 为了提高开发效率，通常会对重复的代码进行优化
        int i = 1;
        while (i <= 10) {
            System.out.println(i);
            i++;
        }

        System.out.println("****************************分隔符****************************");

        // 死循环
        // int i = 1;
        // while (true) {
        //     System.out.println(i);
        //     i++;
        // }

        // 打印1-100的累计和
        int j = 0;
        int total = 0;
        while (j <= 100) {
            total += j;
            j++;
        }
        System.out.println(total);
    }
}