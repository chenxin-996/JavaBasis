package _06LoopStructure;

/**
 * @author: ChenXin
 * @createTime: 2022-11-11 19:10
 * @Description: 嵌套循环巩固练习四
 * @version: 1.0.0
 */

public class _08NestedLoopExercise4 {

    /**
     * 需求：
     * 打印100到1000之间的所有的水仙花数
     * <p>
     * 什么是水仙花数？
     * 水仙花数是指一个 3 位数，它的每个位上的数字的3次幂之和等于它本身
     * 1^3 + 5^3+ 3^3 = 153
     * 1*1*1 + 5*5*5 + 3*3*3
     * 1+125+ 27 = 153
     * <p>
     * 规律：
     * 求百位：153/100 = 1
     * 求十位：
     * 1、153/10 = 15
     * 2、15 % 10 = 5
     * 结论：153/10%10 = 5
     * 求个位：153 % 10 = 3
     */

    public static void main(String[] args) {

        for (int i = 100; i < 1000; i++) {
            int hundreds = i / 100;
            int ten = i / 10 % 10;
            int singleDigit = i % 10;

            if (hundreds * hundreds * hundreds + ten * ten * ten + singleDigit * singleDigit * singleDigit == i) {
                System.out.println(i);
            }
        }
    }


    /**
     * 通过这些循序渐进的练习，可以对循环结构有更加深刻地掌握，一定是循序渐进的去体会，去理解
     */
}