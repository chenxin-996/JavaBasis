package _08Array;

/**
 * @author: ChenXin
 * @createTime: 2022-11-25 10:10
 * @Description: 数组的遍历
 * @version: 1.0.0
 */

public class _03Traverse {

    /**
     * 什么叫数组的遍历？
     * 数组的遍历就是依次访问数组中的每个元素，这种操作就称为数组的遍历
     */

    public static void main(String[] args) {
        /*
            需求：
            1.获取数组的长度
            2.打印出数组中的所有元素
         */
        String[] names = new String[]{"张三", "李四", "王五", "赵六", "钱七", "周八"};

        System.out.println(names[0]);
        System.out.println(names[1]);
        System.out.println(names[2]);
        System.out.println(names[3]);
        System.out.println(names[4]);
        System.out.println(names[5]);
        //这样写显然太过冗余

        //遍历数组（把数组当中的每一个元素都给取出来）
        for (int i = 0; i < names.length; i++) {
            System.out.println(names[i]);
        }

        /*
            如何获取数组元素的个数？
            数组名称.length
         */
        System.out.println(names.length);

        /*
            每个数组中的索引都有一个范围，即0~length-1
            在访问数组元素时，索引不能超出这个范围，否则会报错
         */

        //System.out.println(names[7]);
        //ArrayIndexOutOfBoundsException，数组越界
    }
}