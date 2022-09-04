package _04JavaOperator;

/**
 * @author: ChenXin
 * @createTime: 2022-09-04 16:08
 * @Description: 算术运算符
 * @version: 1.0.0
 */

/**
 * +    正号
 * -    负号
 * +    加
 * -    减
 * *    乘
 * /    除
 * %    取模（即算数中的求余数）
 * ++   自增
 * --   自减
 */

public class _01Arithmetic {

    public static void main(String[] args) {

        System.out.println((+10) + 20);
        System.out.println((-10) + 20);

        System.out.println(10 + 20);
        System.out.println(10 - 20);
        System.out.println(10 * 20);
        System.out.println(10 / 20);

        //当除数和被除数都为整数时，得到的结果也会是一个整数，如果有小数参与，得到结果会是一个小数，整数相除会忽略小数部分

        //2
        System.out.println(2510 / 1000);
        //0.25
        System.out.println(2.5 / 10);

        //使用 % 进行运算时，运算结果的正负取决于被摸数（%左边的数）的符号
        //-1
        System.out.println(-10 % -3);

        //如果一个数模于比它大的数，那么结果为本身
        //1
        System.out.println(1 % -3);

        //在字符串相加时，+ 代表的是拼接
        System.out.println("aaa" + "bbb");

        //字符相加则是转为ascll码进行相加
        //162
        System.out.println('a' + 'A');
        //162
        System.out.println('a' + 65);

        //整数的除数不能为0，否则在运算时，会有异常发生
        //java.lang.ArithmeticException: / by zero
        //System.out.println(100/0);

        //Infinity，表示无限大
        System.out.println(100.0 / 0);
        //-Infinity
        System.out.println(-100.0 / 0);

        //NaN（Not a Number）
        System.out.println(0.0 / 0.0);

        System.out.println("********************************自增自减运算********************************");

        /**
         * 用法：必须得要使用在变量的前后，切记常量是不能自增自减的
         * 作用：表示当前操作的变量自己累加1 或 累减1
         *  ++ 或 -- 写在变量前后的区别？
         *  1.如果不参与运算的话，它们是没有区别
         *  2.如果参与了运算，区别就是很大了
         *  累加的结果要不要参与本次的运算（使用累加之后值运算，还是使用累加之前的值进行运算）
         *  a++的结果，不参与本次运算（使用变量的原始值进行运算）
         *  ++a的结果，要参与本次运算（使用累加之后的值进行运算）
         *  a-- 与 --a 原理同上
         *  无论是前面还是后面，都会对变量值进行累加
         */

        int a = 10;
        //a++;  等价于 a = a + 1;
        a++;
        System.out.println(a);
        ++a;
        a--; // a =  a - 1;
        --a;
        System.out.println(a);

        //不能直接使用，必须得要使用在变量的前后
        //10++;这样写会报错

        int c = 10;
        int b = c++;
        System.out.println(b);//10
        System.out.println(c);//11

        int d = 20;
        int f = ++d;
        System.out.println(f); //21
        System.out.println(d); //21

        System.out.println("********************************自增自减练习********************************");

        int num1 = 1;
        int res1 = (num1++) + 5 + num1;
        //              1    + 5 +  2
        //此时num1等于2
        System.out.println(num1);
        //结果为8
        System.out.println(res1);

        int num2 = 10;
        int res2 = ++num2 + 5 + num2--;
        //            11  + 5 +  11
        //此时num2等于10
        System.out.println(num2);
        //结果为27
        System.out.println(res2);

        int num3 = 12;
        int res = (++num3) + (num3--) + 5 + (num3++) + (--num3) + num3;
        //           13    +    13    + 5 +    12    +    12    +  12
        //此时num等于12
        System.out.println(num3);
        //结果为67
        System.out.println(res);
    }

}