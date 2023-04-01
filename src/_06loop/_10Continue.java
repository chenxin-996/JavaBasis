package _06loop;

/**
 * @author: ChenXin
 * @createTime: 2022-11-11 19:42
 * @Description: continue跳转语句
 * @version: 1.0.0
 */

public class _10Continue {

    /**
     * continue语句使用在循环语句中，它的作用是终止本次循环进入下一次循环
     */
    public static void main(String[] args) {

        // 打印1-100之间能被9整除的数
        for (int j = 1; j <= 100; j++) {
            if (j % 9 != 0) {
                continue;
            }
            System.out.println(j);
        }

        System.out.println("************分隔符************");

        // 打印1-100之间的所有偶数和
        int total = 0;
        for (int k = 1; k <= 100; k++) {
            if (k % 2 != 0) {
                continue;
            }
            total += k;
        }
        System.out.println(total);
    }

}