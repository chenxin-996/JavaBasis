package _07Method;

/**
 * @author: ChenXin
 * @createTime: 2022-11-11 21:20
 * @Description: 方法的重载
 * @version: 1.0.0
 */

public class _04方法的重载 {

    /**
     * 需求：
     * 求两个数的和，功能相同，参数类型是不同的，定义了两个方法名称
     * 什么是方法的重载？
     * 在同一个类中，允许方法名称相同，但是方法的参数必须不同（包括以下几种情况）
     * 1.参数的个数不同
     * 2.参数的类型不同
     * 3.参数的排列顺序不同
     * 方法的重载解决了功能相同，参数类型不同的问题，就不需要定义多个方法名称了
     * <p>
     * 方法的重载与返回值类型无关
     * 仅仅返回类型不同不足以称为方法的重载
     */

    static int sum(int a, int b) {
        return a + b;
    }

    static double sum(double a, double b) {
        return a + b;
    }

    static double sum(int a, double b) {
        return a + b;
    }

    static double sum(double a, int b) {
        return a + b;
    }

    static int sum(int a, int b, int c) {
        return a + b + c;
    }

    public static void main(String[] args) {
        //两个整数和
        System.out.println(sum(12, 28));

        //两个小数和
        System.out.println(sum(12.28, 28.12));

        //一个整数与一个小数和
        System.out.println(sum(12, 28.12));

        //一个小数与一个整数和
        System.out.println(sum(12.28, 28));

        //三个数之和
        System.out.println(sum(12, 28, 52));

        //传入参数时，程序会自动调用参数类型与之匹配的方法

    }
}