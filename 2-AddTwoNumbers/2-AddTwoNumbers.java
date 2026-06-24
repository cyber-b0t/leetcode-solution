// Last updated: 6/24/2026, 8:54:37 PM
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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        int carry=0;

        ListNode dummy = new ListNode(-1);
        ListNode tail = dummy;

        while(l1!=null && l2!=null){
            int sum = l1.val+l2.val+carry;

            if(sum>=10){
                int ud = sum%10;
                ListNode node = new ListNode(ud);
                tail.next = node;
                carry=1;
            }else{
                ListNode node = new ListNode(sum);
                tail.next = node;
                carry=0;
            }

            tail = tail.next;
            l1 = l1.next;
            l2 = l2.next;
        }

        if(l2!=null){
            while(l2!=null){
                int sum = l2.val+carry;
                if(sum>=10){
                    int ud = sum%10;
                    ListNode node = new ListNode(ud);
                    tail.next = node;
                    carry=1;
                }else{
                    ListNode node = new ListNode(sum);
                    tail.next = node;
                    carry=0;
                }
                tail = tail.next;
                l2 = l2.next;
            }
            
        }
        
        if(l1!=null){
            while(l1!=null){
                int sum = l1.val+carry;
                if(sum>=10){
                    int ud = sum%10;
                    ListNode node = new ListNode(ud);
                    tail.next = node;
                    carry=1;
                }else{
                    ListNode node = new ListNode(sum);
                    tail.next = node;
                    carry=0;
                }
                tail = tail.next;
                l1 = l1.next;
            }
        }

        if(carry==1){
            ListNode node = new ListNode(1);
            tail.next = node;
        }

        return dummy.next;
    }
}