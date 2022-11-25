package _08Array;

import java.util.Arrays;

/**
 * @author: ChenXin
 * @createTime: 2022-11-25 10:15
 * @Description: 数组的练习1
 * @version: 1.0.0
 */
public class _04ArrayExercises1 {

    //给定一个数组，打印成这种形式 ["元素1","元素2","元素3"...]，不使用内部类

    //首先，先定义一个拼接的方法
    private static void printArray(String[] array) {

        //最开始的符号
        String result = "[";

        //遍历数组
        for (int i = 0; i < array.length; i++) {

            //使“ [ ”与元素进行拼接，并把最新的拼接结果赋值给 result
            result += array[i];

            //对遍历的数组进行判断，如果元素为最后一个元素时，就不拼接“，”，否则就拼接“，”
            if (i == array.length - 1) {
                break;
            }
            result += "，";
        }
        //当所有的元素都遍历完成时，就拼接“ ] ”
        result += "]";

        //最后打印输出
        System.out.println(result);
    }

    public static void main(String[] args) {


        String[] names = new String[]{"张三", "李四", "王五", "赵六", "钱七"};
        printArray(names);

        //使用Java内部的工具类也可以直接输出
        System.out.println(Arrays.toString(names));

        String[] array = new String[]{"A", "B", "C", "D"};
        printArray(array);
    }
}