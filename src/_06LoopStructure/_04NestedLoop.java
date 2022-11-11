package _06LoopStructure;

/**
 * @author: ChenXin
 * @createTime: 2022-11-11 16:28
 * @Description: 嵌套循环
 * @version: 1.0.0
 */

public class _04NestedLoop {
    /**
     * 什么是嵌套循环？
     * 嵌套循环就是在一个循环体中再定义一个循环体的语法结构
     * <p>
     * while、do...while、for循环语句都可以进行嵌套，其中最常见的是for循环嵌套
     * 循环就是帮我们解决重复代码问题
     * <p>
     * 格式：
     * for(初始化表达式;循环条件;操作表达式){
     * 执行语句1
     * for(初始化表达式;循环条件;操作表达式){
     * 执行语句2
     * }
     * }
     */
    public static void main(String[] args) {

        //打印三个1，然后在后面打印10个*，接着打印三个2，如此按顺序反复，最原始的方法
        System.out.println(1);
        System.out.println(1);
        System.out.println(1);
        System.out.println("**********");
        System.out.println(2);
        System.out.println(2);
        System.out.println(2);
        System.out.println("**********");
        System.out.println(3);
        System.out.println(3);
        System.out.println(3);
        System.out.println("**********");

        System.out.println("****************************分隔符****************************");

        //对于这种情况也可以使用单层循环语句
        for (int i = 1; i <= 3; i++) {
            System.out.println(1);
        }
        System.out.println("**********");

        for (int i = 1; i <= 3; i++) {
            System.out.println(2);
        }
        System.out.println("**********");
        for (int i = 1; i <= 3; i++) {
            System.out.println(3);
        }
        System.out.println("**********");

        System.out.println("****************************分隔符****************************");

        //但是使用单层循环依然存在重复的代码，循环就是帮我们解决重复代码问题，因此可以进一步优化

        //外层循环用于打印*
        for (int j = 1; j <= 3; j++) {
            //内层循环用于打印数字
            for (int i = 1; i <= 3; i++) {
                System.out.println(j);
            }
            System.out.println("**********");
        }
    }
}