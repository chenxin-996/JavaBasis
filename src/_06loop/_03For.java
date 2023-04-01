package _06loop;

/**
 * @author: ChenXin
 * @createTime: 2022-11-11 16:25
 * @Description: for循环语句
 * @version: 1.0.0
 */

public class _03For {

    /**
     * 语法格式
     * for(初始化的语句; 逻辑表达式（循环条件）; 循环之后的操作语句)｛
     * 循环体
     * ｝
     * <p>
     * 执行顺序
     * 1.初始化的语句(只会执行一次)
     * 2.执行逻辑表达式
     * true: 执行循环体
     * false: 跳过循环
     * 3.如果为true，执行循环体
     * 4.执行循环体之后的操作语句
     * 5.进入到第二次循环继续判断
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

        // 为了提高开发效率通常对重复的代码使用循环结构语句，for循环是最常见的循环结构

        // 分行写可debug，更形象直观地理解for循环
        for (int i = 1;
             i <= 10;
             i++) {
            System.out.println(i);
        }

        /**
         * 执行过程：
         * for（ 1; 2; 3 ）{
         *      4
         * }
         * 第一步：执行1
         * 第二步：执行2，如果判断条件为true，执行4，如果判断结果为false，退出循环
         * 第三步：执行3，然后重复执行第二步
         * 第四步：退出循环
         */

        System.out.println("****************************分隔符****************************");

        // 打印1-100的累计和
        int total = 0;
        for (int j = 1; j <= 100; j++) {
            total += j;
        }

        System.out.println(total);
    }
}