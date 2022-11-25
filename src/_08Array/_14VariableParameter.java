package _08Array;

/**
 * @author: ChenXin
 * @createTime: 2022-11-25 11:16
 * @Description: 语法糖-可变参数的使用
 * @version: 1.0.0
 */

public class _14VariableParameter {


    //需求：求两个数的和
    private static void sum(int a, int b) {
        System.out.println(a + b);
    }

    //需求：求三个数的和
    private static void sum(int a, int b, int c) {
        System.out.println(a + b + c);
    }

    //需求：求四个数的和
    private static void sum(int a, int b, int c, int d) {
        System.out.println(a + b + c + d);
    }

    /**
     * 这样写没有错误，但是需求改为六个数、七个数、十个数的和来呢？
     * 使用方法的重载这种办法来解决显然不妥
     * 此时，我们可以把数组当做方法的参数来解决问题
     */
    private static void total(int[] array) {
        int result = 0;
        for (int i : array) {
            result += i;
        }
        System.out.println(result);
    }

    /**
     * 对于上面的方法还有另外一种写法，就是使用可变参数
     * 什么是可变参数？
     * 方法定义中可以使用个数是不确定的参数，可变参数是数组参数的一种简写，会自动把...转成数组
     * 以下写法通过反编译工具可查看出可变参数跟上面的total方法是一样的
     * <p>
     * 那可变参数与普通的数组参数有什么区别呢？
     * 虽然通过反编译工具查看源码为一样的，但是，可变参数它不仅可以传入数组，还可以传入对应的数值
     */
    private static void totals(int... array) {
        int result = 0;
        for (int i : array) {
            result += i;
        }
        System.out.println(result);
    }

    public static void main(String[] args) {

        sum(10, 20);
        sum(10, 20, 30);
        sum(10, 20, 30, 40);

        //把数组当做参数，现在你想求几个数的和就能求几个数的和
        total(new int[]{10, 20, 30, 40, 50});

        //可变参数，数组可当作参数传递
        totals(new int[]{10, 20, 30, 40, 50, 60});
        //还可以这样写，直接传入对应的数值，结果是一样的
        totals(10, 20, 30, 40, 50, 60);
        //可变参数是数组参数的一种简写，会自动把...转成数组

    }
}