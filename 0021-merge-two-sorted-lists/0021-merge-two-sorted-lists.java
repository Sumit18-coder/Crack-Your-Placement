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
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        //create a dummy node to start
        ListNode returnNode = new ListNode(Integer.MIN_VALUE);
        //create a copy of this node to iterate
        ListNode headNode = returnNode;

        while(list1 != null && list2 != null){
            if(list1.val <= list2.val){
                returnNode.next = list1;
                list1 = list1.next; 
            }else{
                returnNode.next = list2;
                list2 = list2.next;
            }
            returnNode = returnNode.next;
        } 
        //append the remaining list
        if(list1 == null){
            returnNode.next = list2;
        }else if(list2 == null){
            returnNode.next = list1;
        }
        return headNode.next;
    }
}