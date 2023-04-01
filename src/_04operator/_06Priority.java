package _04operator;

/**
 * @author: ChenXin
 * @createTime: 2022-09-04 17:01
 * @Description: 运算符的优先级
 * @version: 1.0.0
 */

/**
 * 优先级	          运算符
 * 1	             ( )　[ ] 　.
 * 2	             ! 　~　 ++　 --
 * 3	             *　 /　 %
 * 4	             +　 -
 * 5	             << 　>>　 >>>
 * 6	             < 　<=　 > 　>=　 instanceof
 * 7	             == 　!=
 * 8	             &
 * 9	             ^
 * 10                |
 * 11                &&
 * 12                ||
 * 13                ? :
 * 14                = 　+= 　-= 　*=　 /=　 %=　 &=　 |=　 ^=　 ~= 　<<= 　>>=　 >>>=
 */

public class _06Priority {

    public static void main(String[] args) {

        int a = 2;
        int b = a + 3 * a - (6 / 2);

        /**
         * 运行结果为5
         * 由于运算符  "()"  的优先级最高，因此先运行(6 / 2)
         * 其次  "*"  的优先级高于  "+" 、 "-"，因此再运行3 * a
         * 最后再进行相加减
         */
        System.out.println(b);

    }

}