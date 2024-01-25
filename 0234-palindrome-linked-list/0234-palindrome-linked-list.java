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
    ListNode reverse(ListNode head){
        if(head == null || head.next==null) return head;;
        ListNode temp =head;
        ListNode prev = null;
        
        while(temp!=null){
            ListNode x= temp.next;
            temp.next= prev;
            prev=temp;
            temp=x;
        }
        
        return prev;
    }
    public boolean isPalindrome(ListNode head) {
        if(head == null || head.next==null) return true;
        
        ListNode slow = head;
        ListNode fast = head;
        
        while(fast.next!=null && fast.next.next!=null ){
            slow=slow.next;
            fast=fast.next.next;
        }
        
        ListNode newHead = reverse(slow.next);
        
        while(newHead!=null){
            if(head.val!=newHead.val)return false;
            newHead=newHead.next;
            head=head.next;
        }
        return true;
        
        
    }
}