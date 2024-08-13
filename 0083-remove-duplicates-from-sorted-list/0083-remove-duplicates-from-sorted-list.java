/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }

 solution for the problem:-
ListNode prev = head;
        ListNode temp = prev.next;

        while(temp != null){
            if(temp.val == prev.val){
                temp = temp.next;
                continue;
            }

            prev.next = temp;
            prev = temp;
            temp = temp.next;
        }
        prev.next = null; 
        return head;
 * }
 */
class Solution {
    public ListNode deleteDuplicates(ListNode head) {
            ListNode current = head;

        while (current != null && current.next != null) {
            if (current.val == current.next.val) {
                current.next = current.next.next;
            } else {
                current = current.next;
            }
        }

        return head;
    }
}