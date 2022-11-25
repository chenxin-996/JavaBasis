package _08Array;

/**
 * @author: ChenXin
 * @createTime: 2022-11-25 10:20
 * @Description: 数组的练习2
 * @version: 1.0.0
 */
public class _05ArrayExercises2 {

    //给定一个数组， 逆序打印输出数组形式 ["元素n","元素n-1","元素n-2",...,"元素3","元素2"元素1"]

    private static void printArray(String[] array) {

        //最开始的符号
        String result = "[";

        //遍历数组
        for (int i = array.length - 1; i >= 0; i--) {

            //使“ [ ”与元素进行拼接，并把最新的拼接结果赋值给 result
            result += array[i];

            //对遍历的数组进行判断，如果元素为最后一个元素时，就不拼接 ，”，否则就拼接“，”
            if (i == 0) {
                break;
            }
            result += "，";
        }
        //当所有的元素都遍历完成时，就拼接“ ] ”
        result += "]";

        //最后打印输出
        System.out.println(result);
    }

    public static void main(String[] args) {

        //测试：创建一个数组，调用printArray()方法
        String[] names = new String[]{"张三", "李四", "王五", "赵六", "钱七"};
        printArray(names);

        String[] array = new String[]{"A", "B", "C", "D"};
        printArray(array);
    }
}