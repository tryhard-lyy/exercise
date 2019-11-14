package LeedCode.LinkList;

import java.util.ArrayList;

public class ispalindrome {

    public boolean toIspalindrome(ListNode head){
        if(head == null || head.next == null){
            return false;
        }
//        ArrayList<Integer> arrayList = new ArrayList<Integer>();
//        while(head!=null){
//            arrayList.add(head.val);
//            head = head.next;
//        }
//        int i = 0;
//        int j = arrayList.size()-1;
//
//        while(i<j){
//            if(arrayList.get(i).compareTo(arrayList.get(j))!=0){
//                return false;
//            }
//            i++;
//            j++;
//        }
//
//        return true;
       ListNode d =new ListNode(0);
        ListNode slow = d;
        ListNode fast = d;
        d.next = head;
        while (fast!=null&&fast.next!=null){
            slow = slow.next;
            fast = fast.next.next;
        }
        fast = slow.next;
        slow.next = null;
        slow = d.next;

        //返回pre
        ListNode curr = fast;
        ListNode pre = null;
        while(curr!=null){
            ListNode nextTemp = curr.next;
            curr.next = pre;
            pre = curr;
            curr = nextTemp;
        }

        while(pre!=null){
            if(slow.val != pre.val){
                return false;
            }
            slow = slow.next;
            pre = pre.next;
        }

        return true;




    }
}
