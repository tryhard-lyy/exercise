package com.lyy.test;
public class addTwoNumbers {
    /*
    输入：(2 -> 4 -> 3) + (5 -> 6 -> 4)
    输出：7 -> 0 -> 8
    原因：342 + 465 = 807
     */

    public static ListNode addnumbers(ListNode l1,ListNode l2){
        ListNode tempHead = new ListNode(0);//哑节点
        ListNode p = l1,q = l2,curr = tempHead;
        int carry = 0;
        while(p!=null||q!=null){
            int x = (p!=null) ? p.val : 0;
            int y = (q!=null) ? q.val : 0;
            int sum = x + y + carry;
            carry = sum / 10;
            curr.next = new ListNode(sum%10);
            curr = curr.next;
            if(p!=null)p = p.next;
            if(q!=null)q = q.next;
        }
        if(carry>0){
            curr.next = new ListNode(carry);
        }
        return tempHead.next;
    }
}
