package LeedCode.LinkList;

import java.util.HashSet;
import java.util.Set;

public class hasCycle {

    public boolean TohasCycle(ListNode head){
//        Set<ListNode> setList = new HashSet<>();
//        while(head != null){
//            if(setList.contains(head)){
//                return true;
//            }else{
//                setList.add(head);
//            }
//            head = head.next;
//        }
//
//        return false;

        if(head == null){
            return false;
        }

        ListNode slow = head;
        ListNode fast = head.next;

        while(slow != fast){
            if(fast == null || fast.next == null){
                return false;
            }
            slow = slow.next;
            fast = fast.next.next;
        }

        return true;
    }
}
