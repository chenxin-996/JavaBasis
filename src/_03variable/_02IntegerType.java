package _03variable;

/**
 * @author: ChenXin
 * @createTime: 2022-09-04 12:06
 * @Description: 变量的基本数据类型——整数类型
 * @version: 1.0.0
 */

/**
 * 数据类型的概念：
 * 在为变量赋值的时候必须赋予和变量同一种类型的值，否则程序会报错
 * 变量的本质：是在内存当中开辟了一块空间，专门给你存指定值
 * 数据类型规定，内存空间当中只能存放什么类型的数据
 * <p>
 * 整数类型有哪些？
 * 整数类型包括byte、short、int、long
 * 有什么区别？
 * 相同点都是存放整数类型的数据，不同点是开辟的空间大小不一样
 */

public class _02IntegerType {

    public static void main(String[] args) {

        int age = 18;
        System.out.println(age);
        age = 20;
        System.out.println(age);

        // 会报错
        // age = 10.5;

        // byte  8位（一个字节）
        byte b = 30;

        // 会报错，超出数据类型的范围
        // b = 128;

        // short  16位（两个字节）
        short c = 32767;

        // int  32位（四个字节）
        int d = 324;

        /**
         * 通常情况下，使用long类型时要在所赋值的后面加上一个字母L（或小写l）
         * 但因小写的l容易和数字1相混淆，建议使用大写L，说明赋值类型为long类型
         * 如果未超出int类型时，则可以省略字母L（或小写l）
         */

        // long  64位（八个字节）
        long e = 68978L;
        long f = 68978;

        // 所赋的值超出int类型，必须在后面加上字母L（或小写l），否则会报错
        long g = 12345678901L;

        // 默认情况下，一个整型的字面量默认是int类型
        System.out.println(100);

        int h = 4;
        h = h + 4;
        System.out.println(h);
    }
}