// Last updated: 7/26/2026, 6:39:27 PM
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
17    public boolean dfs(TreeNode r1,TreeNode r2){
18        if(r1==null && r2==null) return true;
19        if(r1==null || r2==null) return false;
20        if(r1.val!=r2.val) return false;
21
22        boolean left = dfs(r1.left,r2.right);
23        boolean right = dfs(r1.right,r2.left);
24
25        return left && right;
26    }
27    public boolean isSymmetric(TreeNode root) {
28        return dfs(root,root);
29    }
30}