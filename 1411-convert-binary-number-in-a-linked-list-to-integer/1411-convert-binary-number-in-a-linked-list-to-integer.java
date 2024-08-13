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
    public int getDecimalValue(ListNode head) {
        ListNode p = head;
        int n = 0;

        while(p != null){
            n++;
            p = p.next;
        } 
        int sum = 0;
        p = head;
        while(p != null){
           sum += p.val*(int)Math.pow(2,--n);
           p = p.next;
        }
        return sum;
    }
}