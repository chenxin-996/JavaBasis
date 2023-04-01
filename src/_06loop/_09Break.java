package _06loop;

/**
 * @author: ChenXin
 * @createTime: 2022-11-11 19:35
 * @Description: break跳转语句
 * @version: 1.0.0
 */

public class _09Break {

    /**
     * 在switch条件语句中，break的作用是终止某个case并跳出switch结构
     * 在循环结构中作用是跳出循环体，执行循环体以后的代码
     */

    public static void main(String[] args) {

        // 打印1-100之间的前12位数
        int i = 1;
        while (i <= 100) {
            System.out.println(i);
            if (i == 12) {
                break;
            }
            i++;
        }
        System.out.println("************分隔符************");

        // 打印1-100之间的前10位奇数
        int oddNumber = 0;
        for (int j = 1; j <= 100; j++) {
            if (j % 2 != 0) {
                System.out.println(j);
                oddNumber++;
            }
            if (oddNumber == 10) {
                break;
            }
        }
    }
}