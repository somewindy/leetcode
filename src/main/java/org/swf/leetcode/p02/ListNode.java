package org.swf.leetcode.p02;

/**
 * @author by shenwf10476
 * @Description 2. 两数相加
 *  https://leetcode-cn.com/problems/add-two-numbers/
 * @date 2021/4/18 11:39
 */
public class ListNode {

    int val;
    ListNode next;

    ListNode() {
    }

    ListNode(int val) {
        this.val = val;
    }

    ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }
}


class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode root = new ListNode(0);
        ListNode current = root;
        int carry = 0;
        int n1 = 0;
        int n2 = 0;
        while (l1 != null || l2 !=null || carry!=0) {
            if (l1 !=null) {
                n1 = l1.val;
                l1 = l1.next;
            }else {
                n1 = 0;
            }
            if (l2 !=null) {
                n2 = l2.val;
                l2 = l2.next;
            }else {
                n2 = 0;
            }
            int sum = n1 + n2 + carry;
            carry = sum / 10;
            ListNode sumNode = new ListNode(sum % 10);
            current.next = sumNode;
            current = sumNode;
        }
        return root.next;
    }
}
