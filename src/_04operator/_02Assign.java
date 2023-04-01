package _04operator;

/**
 * @author: ChenXin
 * @createTime: 2022-09-04 16:26
 * @Description: 赋值运算符
 * @version: 1.0.0
 */

public class _02Assign {

    public static void main(String[] args) {
        int a = 10;

        // a += 1; 等同于 a = a + 1;
        // a -= 1; 等同于 a = a - 1;
        // a *= 2; 等同于 a = a * 2;
        // a /= 5; 等同于 a = a / 5;

        // a = a % (-3);
        a %= (-3);
        System.out.println(a);

        // 赋值运算符与算术运算符的区别是什么？赋值运算符中强制类型转换会自动实现类型转换
        byte s = 5;

        // 会报错，需要显式地声明强制类型转换
        // s = (s + 125);
        s = (byte) (s + 125);

        // 使用赋值运算符，会自动进行强制性转换
        // 等同于s = (short)(s + 1255);
        s += 1255;

        System.out.println(s);
    }

}