// Last updated: 6/24/2026, 8:54:11 PM
/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        ListNode X = headA;
        ListNode Y = headB;

        while(X!=Y){
            if(X==null){
                X = headB;
            }else{
                X = X.next;
            }

            if(Y==null){
                Y = headA;
            }else{
                Y= Y.next;
            }
        }

        return X;
    }
}