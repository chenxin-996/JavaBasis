package _03JavaVariable;

/**
 * @author: ChenXin
 * @createTime: 2022-09-04 12:16
 * @Description: 基本数据类型——浮点数类型
 * @version: 1.0.0
 */


/**
 * 浮点数类型有哪些？
 * 浮点数类型包括double、float
 * 有什么区别？
 * 相同点都是存放浮点数类型的数据，不同点是开辟的空间大小不一样
 */

public class _03FloatType {

    public static void main(String[] args) {

        double money1 = 100.5;
        //默认情况下，小数是属于double类型的值，所以在给float类型赋值时，一定要在所赋值后面加上字母F（或小写f）
        System.out.println(80.5);

        //会报错
        //float money2 = 80.5;
        float money2 = 80.5f;

        //e表示以10位底的指数，3.14e2表示3.14 * 10 的二次方
        System.out.println(3.14e2);
        //在此E大小写无关
        System.out.println(3.14E2);
    }
}