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
    public ListNode reverseBetween(ListNode head, int left, int right) {
        ListNode prev = null;
        ListNode curr = head;int j = 0;
        int x = j = right - left;
        ListNode arr[] = new ListNode[x+1];
        while(left -- > 0){
            prev = curr;
            curr = curr.next;
        }
        curr = prev;j++;
        while(j-- > 0){
            arr[j] = curr;
            curr = curr.next;
        }
        int i = 0;
        if(x%2 == 1)x = x/2 + 1;
        else x /= 2;
        while(i < (x)){
            swap(prev,arr[i]);
            prev = prev.next;
            i++;
        }
        return head;
    }
    public void swap(ListNode prev,ListNode curr){
        int temp = prev.val;
        prev.val = curr.val;
        curr.val = temp;
    }
}