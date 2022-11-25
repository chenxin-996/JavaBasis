package _08Array;

/**
 * @author: ChenXin
 * @createTime: 2022-11-25 11:12
 * @Description: foreach语句
 * @version: 1.0.0
 */

public class _13Foreach {

    /**
     * foreach是什么？
     * foreach循环语句是Java1.5的新特征之一，在遍历数组、集合方面，foreach为开发者提供了极大的方便
     * foreach循环语句是for语句的特殊简化版本，主要用于执行遍历功能的循环
     * foreach不是一个关键字
     * <p>
     * 格式：
     * for(类型 变量名 : 集合) {
     * 语句块;
     * }
     */

    public static void main(String[] args) {

        //分别使用for循环和foreach语句遍历数组中的元素

        // 声明并初始化数组
        int[] numbers = {12, 28, 52, 80, 87, 99, 11};

        //for循环语句
        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i]);
        }

        //foreach语句
        //数据类型  遍历出来的元素  数组名称
        for (int num : numbers)
            //当一个语句只有一行代码时，可以省略大括号
            System.out.println(num);

        String[] names = new String[]{"张三", "李四", "王五", "赵六", "钱七"};

        //for循环语句
        for (int i = 0; i < names.length; i++) {
            System.out.println(names[i]);
        }

        //快捷方式：数组名称.for Tab键
        for (String name : names) {
            System.out.println(name);
        }

    }
}