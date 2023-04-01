package _05choose;

import java.util.Scanner;

/**
 * @author: ChenXin
 * @createTime: 2022-09-07 17:38
 * @Description: if_else条件语句
 * @version: 1.0.0
 */

public class _03IfElseCondition {

    /**
     * if(逻辑表达式){
     * 要执行的语句1     只有当表达式的值为true才会执行此处的语句
     * } else {
     * 要执行的语句2     如果逻辑表达式不为true就会执行此处的语句
     * }
     * 两者必须得要做一个选择
     */
    public static void main(String[] args) {

        boolean isMan = true;
        if (isMan) {
            System.out.println("男人");
        } else {
            System.out.println("女人");
        }

        // 判断一个数是奇数还是偶数
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入一个数：");
        int number = scanner.nextInt();
        if (number % 2 == 0) {
            System.out.println("偶数");
        } else {
            System.out.println("奇数");
        }
    }

}