public void delete(ListNode node){
  node.val = node.next.val;
  node.next = node.next.next;

}
