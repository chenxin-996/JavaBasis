package _08array;

import java.util.Arrays;

/**
 * @author: ChenXin
 * @createTime: 2022-11-25 10:50
 * @Description: 二分查找
 * @version: 1.0.0
 */

public class _10BinarySearch {

    /**
     * 什么是二分查找？
     * 二分查找（binary search）又叫折半查找，它是一种在有序数组中查找某一特定元素的搜索算法
     * <p>
     * 使用二分算法的必要条件：
     * 1.必须为顺序存储结构
     * 2.必须按关键字大小有序排列
     * <p>
     * 原理分析：
     * 第一：将有序数组分为三个部分
     * 1.中间值前（中间值之前的一组数据）
     * 2.中间值
     * 3.中间值后（中间值之后的一组数据）
     * 第二：将要查找的数与中间值的数相比较
     * 1.等于则退出查找
     * 2.小于则在中间值前进行比较
     * 3.大于在在中间值后进行比较
     * 4.依次循环操作，直至查找到对应的值为止
     * 第三：当要查找数据结构为偶数时，中间值应向下取整处理
     */

    private static int binarySearch(int[] nums, int target) {
        // 起始索引值0
        int low = 0;
        // 数组最后一位索引值
        int high = nums.length - 1;
        if (low > high || target > nums[high] || target < nums[low]) {
            // 当目标元素不存在时会进入该代码块
            return -1;
        }
        while (low <= high) {
            // 取中间值
            int mid = (high + low) / 2;
            // 等于则退出查找
            if (nums[mid] == target) {
                return mid;

            } else if (nums[mid] < target) {
                // 小于则在中间值前进行比较
                low = mid + 1;
            } else if (nums[mid] > target) {
                // 大于在在中间值后进行比较
                high = mid - 1;
            }
        }
        // 返回目标值的索引，如果为-1，则表示没找到
        return -1;
    }

    public static void main(String[] args) {
        System.out.println(binarySearch(new int[]{12, 28, 52, 80, 87, 99, 100}, 28));
        // 系统内部写好的
        System.out.println(Arrays.binarySearch(new int[]{12, 28, 52, 80, 87, 99, 100}, 99));
    }
}