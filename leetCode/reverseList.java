/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode reverseList(ListNode head) {
        if(null == head){
            return null;
        }
        ListNode t = head;
       ArrayList<Integer> temp = new ArrayList<Integer>();
     while(t != null){
         temp.add(t.val);
         t = t.next;
     }
    ListNode Lhead = new ListNode(temp.get(0));
        
      for(int i=1;i<temp.size();i++){
          ListNode l = new ListNode(temp.get(i));
          l.next = Lhead;
          Lhead = l;
      }  
        
        return Lhead;
    }
    
    public ListNode reverseList(ListNode head) {
        ListNode curr = head;
        ListNode pre = null;
        while(curr!=null){
            ListNode nextTemp = curr.next;
            curr.next = pre;
            pre = curr;
            curr = nextTemp;
        }
        
        return pre;
    }
    
     public ListNode reverseList(ListNode head) {
        if(head == null || head.next == null){
            return head;
        }
        
        ListNode p = reverseList(head.next);
        head.next.next = head;
        head.next = null;
        
        return p;
    }
}
