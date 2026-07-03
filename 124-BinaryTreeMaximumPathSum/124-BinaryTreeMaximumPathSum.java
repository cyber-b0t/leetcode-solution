// Last updated: 7/3/2026, 11:50:27 PM
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
17    int max=Integer.MIN_VALUE;
18    public int dfs(TreeNode root){
19
20        if(root==null){
21            return 0;
22        }
23
24        int left = Math.max(0, dfs(root.left));
25        int right = Math.max(0, dfs(root.right));
26
27        max = Math.max(max,root.val+left+right);
28
29        return root.val + Math.max(left,right);
30    }
31    public int maxPathSum(TreeNode root) {
32        
33        dfs(root);
34        return max;
35    }
36}