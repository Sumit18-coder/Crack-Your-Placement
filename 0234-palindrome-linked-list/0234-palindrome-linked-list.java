/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public boolean isPalindrome(ListNode head) {
        Stack<Integer> stack = new Stack<>();
        ListNode save = head;

        while (save != null) {
            stack.push(save.val);
            save = save.next;
        }
        save = head;
        while (save != null) {
            if (save.val != stack.pop()) {
                return false;
            }
            save = save.next;
        }

        return true;
    }
}