package LeedCode.LinkList;

public class getIntersectionNode {

    public ListNode TogetIntersectionNode(ListNode headA,ListNode headB){
        if(headA == null || headB == null){
            return null;
        }
        ListNode pa = headA,pb = headB;
        while(pa != pb){
            pa = pa == null ? headA : pa.next;
            pb = pb == null ? headB : pb.next;
        }
        
        return pa;
    }

}
