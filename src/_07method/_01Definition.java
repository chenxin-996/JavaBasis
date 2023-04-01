package _07method;

/**
 * @author: ChenXin
 * @createTime: 2022-11-11 20:58
 * @Description: 方法的定义
 * @version: 1.0.0
 */

public class _01Definition {

    /**
     * 什么是方法？
     * Java方法是语句的集合，它们在一起执行一个功能
     * 可以理解为方法就是一段可以重复调用的代码
     * <p>
     * 方法的优点
     * 1.使程序变得更简短而清晰
     * 2.有利于程序维护
     * 3.可以提高程序开发的效率
     * 4.提高了代码的重用性
     */

    private static void method() {
        System.out.println("HelloWord");
        System.out.println("HelloWord");
        System.out.println("HelloWord");
    }

    /**
     * main方法，程序的主入口
     */
    public static void main(String[] args) {

        // 观察一下代码，发现问题
        System.out.println(123);
        System.out.println("HelloWord");
        System.out.println("HelloWord");
        System.out.println("HelloWord");

        System.out.println(666);
        System.out.println("HelloWord");
        System.out.println("HelloWord");
        System.out.println("HelloWord");
        System.out.println(999);

        System.out.println("AAA");
        System.out.println("HelloWord");
        System.out.println("HelloWord");
        System.out.println("HelloWord");
        System.out.println("ABC");

        System.out.println("==========分隔符==========");

        // 存在重复代码，但是发现循环语句已经不能实现以上代码，无规律，此时就可以使用方法解决

        System.out.println(123);
        method();

        System.out.println(666);
        method();
        System.out.println(999);

        System.out.println("AAA");
        method();
        System.out.println("ABC");
        // 效果同上
    }

}