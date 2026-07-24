// Last updated: 7/24/2026, 7:59:23 PM
1/**
2 * Definition for singly-linked list.
3 * public class ListNode {
4 *     int val;
5 *     ListNode next;
6 *     ListNode() {}
7 *     ListNode(int val) { this.val = val; }
8 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
9 * }
10 */
11class Solution {
12    public ListNode reverse(ListNode head,ListNode end){
13        ListNode node = head;
14        ListNode prev = null;
15        ListNode temp = null;
16        ListNode stop = end.next;
17        while(node!=stop){
18            temp = node.next;
19            node.next = prev;
20            prev = node;
21            node = temp;
22        }
23        return prev;
24    }
25    public ListNode reverseBetween(ListNode head, int left, int right) {
26        ListNode L = head;
27        ListNode R = head;
28        ListNode prev = null;
29        int idx=1;
30        while(idx<left){
31            prev = L;
32            L = L.next;
33            idx++;
34        }
35        idx=1;
36        while(idx<right){
37            R = R.next;
38            idx++;
39        }
40        ListNode nE = R.next;
41        ListNode nH = reverse(L,R);
42
43        if (prev != null) {
44            prev.next = nH;
45        } else {
46            head = nH;
47        }
48
49        L.next = nE;
50
51        return head;
52    }
53}