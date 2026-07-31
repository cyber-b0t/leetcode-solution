// Last updated: 8/1/2026, 1:55:12 AM
1/**
2 * Definition for a binary tree node.
3 * public class TreeNode {
4 *     int val;
5 *     TreeNode left;
6 *     TreeNode right;
7 *     TreeNode() {}
8 *     TreeNode(int val) { this.val = val; }
9 *     TreeNode(int val, TreeNode left, TreeNode right) {
10 *         this.val = val;
11 *         this.left = left;
12 *         this.right = right;
13 *     }
14 * }
15 */
16class Solution {
17    public TreeNode searchBST(TreeNode root, int val) {
18        while(root!=null && root.val!=val){
19            if(root.val<val){
20                root = root.right;
21            }else{
22                root = root.left;
23            }
24        }
25
26        return root;
27    }
28}