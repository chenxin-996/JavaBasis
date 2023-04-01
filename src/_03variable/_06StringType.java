package _03variable;

/**
 * @author: ChenXin
 * @createTime: 2022-09-04 15:18
 * @Description: 引用数据类型——字符串
 * @version: 1.0.0
 */


/**
 * 特别注意点（面试可能会问）
 * 对象、数组、字符串（对象的一种）都是引用数据类型
 * 在Java中，数组和String字符串都不是基本数据类型，它们被当作类来处理，是引用数据类型
 * 在任何语言里面都没有提供所谓的字符串这种基本数据类型
 * 所有引用类型的默认值都是null
 * <p>
 * 所谓字符串，就是一串字符，也就是N个字符连接在一起（N可以表示0或多个），0个字符称之为空字符串
 * 字符串都得使用 "" 括起来的，连接字符串使用 “+”符号
 * 字符串拼接：字符串和任意数据类型相连接，结果都是字符串类型
 */


public class _06StringType {

    public static void main(String[] args) {

        // 字符串常量
        System.out.println("abc");

        // 字符串变量
        String a = "abc";
        a = "deg";
        System.out.println(a);

        // 字符串拼接，使用 + 进行拼接
        System.out.println("abc" + a);

        String c1 = "abcde";
        String c2 = "ABCDE";
        String b = c1 + c2;
        System.out.println("拼接结果：" + b);

        System.out.println("************分隔符************");

        // 字符串与其它数据类型拼接，结果都是字符串类型。
        System.out.println(8 + "abc");

        // 打印结果为：15abc，如果存在表达式会先进行运算，只有遇到字符串之后才不会进行运算
        System.out.println(8 + 7 + "abc");

        System.out.println(8 + "abc" + 7 + 10);
        System.out.println("abc" + 8 + 7);

        String str = 17 + "abc";
        System.out.println(str);

    }

}