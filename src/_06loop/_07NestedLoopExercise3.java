package _06loop;

/**
 * @author: ChenXin
 * @createTime: 2022-11-11 18:35
 * @Description: 嵌套循环巩固练习三
 * @version: 1.0.0
 */

public class _07NestedLoopExercise3 {
    public static void main(String[] args) {

        /**
         * 打印一个等腰三角形
         * 思路：
         * - 表示空格
         * 第一行：----*
         * 第二行：---***
         * 第三行：--*****
         * 第四行：-*******
         * 第五行：*********
         * 规律如下
         * *的个数为：（行数 * 2）- 1
         * -的个数为：（总行数 - 当前行数）
         */

        // 最直接的方法
        // System.out.println("    *");
        // System.out.println("   ***");
        // System.out.println("  *****");
        // System.out.println(" *******");
        // System.out.println("*********");

        System.out.println("****************************分隔符****************************");

        // 使用单层循环，无规律的方法
        for (int i = 0; i < 4; i++) {
            System.out.print(" ");
        }
        System.out.print("*");
        System.out.println();

        for (int i = 0; i < 3; i++) {
            System.out.print(" ");
        }
        System.out.print("*");
        System.out.print("*");
        System.out.print("*");
        System.out.println();

        for (int i = 0; i < 2; i++) {
            System.out.print(" ");
        }
        System.out.print("*");
        System.out.print("*");
        System.out.print("*");
        System.out.print("*");
        System.out.print("*");
        System.out.println();

        for (int i = 0; i < 1; i++) {
            System.out.print(" ");
        }
        System.out.print("*");
        System.out.print("*");
        System.out.print("*");
        System.out.print("*");
        System.out.print("*");
        System.out.print("*");
        System.out.print("*");
        System.out.println();

        for (int i = 0; i < 0; i++) {
            System.out.print(" ");
        }
        System.out.print("*");
        System.out.print("*");
        System.out.print("*");
        System.out.print("*");
        System.out.print("*");
        System.out.print("*");
        System.out.print("*");
        System.out.print("*");
        System.out.print("*");
        System.out.println();

        System.out.println("****************************分隔符****************************");

        // 使用单层循环进一步优化
        for (int i = 0; i < 4; i++) {
            System.out.print(" ");
        }
        int line = 1;
        for (int j = 0; j < (line * 2) - 1; j++) {
            System.out.print("*");
        }
        line++;
        System.out.println();

        for (int i = 0; i < 3; i++) {
            System.out.print(" ");
        }
        for (int j = 0; j < (line * 2) - 1; j++) {
            System.out.print("*");
        }
        line++;
        System.out.println();

        for (int i = 0; i < 2; i++) {
            System.out.print(" ");
        }
        for (int j = 0; j < (line * 2) - 1; j++) {
            System.out.print("*");
        }
        line++;
        System.out.println();

        for (int i = 0; i < 1; i++) {
            System.out.print(" ");
        }
        for (int j = 0; j < (line * 2) - 1; j++) {
            System.out.print("*");
        }
        line++;
        System.out.println();

        for (int i = 0; i < 0; i++) {
            System.out.print(" ");
        }
        for (int j = 0; j < (line * 2) - 1; j++) {
            System.out.print("*");
        }

        System.out.println("****************************分隔符****************************");

        // 使用嵌套循环进行优化
        int lineNumber = 1;
        for (int k = 0; k < 5; k++) {
            for (int i = 0; i < 5 - lineNumber; i++) {
                System.out.print(" ");
            }
            for (int j = 0; j < (lineNumber * 2) - 1; j++) {
                System.out.print("*");
            }
            lineNumber++;
            System.out.println();
        }

        System.out.println("****************************分隔符****************************");

        /**
         * 自定义大小等边三角形
         * totalLine：总行数
         * k：当前行数
         * i：打印空格的个数
         * j：打印*的个数
         */
        int totalLine = 10;
        for (int k = 1; k <= totalLine; k++) {
            // 打印每行空格的个数  = 总行数 – 行号
            for (int i = 1; i <= totalLine - k; i++) {
                System.out.print(" ");
            }
            // 打印每行*的个数 = 当前所在的行数 * 2 - 1
            for (int j = 1; j <= (k * 2) - 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

    }
}