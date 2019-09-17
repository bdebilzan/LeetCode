/*
Reverse a singly linked list.

Example:

Input: 1->2->3->4->5->NULL
Output: 5->4->3->2->1->NULL

Link: https://leetcode.com/problems/reverse-linked-list
*/

class Solution {
    public ListNode reverseList(ListNode head) 
    {
        ListNode newHead = null;
        
        while(head != null)
        {
            ListNode next = head.next;
            head.next = newHead;
            newHead = head;
            head = next;
        }
        
        return newHead;
    } 
}
