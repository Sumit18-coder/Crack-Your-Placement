/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }

 //uses stack data structure
 Stack <Integer> valueStack =  new Stack<>();
        while(head != null){
            valueStack.push(head.val);
            head = head.next;
        } 
        ListNode reverseList = new ListNode(Integer.MIN_VALUE);
        ListNode ptr = reverseList;

        while(!valueStack.isEmpty()){
            ptr.next = new ListNode(valueStack.pop());
            ptr = ptr.next;
        } 
        return reverseList.next;
 */
class Solution {
    public ListNode reverseList(ListNode head) {
        if(head == null){
            return null;
        }
        if(head.next == null){
            return head;
        }
        
        ListNode prenode = null;
        ListNode currnode = head;

        while(currnode != null){
            ListNode nextnode = currnode.next;
            currnode.next = prenode;
            prenode = currnode;
            currnode = nextnode;
        }
        head = prenode;
        return head;
    }
}