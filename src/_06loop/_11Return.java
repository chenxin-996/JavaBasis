package _06loop;

/**
 * @author: ChenXin
 * @createTime: 2022-11-11 20:30
 * @Description: return跳转语句
 * @version: 1.0.0
 */

public class _11Return {

    /**
     * return
     * 循环终止，后续的代码也不执行了，直接终止当前运行的方法
     * 表示结束循环所在的方法，方法都结束了，循环结构自然也就结束了
     * 注意与break的区别，切记混淆，一个是停止所在的循环体，一个是停止所在的方法
     */

    public static void main(String[] args) {
        for (int i = 1; i <= 10; i++) {
            if (i == 5) {
                return;
            }
            System.out.println(i);
        }

        System.out.println("你猜该语句会不会被执行？？？");






















        // 不会执行，原因是return会终止所在的方法，在方法作用域范围内的后续代码不再执行
    }
}