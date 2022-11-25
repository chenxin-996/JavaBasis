package _08Array;

/**
 * @author: ChenXin
 * @createTime: 2022-11-25 10:22
 * @Description: 数组的练习3
 * @version: 1.0.0
 */
public class _06ArrayExercises3 {

    //给定一个数值型数组，打印出数组的最大值

    private static int getMax(int[] array) {

        //首先，假设数组的第一个元素为最大值，然后依次比较，如果出现比它大的值就把这个值赋值给最大值，直至全部循环完毕为止
        int max = array[0];

        //然后遍历数组，与每个数组进行比较
        for (int i = 1; i < array.length; i++) {
            //比较array[i]是否大于max
            if (array[i] > max) {
                //如果大于，就将array[i]赋值给max
                max = array[i];
            }
        }
        //返回最大值
        return max;
    }

    public static void main(String[] args) {

        int[] array = new int[]{12, 28, 52, 15, 56, 65, 596, 51, 999};
        System.out.println("最大值：" + getMax(array));

    }
}