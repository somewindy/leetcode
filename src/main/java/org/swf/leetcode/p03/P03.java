package org.swf.leetcode.p03;

import java.util.Queue;
import java.util.concurrent.LinkedBlockingQueue;

/**
 * @author by shenwf10476
 * @Description 两数之和
 *  https://leetcode-cn.com/problems/two-sum/
 * @date 2021/4/18 11:39
 */
public class P03 {
    public static void main(String[] args) {
        String s = " ";
        int length = new Solution().lengthOfLongestSubstring(s);
        System.out.println(length);

    }
}

class Solution {
    public int lengthOfLongestSubstring(String s) {
        char[] charArray = s.toCharArray();
        int max = 0;
        Queue<Character> queue = new LinkedBlockingQueue<Character>();
        for (char c : charArray) {
            if (queue.contains(c)) {
                max = queue.size()>max?queue.size():max;
                while (queue.poll()!=c) { }
            }
            queue.add(c);
        }
        max = queue.size()>max?queue.size():max;
        return max;
    }
}
