package _04JavaOperator;

/**
 * @author: ChenXin
 * @createTime: 2022-09-04 16:38
 * @Description: 逻辑运算符
 * @version: 1.0.0
 */

/**
 * 逻辑运算符用于对布尔类型的数据进行操作，其结果都为布尔类型
 * 与（&）
 * 或（|）
 * 非（!）
 * 异或（^）
 * 短路与(&&)
 * 短路或(||)
 */

public class _04Logic {

    public static void main(String[] args) {

        /**
         * 1.与（&）
         * 格式：逻辑表达式1  &  逻辑表达式2
         * 结果：两个表达结果有一个为false，那么与的结果就为false
         *       两个表达式的结果都为true，那么与的结果才为true
         * 简记：一假则假
         */

        //true
        System.out.println(true & true);
        //false
        System.out.println(true & false);
        //false
        System.out.println(false & true);
        //false
        System.out.println(false & false);

        System.out.println("*****************************分隔符*****************************");

        /**
         * 2.或（|）
         * 格式：逻辑表达式1  |  逻辑表达式2
         * 结果：如果两个表达式结果有一个为true，那么结果就为true
         *       只有当两个结果都为false时，那么或的结果才为false
         * 简记：一真则真
         */

        //true
        System.out.println(true | true);
        //true
        System.out.println(true | false);
        //true
        System.out.println(false | true);
        //false
        System.out.println(false | false);

        System.out.println("*****************************分隔符*****************************");

        /**
         * 3.异或（^）
         * 格式：逻辑表达式1  ^  逻辑表达式2
         * 结果：表达式结果相同时为false，不同时为true
         */

        //false
        System.out.println(true ^ true);
        //true
        System.out.println(true ^ false);
        //true
        System.out.println(false ^ true);
        //false
        System.out.println(false ^ false);

        System.out.println("*****************************分隔符*****************************");

        /**
         * 4.非（!）
         * 格式：！逻辑表达式
         * 结果：对一个布尔类型取反操作
         */

        //false
        System.out.println(!true);
        //true
        System.out.println(!false);

        System.out.println("*****************************分隔符*****************************");

        /**
         * 5.短路与(&&)
         * 格式：逻辑表达式1   &&  逻辑表达式2
         * 结果：如果两个表达结果有一个为false，那么与的结果就为false
         *       两个表达式的结果都为true，那么与的结果才为true
         * 简记：一假则假
         * & 与 && 的区别是什么？
         * &   两边的表达式无论结果怎么样，都会执行
         * &&  只要发现了第一个逻辑表达式为false，就不会再去执行后面的表达式，效率更高
         */

        //区别案例
        int a = 5;
        //false（会报错）
        System.out.println(a > 5 & 1 == 1 / 0);
        //false（不会报错）
        System.out.println(a > 5 && 1 == 1 / 0);

        System.out.println("*****************************分隔符*****************************");

        /**
         * 6.短路或（||）
         * 格式：逻辑表达式1  ||  逻辑表达式2
         * 结果：如果两个表达式结果有一个为true，那么结果就为true
         *       只有当两个结果都为false时，那么或的结果才为false
         * 简记：一真则真
         * | 与 || 的区别是什么？
         * |   两边的表达式无论结果怎么样，都会执行
         * ||  只要发现了第一个逻辑表达式为true，就不会再去执行后面的表达式，效率更高
         */

        int b = 12;
        //true（会报错）
        System.out.println(b > 5 | 1 == 1 / 0);
        //true（不会报错）
        System.out.println(b > 5 || 1 == 1 / 0);

        //在实际开发过程中，通常都会使用&&和||
    }

}