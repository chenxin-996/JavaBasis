package _06loop;

/**
 * @author: ChenXin
 * @createTime: 2022-11-11 20:52
 * @Description: 控制外层循环
 * @version: 1.0.0
 */

public class _12ControlOuterLoop {

    /**
     * 默认情况下，在使用嵌套循环时，使用break语句是跳出当前break所在的循环体，外层循环体不受影响
     * 如何控制外层循环？
     * 首先，给循环体定义一个标签，标签就是给某个循环起的别名，不过该别名得满足标识符的规范
     * 若要控制外层循环，就在break或continue后面跟上循环的标签名称
     */
    public static void main(String[] args) {

        outer:
        for (int i = 1; i <= 5; i++) {
            inner:
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
                if (i == 3) {
                    // 表示跳出外层循环
                    break outer;

                    // 以下两个语句作用相同
                    // break;
                    // break inner;
                }
            }
            // 可以打开逐一注释测试运行，观看结果理解
            System.out.println();
        }
    }
}