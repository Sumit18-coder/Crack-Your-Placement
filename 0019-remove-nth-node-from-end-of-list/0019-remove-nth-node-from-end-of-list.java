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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode dummyNode = new ListNode(-1);
        dummyNode.next = head;

        ListNode firstPtr = dummyNode;
        ListNode secondPtr = dummyNode;

        //move 2nd ptr n spaces away
        for(int i = 0; i  < n; i++){
            secondPtr = secondPtr.next;
        }
        //now move both ptr until the secondPtr reach very end or next of secondPtr is equal to null
        while(secondPtr.next != null){
            firstPtr = firstPtr.next;
            secondPtr = secondPtr.next;
        }
        //now remove the next of firstPtr
        firstPtr.next = firstPtr.next.next;

        return dummyNode.next;
    }
}