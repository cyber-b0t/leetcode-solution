// Last updated: 7/3/2026, 2:03:06 AM
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
17    int diameter=0;
18    public int dfs(TreeNode root){
19        if(root==null){
20            return 0;
21        }
22
23        int left = dfs(root.left);
24        int right = dfs(root.right);
25
26        diameter = Math.max(diameter,left+right);
27
28        return 1+Math.max(left,right);
29    }
30    public int diameterOfBinaryTree(TreeNode root) {
31        int x = dfs(root);
32
33        return diameter;
34    }
35}