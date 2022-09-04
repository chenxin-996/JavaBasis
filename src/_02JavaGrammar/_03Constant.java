package _02JavaGrammar;

/**
 * @author: ChenXin
 * @createTime: 2022-09-04 11:49
 * @Description: Java常量
 * @version: 1.0.0
 */

/**
 * 什么是常量？
 * 常量就是在程序中固定不变的值，是不能改变的数据
 * <p>
 * 常量包括哪些？
 * 1.整型常量
 * 2.浮点数常量
 * 3.字符常量
 * 4.字符串常量
 * 5.布尔常量
 * 6.null常量
 */
public class _03Constant {
    public static void main(String[] args) {
        //1.整型常量
        System.out.println(12);

        //2.浮点数常量
        System.out.println(12.28);

        //3.字符常量 ,在单引号当中只能包含一个字符
        System.out.println('A');

        //4.字符串常量
        System.out.println("HelloWord");

        //5.布尔类型常量  false：假  true:真
        System.out.println(false);

        //6.null常量
        //System.out.println(null);
    }
}