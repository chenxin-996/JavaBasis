package _02grammar;

/**
 * @author: ChenXin
 * @createTime: 2022-09-04 11:32
 * @Description: Java注释
 * @version: 1.0.0
 */

/**
 * Java中的程序代码都必须放在一个类中，类需要使用class关键字定义，在class前面可以有一些修饰符
 * 格式如下：
 * 修饰符  class  类名  {
 * 程序代码
 * }
 * 在编写Java代码时，需要注意几个关键点：
 * 1.所有的符号必须都是半角下的英文符号
 * 2.Java语言是严格区分大小写的
 * 3.在编写代码时，为了便于阅读，要养成一种良好的格式排版，保证代码整齐美观，层次清晰
 */

public class _01Annotation {

    /**
     * 文档注释
     * 注释是对程序的某个功能或者某行代码的解释说明
     * 注释只在源文件中有效，不会被编译到字节码当中
     * main方法为程序入口
     */
    public static void main(String[] args) {

        // 单行注释
        System.out.println("HelloWord");

        /*多行注释
        System.out.println("HelloWord");
        System.out.println("HelloWord");
        System.out.println("HelloWord");
        System.out.println("HelloWord");
        System.out.println("HelloWord");
        System.out.println("HelloWord");
         */

        /**
         * print   打印不会换行
         * println 打印时会自动换行
         */


    }

}