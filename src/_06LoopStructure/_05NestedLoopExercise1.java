package _06LoopStructure;

/**
 * @author: ChenXin
 * @createTime: 2022-11-11 16:36
 * @Description: 嵌套循环巩固练习一
 * @version: 1.0.0
 */

public class _05NestedLoopExercise1 {
    public static void main(String[] args) {

        //用*打印一个长方形，最原始的方法

//        System.out.println("************");
//        System.out.println("************");
//        System.out.println("************");

        //单层循环的方法
        for (int k = 1; k <= 12; k++) {
            System.out.print("*");
        }
        System.out.println();

        for (int k = 1; k <= 12; k++) {
            System.out.print("*");
        }
        System.out.println();

        for (int k = 1; k <= 12; k++) {
            System.out.print("*");
        }
        System.out.println();

        System.out.println("****************************分隔符****************************");

        //使用嵌套循环进行优化
        for (int k = 1; k <= 3; k++) {
            for (int j = 1; j <= 12; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        System.out.println("****************************分隔符****************************");

        //用*打印一个直角三角形，最原始的方法
//        System.out.println("*");
//        System.out.println("**");
//        System.out.println("****");
//        System.out.println("*****");
//        System.out.println("******");

        //单层循环的方法
        for (int i = 1; i <= 1; i++) {
            System.out.print("*");
        }
        System.out.println();

        for (int i = 1; i <= 2; i++) {
            System.out.print("*");
        }
        System.out.println();

        for (int i = 1; i <= 3; i++) {
            System.out.print("*");
        }
        System.out.println();

        for (int i = 1; i <= 4; i++) {
            System.out.print("*");
        }
        System.out.println();

        for (int i = 1; i <= 5; i++) {
            System.out.print("*");
        }
        System.out.println();

        System.out.println("****************************分隔符****************************");

        //使用嵌套循环进行优化

        //外层循环用于控制打印行数
        for (int j = 1; j <= 5; j++) {
            //内层循环用于打印每一行*的个数
            for (int i = 1; i <= j; i++) {
                System.out.print("*");
            }
            System.out.println();
        }

    }
}