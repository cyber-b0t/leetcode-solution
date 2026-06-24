// Last updated: 6/24/2026, 8:54:24 PM
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
    public ListNode rotateRight(ListNode head, int k) {

        if(k==0) return head;
        if(head==null || head.next==null) return head;
        ListNode node = head;
        ListNode prev = null;
        ListNode curr = head;

        int len=1;

        while(node.next!=null){
            node = node.next;
            len++;
        }

        node.next = head;

        int cnt=0;

        node=head;

        while(cnt<len-(k%len)){
            prev = node;
            node = node.next;
            cnt++;
        }

        prev.next = null;
        return node;
    }
}