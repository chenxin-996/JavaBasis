package _08Array;

/**
 * @author: ChenXin
 * @createTime: 2022-11-25 09:28
 * @Description: 数组的初始化
 * @version: 1.0.0
 */

public class _02Initialization {

    /**
     * 数据的初始化分两种：
     * 1.静态初始化
     * 2.动态初始化
     * <p>
     * 什么是静态初始化？
     * 静态初始化就是在创建数组时，就已经确定了有多少个元素，并且把元素都放到了数组当中
     * 格式有以下两种：
     * 类型[] 数组名 = new 类型 []{元素,元素...};
     * 类型[] 数组名 = {元素,元素...};
     * 为了简便通常采用第二种
     * <p>
     * 什么是动态初始化？
     * 系统自动为元素赋初始值的方式成为动态初始化
     * 动态初始化就是起初不知道要存多少数据，所以先定义一个指定的空间大小
     * 格式：
     * 类型[] 数组名 = new 类型 [n];
     * 其中 n 表示存放元素的个数
     * <p>
     * 元素的默认值：
     * 数据类型	                 默认值
     * byte	                        0
     * short	                    0
     * int	                        0
     * long	                        0L
     * float	                    0.0f
     * double	                    0.0d
     * char	                        'u0000'
     * String (or any object)	    null
     * boolean	                    false
     * 引用数据类型                  null
     */

    public static void main(String[] args) {

        //静态初始化
        int[] nums = new int[]{21, 22, 23, 24, 25};
        String[] names = {"张三", "李四", "王五"};

        //先定义，再赋值
        int a;
        //直接使用是错误的
        //System.out.println(a);
        a = 10;

        int[] ages;
        //直接使用是错误的
        //System.out.println(ages);
        //如果不初始化，数组是不能使用的
        ages = new int[]{21, 22, 23, 21, 25};

        //通过下标拿到姓名为李四的学生
        String name = names[1];
        System.out.println(name);

        //动态初始化
        String[] allPerson = new String[100];
        allPerson[0] = "张三";
        allPerson[1] = "李四";
        allPerson[2] = "王五";

        //ArrayIndexOutOfBoundsException:数组越界异常
        //System.out.println(allPerson[101]);
    }
}