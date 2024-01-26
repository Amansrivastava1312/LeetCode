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
    ListNode kthNode(ListNode temp , int k ){
        
        k-=1;
        while(temp!=null && k>0){
            k--;
            temp=temp.next;
        }
        return temp;
    }
    
    void reverse(ListNode head){
        ListNode curr = head;
        ListNode prev = null;
        
        while(curr!=null){
            ListNode x = curr.next;
            curr.next = prev;
            prev = curr;
            curr=x;
        }
        
        
    }
    public ListNode reverseKGroup(ListNode head, int k) {
        
        ListNode temp= head;
        ListNode prevLast = null;
        
        while(temp!=null){
            ListNode kNode = kthNode(temp , k);
            if(kNode == null){
                if(prevLast!=null){
                    prevLast.next = temp;
                    break;
                }
            }
          ListNode  nextNode = kNode.next;
            kNode.next=null;
            
            reverse(temp);
            if(temp==head){
                head= kNode;
            }else{
                prevLast.next = kNode;
            }
            prevLast = temp;
            temp = nextNode;
            
        }
        
        return head;
    }
}