package _06loop;

/**
 * @author: ChenXin
 * @createTime: 2022-11-11 16:42
 * @Description: 嵌套循环巩固练习二
 * @version: 1.0.0
 */

public class _06NestedLoopExercise2 {
    public static void main(String[] args) {

        /**
         * 打印九九乘法表
         * 原理是跟打印直角三角形的原理一样
         * 1*1=1
         * 1*2=2	2*2=4
         * 1*3=3	2*3=6	3*3=9
         * 1*4=4	2*4=8	3*4=12	4*4=16
         */

        // 最原始的方法
        // System.out.println("1*1=1");
        // System.out.println("1*2=2	2*2=4");
        // System.out.println("1*3=3	2*3=6	3*3=9");
        // System.out.println("1*4=4	2*4=8	3*4=12	4*4=16");

        // 单层循环的方法
        int j = 1;
        for (int i = 1; i <= 1; i++) {
            System.out.print(i + "*" + j + "=" + (i * j) + "\t");
        }
        j++;
        System.out.println();

        for (int i = 1; i <= 2; i++) {
            System.out.print(i + "*" + j + "=" + (i * j) + "\t");
        }
        j++;
        System.out.println();

        for (int i = 1; i <= 3; i++) {
            System.out.print(i + "*" + j + "=" + (i * j) + "\t");
        }
        j++;
        System.out.println();

        for (int i = 1; i <= 4; i++) {
            System.out.print(i + "*" + j + "=" + (i * j) + "\t");
        }
        System.out.println();

        System.out.println("****************************分隔符****************************");

        // 使用嵌套循环进行优化
        for (int line = 1; line <= 9; line++) {
            for (int i = 1; i <= line; i++) {
                System.out.print(i + "*" + line + "=" + (i * line) + "\t");
            }
            System.out.println();
        }

    }
}