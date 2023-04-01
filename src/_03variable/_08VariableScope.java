package _03variable;

/**
 * @author: ChenXin
 * @createTime: 2022-09-04 15:55
 * @Description: Java变量的作用域
 * @version: 1.0.0
 */

public class _08VariableScope {

    private static void test() {
        int a = 10;
        System.out.println(a);
    }

    // 此时不能在使用变量a，原因是作用域超出，作用域可以理解为一对花括号{}
    // System.out.println(a);

    public static void main(String[] args) {

        // 静态方法只能调用静态方法
        test();

        // 在方法内部定义的变量，跟外界没有任何关系，因此，这里还可以再定义变量a
        int a = 100;
        System.out.println(a);

        // 打开下面的注释，下面代码块中的b会报错
        // int b =20;

        // 代码块，使用花括号括起来的就叫代码块
        {
            int b = 20;
            System.out.println(b);
        }

        // b经过大括号作用域就就失效，因此还可以定义变量b
        int b = 30;
        // 但是这个b放在代码块前面就会报错，自己悟
    }
}