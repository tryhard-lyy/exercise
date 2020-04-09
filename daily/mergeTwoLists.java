public class mergeTwoLists {
    public static ListNode mergeTwo(ListNode l1,ListNode l2){
        ListNode preHead = new ListNode(-1);
        ListNode preTemp = preHead;

        while(l1!=null&&l2!=null){
            if(l1.val<=l2.val){
                preTemp.next = l1;
                l1 = l1.next;
            }else{
                preTemp.next = l2;
                l2 = l2.next;
            }
            preTemp = preTemp.next;
        }
        preTemp.next = l1==null?l2:l1;
        
        return preHead.next;
    }
}
