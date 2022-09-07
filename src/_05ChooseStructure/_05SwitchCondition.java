package _05ChooseStructure;

/**
 * @author: ChenXin
 * @createTime: 2022-09-07 18:00
 * @Description: switch条件语句
 * @version: 1.0.0
 */

import java.util.Scanner;

/**
 * switch(整型表达式)｛
 * case  值A:  执行语句; break;
 * case  值B:  执行语句; break;
 * case  值C:  执行语句; break;
 * ....
 * default:上面没有一个满足条件，就会执行此语句
 * ｝
 * <p>
 * 注意点：
 * 1.多个case的值不能相同
 * 2.如果没有写break，会执行当前条件后面的所有语句，直接遇到break退出
 * 遇到break，就会退出switch
 * 3.default可以放到最上面，要在后面加上break，如果没有加，同样，也会继续往下执行，直接遇到break退出
 * <p>
 * 在JDK7.0中，switch语句的表达式增加了对字符串类型的支持
 * 即：
 * case "Mondat":
 * System.out.println("星期一");
 * break;
 * 这样的写法也是没有问题的
 */

public class _05SwitchCondition {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入你想要的星期：");
        int week = scanner.nextInt();

        //一种情况对应一个case，类似于if...else if...else
        switch (week) {
            case 1:
                System.out.println("星期一");
                break;
            case 2:
                System.out.println("星期二");
                break;
            case 3:
                System.out.println("星期三");
                break;
            case 4:
                System.out.println("星期四");
                break;
            case 5:
                System.out.println("星期五");
                break;
            case 6:
                System.out.println("星期六");
                break;
            case 7:
                System.out.println("星期日");
                break;
            default:
                System.out.println("输入有误！");
        }

        System.out.println("*****************************分隔符*****************************");

        int a = 3;
        switch (a) {
            default:
                System.out.println("输入有误！");
                break;
            case 1:
                System.out.println("星期一");
                break;
            case 2:
                System.out.println("星期二");
                break;
            case 3:
                System.out.println("星期三");
                System.out.println("上班");
                System.out.println("上班");
                System.out.println("上班");
                System.out.println("上班");
                System.out.println("上班");
                break;
            case 4:
                System.out.println("星期四");
                break;
            case 5:
                System.out.println("星期五");
                break;
            case 6:
                System.out.println("星期六");
                break;
            case 7:
                System.out.println("星期日");
                break;
        }

        System.out.println("*****************************分隔符*****************************");

        //ASCII码，65->A，66->B
        byte s = 65;
        //short、byte类型在switch中会自动提升为int类型
        switch (s) {
            case 65: {
                System.out.println("A");
            }
            break;
            case 66: {
                System.out.println("B");
            }
            break;
            default: {
                System.out.println("输入有误！");
            }
        }

        System.out.println("*****************************分隔符*****************************");

        //多个case匹配一种情况
        System.out.println("请输入你想要的星期：");
        int day = scanner.nextInt();
        switch (day) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
                System.out.println("工作日");
                break;
            case 6:
            case 7:
                System.out.println("休息！");
                break;
            default:
                System.out.println("输入有误！");
        }
    }

}