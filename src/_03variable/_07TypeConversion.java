package _03variable;

/**
 * @author: ChenXin
 * @createTime: 2022-09-04 15:35
 * @Description: Java变量的类型转换
 * @version: 1.0.0
 */


/**
 * 什么叫变量的类型转换？
 * 把一种类型赋值给另外一种类型
 * <p>
 * 数据类型转换分两种：
 * 1、自动类型转换
 * 2、强制类型转换
 * <p>
 * 原则：
 * 不能（直接）把一个大的数据类型赋值给小的数据类型
 * <p>
 * 1个字节(byte)等于8个比特(bit)
 * 8个基本的数据类型（单位：位/比特）
 * ------------------------------------------
 * 整数  byte->8    short->16    int->32     long->64
 * 小数  float->32  double->64
 * 字符  char->16
 * 布尔  boolean ->8
 */


public class _07TypeConversion {

    /**
     * 什么是自动类型转换？
     * 在转换过程中不需要显式地进行声明
     * 把一个小的类型赋值给大的类型
     */
    public static void main(String[] args) {

        // 4个字节32位
        int a = 200;
        // 1个字节8位（-128~127）
        byte b = 2;
        // 8个字节64位
        long c = 100L;

        // 把b的内容赋值给a，可以赋值
        // a = b;

        // 把a的内容赋值给b，是不能直接赋值的，不能直接把一个大的类型赋值给小的类型

        // 不能赋值
        // b = a;

        // 可以赋值
        c = a;

        /**
         * 什么是强制类型转换？
         * 在转换过程中需要显式地进行声明
         * 从大的数据类型转为小的数据类型
         * <p>
         * 格式：
         * 目标数据类型 变量 = (目标数据类型) (被转换的数据);
         * <p>
         * 注意：不要随意的去使用强制转换，因为它隐含了精度损失问题
         * 强制数据类型转换，不建议使用，因为会造成数据的“溢出”，造成数据的不正确性
         */

        b = (byte) a;
        // 运行结果：1010.5，精度丢失
        System.out.println(b);

        System.out.println("******************************分隔符******************************");

        int h = 1000;
        short i = 28;
        byte j = 5;
        double k = 10.5;
        // A-65  a-97
        char l = 'A';
        boolean m = true;

        /**
         * 1.运算时，运算两端的数据类型必须得要保持一致
         * 2.如果运算都为数值类型，会自动的把小的类型转换为大的类型（自动类型转换）
         * 3.JVM在运算时，识别的最小数值类型为int，小于int会自动提升为int类型
         */

        // 两端的数据类型未保持一致，编译错误
        // boolean isTrue = i + m;

        // 自动提升为double类型
        double k2 = h + k;
        System.out.println(k2);

        // JVM在运算时，识别的最小数值类型为int，小于int会自动提升为int类型，所有的byte、short、char类型被自动提升到int类型

        // 编译错误
        // short i2 = i + (short)j;

        // 编程成功
        int i2 = (int) i + (int) j + h;

        System.out.println(i2);

        short s2 = (short) (i + j);
        System.out.println(s2);

        // char类型在运算时自动提升为int类型
        System.out.println(l + h);

    }

}