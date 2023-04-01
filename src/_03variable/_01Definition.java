package _03variable;

/**
 * @author: ChenXin
 * @createTime: 2022-09-04 11:58
 * @Description: Java变量的定义
 * @version: 1.0.0
 */

/**
 * 什么是变量？
 * 其值可以发生改变的量，定义完毕后可以指代某一个事物
 * <p>
 * 格式：
 * 数据类型  变量名  =  初始化值；
 * <p>
 * 特点：
 * 1.占据着内存中的某一块存储区域
 * 2.该区域有自己的名称（变量名）和类型（数据类型）
 * 3.可以被重复使用
 * 4.该区域的数据可以在同一类型范围内不断变化
 */
public class _01Definition {

    public static void main(String[] args) {
        // 需求：求两个数的加减乘除
        System.out.println(20 + 10);
        System.out.println(20 - 10);
        System.out.println(20 * 10);
        System.out.println(20 / 10);
        // 这样写有一个问题，当值要改变的时候，需要改4个地方

        System.out.println("************分隔符************");

        // 针对以上问题，我们可以使用变量
        // 数据类型   变量名(自己起的名称) =  变量值（指代某一个事物）;
        int a = 20;
        int b = 10;
        System.out.println(a + b);
        System.out.println(a - b);
        System.out.println(a * b);
        System.out.println(a / b);

        System.out.println("************分隔符************");

        // 可以不改变名称只改变数值
        a = 60;
        b = 20;
        System.out.println(a + b);
        System.out.println(a - b);
        System.out.println(a * b);
        System.out.println(a / b);

        System.out.println("************分隔符************");


        // 使用变量的注意事项
        int c = 5;
        // 1.不能定义两个相同名称的变量
        // int a = 10;
        System.out.println(c);

        // 2.定义一个变量，没有让它指向一个事物（没有初始化），没有初始化的变量是不能直接使用
        int d;
        // System.out.println(d);

        // 3.在使用变量之前必须得要初始化
        d = 30;
        System.out.println(d);
    }

}