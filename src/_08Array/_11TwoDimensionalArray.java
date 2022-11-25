package _08Array;

/**
 * @author: ChenXin
 * @createTime: 2022-11-25 10:58
 * @Description: 二维数组
 * @version: 1.0.0
 */
public class _11TwoDimensionalArray {

    /**
     * 什么是二维数组？
     * 简单的理解来说，就是在数组中嵌套数组
     * 格式：
     * 数据类型[][] 数组名称 = new 数据类型 [][];
     */

    //需求：需要记录一个年级中的所有学生的年龄，一个年级中有多个班，一个班中有多个学生
    public static void main(String[] args) {

        //使用一维数组
        int[] classOne = new int[]{18, 18, 19, 19, 20};
        int[] classTwo = new int[]{10, 21, 22, 22, 21};
        int[] classThree = new int[]{20, 23, 25, 22, 20};
        //......

        //情况一：班级数确定，每个班的人数确定，使用二维数组
        int[][] grade1 = new int[3][5];//表示二维数组的长度是3，每个二维数组的元素又是一个长度为5的数组

        //情况二：班级数确定，每个班的人数不确定
        int[][] grade2 = new int[3][];

        //情况三：班级数不确定，每个班的人数也不确定
        int[][] grade3 = {{18, 18}, {10, 21, 22}, {20, 23, 25, 22, 20}};//后面还可以任意添加

        //二维数组的元素可以为一维数组的引用值
        int[][] grade4 = {classOne, classTwo, classThree};

        //获取二维数组的长度，数组名.length
        System.out.println(grade3.length);

        //如何获取二维数组中的元素呢？

        //表示拿到二维数组下标为0的，一维数组下标为1的元素
        System.out.println(grade3[0][1]);
        //表示拿到二维数组下标为2的，一维数组下标为4的元素
        System.out.println(grade4[2][4]);

        //注意点：二维数组的长度是必须明确的
        //int[][] grade = new int[][5];
    }
}