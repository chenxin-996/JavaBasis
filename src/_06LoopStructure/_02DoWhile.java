package _06LoopStructure;

/**
 * @author: ChenXin
 * @createTime: 2022-11-11 16:20
 * @Description: do while循环语句
 * @version: 1.0.0
 */

/**
 * 语法格式
 * do{
 * 循环体
 * }while(逻辑表达式)
 * <p>
 * 不管逻辑表达式为不为真，上来先执行一次循环体
 * <p>
 * while循环和do while循环有什么区别？
 * 比如说要去揍一个叫张三的人，while循环会先问你是不是叫张三，如果是才揍你一拳
 * do while循环就比较暴力了，上来直接给你一拳，然后再问你是不是叫张三
 */
public class _02DoWhile {
    public static void main(String[] args) {

        int i = 1;
        do {
            System.out.println(i);
            i++;
        } while (i < 1);//即使不成立也会执行一次

    }
}