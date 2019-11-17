/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode partition(ListNode head, int x) {
        if(head == null || head.next == null){
            return head;
        }
        ListNode befor_head = new ListNode(0);
        ListNode befor = befor_head;
        ListNode after_head = new ListNode(0);
        ListNode after = after_head;
        
        while(head!=null){
            if(head.val < x){
                befor.next = head;
                befor = head;
            }else{
                after.next = head;
                after = head;
            }
            
            head = head.next;
        }
        
        befor.next = after_head.next;
        after.next = null;
        
        return befor_head.next;
        
    }
}
