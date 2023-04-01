package _07method;

/**
 * @author: ChenXin
 * @createTime: 2022-11-11 21:02
 * @Description: 方法的注意点
 * @version: 1.0.0
 */

public class _02BeCareful {

    /**
     * 注意点：
     * 1.方法必须声明到类（class）当中
     * 2.创建的方法要定义在其它方法之外（跟其它的方法是兄弟关系）
     * 3.定义方法不分先后顺序
     * 4.如果一个方法前面有static，那么在该方法当中调用其它的方法前面也应该有static
     * 5.一个类当中可以写多个方法
     * 6.两个方法的名称不能相同（重载方法除外）
     * 7.方法必须得要先定义，再执行
     * 8.如果方法中带有参数，调用方法时就必须传入对应类型的参数值
     */

    /**
     * 方法的完整形式：
     * <p>
     * [修饰符] 返回值类型 方法名（[形式参数...]）{
     * 方法体（要重复使用的代码）
     * [return 值]
     * }
     * <p>
     * void表示返回值为空，什么都不返回，如果有返回值，里面必须得要有return
     * return后面的类型，取决于方法定义时返回什么类型
     */

    // 定义一个方法，计算1+1等于多少
    private static void sum1() {
        int a = 1 + 1;
        System.out.println(a);
    }

    // 再计算2+2等于多少
    private static void sum2() {
        int a = 2 + 2;
        System.out.println(a);
    }
    // 这样写依然存在很多重复的代码

    /**
     * 需求：计算两个数之和的方法
     *
     * @param a 第一个数
     * @param b 第二个数
     *          局部变量：在方法内部声明的变量，只在当前方法中有效，不在方法内时使用就没有效果
     */
    private static void sum3(int a, int b) {
        int c = a + b;
        System.out.println(c);
    }

    /**
     * 需求：拼接两个字符串类型，并打印出结果
     *
     * @param string1 第一个字符串
     * @param string2 第二个字符串
     * @return 返回值为拼接结果
     * <p>
     * 方法的命名
     * 驼峰命名法：第一个字母小写，后面的每一个单词首字母大写
     */
    private static String splicing(String string1, String string2) {
        return string1 + string2;
    }

    public static void main(String[] args) {
        // 调用方法计算1+1
        sum1();

        // 调用方法计算2+2
        sum2();

        // 调用计算两个数之和的方法
        sum3(12, 28);

        // 调用两个字符串拼接的方法
        String result = splicing("AaB", "bCc");
        System.out.println(result);

        // 在方法返回值后面还可以进行拼接
        System.out.println(result + "Dd" + 666);
    }
}