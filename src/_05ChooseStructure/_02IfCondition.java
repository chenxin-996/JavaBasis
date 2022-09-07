package _05ChooseStructure;

/**
 * @author: ChenXin
 * @createTime: 2022-09-07 17:32
 * @Description: if条件语句
 * @version: 1.0.0
 */

public class _02IfCondition {

    /**
     * 语法格式
     * if(逻辑表达式){
     * 要执行的语句
     * }
     * 1.当逻辑表达式的值为true才去执行里面的语句
     * 2.如果{}当中只有一条语句，那么{}可以省略不写的
     */

    public static void main(String[] args) {

        int a = 28;
        int b = 12;

        if (a > b) {
            System.out.println("a 大于 b");
        }

        // 如果{}当中只有一条语句，那么{}可以省略不写的
        if (a > b)
            System.out.println("a 大于 b");

        int age = 12;
        if (age < 18) {
            System.out.println("未成年");
        }

        if (false) {
            System.out.println("逻辑表达式的值为false，该语句不会执行");
        }

    }

}