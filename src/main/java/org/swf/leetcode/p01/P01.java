package org.swf.leetcode.p01;

/**
 * @author by shenwf10476
 * @Description 两数之和
 *  https://leetcode-cn.com/problems/two-sum/
 * @date 2021/4/18 11:39
 */
public class P01 {
    public static void main(String[] args) {
        int[] nums = {2,7,11,15};
        int target = 9;
        int[] ints = new Solution().twoSum(nums, target);
        for (int num : ints) {
            System.out.print(num+" ");
        }
    }
}

class Solution {
    public int[] twoSum(int[] nums, int target) {
        for (int i = 0; i < nums.length-1; i++) {
            for (int j = i+1; j < nums.length; j++) {
                if (nums[i]+nums[j] == target) {
                    return new int[]{i, j};
                }
            }
        }
        return new int[0];
    }
}
