// Last updated: 6/24/2026, 8:54:05 PM
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
        ListNode prev=null;
        ListNode node = head;
        ListNode temp = head;

        while(node!=null){
            temp = node.next;
            node.next = prev;
            prev = node;
            node = temp;
        }

        return prev;
    }
    public boolean isPalindrome(ListNode head) {

        if(head==null || head.next==null){
            return true;
        }

        int len = 0;
        ListNode curr = head;
        while(curr!=null){
            curr = curr.next;
            len++;
        }
        ListNode node = head;
        int cnt=0;

        while(cnt<len/2-1){
            node = node.next;
            cnt++;
        }

        if(len%2==0){
            curr = node.next;
        }else{
            curr = node.next.next;
        }

        curr = reverse(curr);
        node=head;

        while(curr!=null && node!=null){
            if(curr.val!=node.val){
                return false;
            }

            curr = curr.next;
            node = node.next;
        }

        return true;
    }
}