package _04JavaOperator;

/**
 * @author: ChenXin
 * @createTime: 2022-09-04 16:36
 * @Description: 比较运算符
 * @version: 1.0.0
 */


/**
 * ==   相等于
 * !=   不等于
 * <    小于
 * >    大于
 * <=   小于等于
 * >=   大于等于
 * <p>
 * 比较运算符用于比较两个变量或常量之间的关系
 * 其操作格式为：boolean  result = 表达式A   比较运算符   表达式B;
 * 比较运算符的结果是一个布尔类型boolean
 */

public class _03Compare {

    public static void main(String[] args) {

        int a = 10;
        int b = 11;

        //true
        System.out.println(a == a);
        //false
        System.out.println(a > b);
        //true
        System.out.println(a < b);
        //true
        System.out.println(a <= a);
        // true
        System.out.println(b >= a);
        //false
        System.out.println(a != a);
    }

}