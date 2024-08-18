/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */

public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        int lenA = getListLength(headA);
        int lenB = getListLength(headB);

        // Align the start of the longer list with the shorter one
        while (lenA > lenB) {
            headA = headA.next;
            lenA--;
        }

        while (lenB > lenA) {
            headB = headB.next;
            lenB--;
        }

        // Traverse both lists together to find the intersection
        while (headA != null && headB != null) {
            if (headA == headB) {
                return headA;  // Intersection node found
            }
            headA = headA.next;
            headB = headB.next;
        }

        return null;  // No intersection
    }

    // Method to calculate the length of a linked list (default access)
    int getListLength(ListNode head) {
        int length = 0;
        while (head != null) {
            length++;
            head = head.next;
        }
        return length;
    }
}