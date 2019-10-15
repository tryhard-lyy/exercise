/**
 * Definition for singly-linked list.
 * struct ListNode {
 *     int val;
 *     ListNode *next;
 *     ListNode(int x) : val(x), next(NULL) {}
 * };
 */
class Solution {
public:
    ListNode *getIntersectionNode(ListNode *headA, ListNode *headB) {
          if (headA == null || headB == null) return null;
         ListNode pA = headA, pB = headB;
         while (pA != pB) {
           pA = pA == null ? headB : pA.next;
         pB = pB == null ? headA : pB.next;
    }
    return pA;
    }
};
