package _03JavaVariable;

/**
 * @author: ChenXin
 * @createTime: 2022-09-04 12:20
 * @Description: 基本数据类型——字符类型
 * @version: 1.0.0
 */

/**
 * 字符本质是16位无符号小数，字符类型会占用两个字节，用char表示
 * 在给char类型赋值是，需要用英文单引号 '' 把字符括起来
 */

public class _04CharType {
    public static void main(String[] args) {

        //字符类型
        System.out.println('A');

        //字符型变量
        char c = 'A';
        c = 'B';
        System.out.println(c);
        c = '◆';
        System.out.println(c);

        //ASSIC编码字符类型
        char d = 67;
        System.out.println(d);

        //不可以直接使用，语法错误
        //System.out.println('67');

        //直接输出的是int类型
        System.out.println(65);

    }

}