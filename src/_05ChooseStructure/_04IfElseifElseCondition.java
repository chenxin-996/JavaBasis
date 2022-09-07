package _05ChooseStructure;

import java.util.Scanner;

/**
 * @author: ChenXin
 * @createTime: 2022-09-07 17:55
 * @Description: if_elseif_else条件语句
 * @version: 1.0.0
 */

public class _04IfElseifElseCondition {

    /**
     * if(逻辑表达式1){
     * 要执行的语句1，只有当逻辑表达式1的值为true才会执行此处的语句
     * }else if(逻辑表达式2){
     * 当判断逻辑表达式1为false且逻辑表达式2为true时，才会执行的语句
     * } else {
     * 如果逻辑表达式都不为true就会执行此处的语句
     * }
     * <p>
     * 多次的选择
     * 如果已经满足条件了，后面的语句还会不会执行？
     * 如果已经满足条件了，那么后面的语句就不会再执行
     */

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入你想要的星期：");
        int a = scanner.nextInt();
        if (a == 1) {
            System.out.println("星期一");
            //当输入的数字为1时，验证是否执行了此语句，结果是没有执行该语句
        } else if (a == 1 / 0) {
            System.out.println("星期二");
        } else if (a == 3) {
            System.out.println("星期三");
        } else if (a == 4) {
            System.out.println("星期四");
        } else if (a == 5) {
            System.out.println("星期五");
        } else if (a == 6) {
            System.out.println("星期六");
        } else if (a == 7) {
            System.out.println("星期日");
        } else {
            System.out.println("输入有误！");
        }

        /**
         * 根据学生的分数 ，划分一个等级
         * 学痞 ＝ 100
         *  90　＜＝　学霸   ＜ 100
         *  60　＜＝　学民 　＜ 90
         *  50　＜＝　学渣 　＜ 60
         *  20　＜＝　学沫 　＜ 50
         *  都不是
         *  学水
         */

        System.out.println("请输入你的成绩：");
        int score = scanner.nextInt();
        if (score == 100) {
            System.out.println("学痞");
        } else if (score >= 90 && score < 100) {
            System.out.println("学霸");
        } else if (score >= 60 && score < 90) {
            System.out.println("学民");
        } else if (score >= 50 && score < 60) {
            System.out.println("学渣");
        } else if (score >= 20 && score < 50) {
            System.out.println("学沫");
        } else {
            System.out.println("学水");
        }
    }

}