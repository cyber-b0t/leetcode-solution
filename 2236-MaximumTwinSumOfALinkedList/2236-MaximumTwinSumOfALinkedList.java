// Last updated: 6/24/2026, 8:53:43 PM
/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode reverse(ListNode head){
        ListNode node=head;
        ListNode temp=head;
        ListNode prev = null;

        while(node!=null){
            temp = node.next;
            node.next = prev;
            prev = node;
            node = temp;
        }

        return prev;
    }
    public int pairSum(ListNode head) {
        ListNode n1=head;
        ListNode n2=head;

        while(n2!=null && n2.next!=null){
            n1 = n1.next;
            n2 = n2.next.next;
        }

        n2 = reverse(n1);

        n1 = head;

        int max=0;

        while(n1!=n2 && n1!=null && n2!=null){
            int sum = n1.val + n2.val;

            max = Math.max(max,sum);
            n1 = n1.next;
            n2 = n2.next;
        }

        return max;


    }
}