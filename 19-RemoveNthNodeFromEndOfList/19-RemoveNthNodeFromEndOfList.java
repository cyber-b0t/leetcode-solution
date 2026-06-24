// Last updated: 6/24/2026, 8:54:32 PM
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
    public ListNode removeNthFromEnd(ListNode head, int n) {

        if(head.next==null && n==1){
            return null;
        }

        int len=0;
        ListNode node = head;
        while(node!=null){
            node=node.next;
            len++;
        }

        if(len==n){
            return head.next;
        }

        ListNode slow = head;
        ListNode fast = head;

        int cnt=0;

        while(cnt<n){
            fast = fast.next;
            cnt++;
        }

        while(fast!=null && fast.next!=null){
            slow = slow.next;
            fast = fast.next;
        }

        slow.next = slow.next.next;

        return head;
    }
}