package _07method;

import java.util.Scanner;

/**
 * @author: ChenXin
 * @createTime: 2022-11-11 21:15
 * @Description: 方法的练习
 * @version: 1.0.0
 */

public class _03Practise {

    /**
     * 需求：
     * 定义一个登录的方法，假设账号密码如下
     * 用户名：沉心
     * 密码：1234
     * 必须要有用户名与密码
     * 告诉用户是否登录成功
     *
     * @param user     用户名
     * @param password 密码
     * @return 是否登录成功
     */
    private static String login(String user, String password) {

        // 1.判断用户名与密码是否正确
        if ("沉心".equals(user) && "1234".equals(password)) {

            // 2.如果正确，告诉用户登录成功
            return "succeed";

            // 3.否则告诉用户登录失败
        } else {
            return "failure";
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入用户名：");
        String username = sc.next();
        System.out.println("请输入密码：");
        String password = sc.next();
        String result = login(username, password);
        if ("succeed".equals(result)) {
            System.out.println("登录成功！");
        } else {
            System.out.println("登录失败，请检查你的用户名或者密码是否准确！");
        }
    }

    /**
     * 案例总结
     * 1、在使用字符串进行比对时，不应该使用==，而应该使用equals方法进行比对
     *    ==适用于两个表达式之间的比较，并不适用于字符串之间的比较
     * 例如本案例的错误写法：
     *  if (user == "沉心" && password == "1234")  应改成  if ("沉心".equals(user) && "1234".equals(password))
     *  if (result == "succeed")  应改成  if ("succeed".equals(result))
     * <p>
     * 2、在使用equals方法时，通常把已确定的字符串结果调用equals方法，而不是使用变量去调用equals方法，目的是为了避免空指针异常
     * 例如本案例的错误写法：
     * if (user.equals("沉心") && password.equals("1234"))、result.equals("succeed")
     * 如果调用方法时未传入参数，那么user和password为null，或者方法返回值result返回为null，此时会抛出java.lang.NullPointerException空指针异常问题
     * 为避免出现这种情况通常都把已确定因素去调用equals方法，写法如下
     * if ("沉心".equals(user) && "1234".equals(password))
     * if ("succeed".equals(jieGuo))
     */
}