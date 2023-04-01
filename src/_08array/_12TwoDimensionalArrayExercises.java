package _08array;

import java.util.Arrays;

/**
 * @author: ChenXin
 * @createTime: 2022-11-25 11:06
 * @Description: 二维数组练习
 * @version: 1.0.0
 */
public class _12TwoDimensionalArrayExercises {

    /**
     * 需求：
     * 1.定义一个二维数组存放指定班级，班级里有若干个学生，若干个（不确定）
     * 2.计算每个班级有多少个学生，然后打印出班级里所有学生的姓名
     * 3.统计一共有多少个班级
     */
    public static void main(String[] args) {

        String[][] names = {{"张三", "李四"}, {"王五", "赵六", "钱七", "周八"}, {"QQ", "微信", "支付宝"}};

        // 遍历二维数组
        for (int i = 0; i < names.length; i++) {

            // 二维数组中的每个一维数组又赋值给array
            String[] array = names[i];

            // 计算每个班级有多少个学生
            System.out.println("第" + (i + 1) + "个班级一共有" + array.length + "个学生！");

            // 打印输出学生的姓名
            System.out.println(Arrays.toString(array));
        }

        // 统计一共有多少个班级
        System.out.println("该年级一共有" + names.length + "个班级！");

    }
}