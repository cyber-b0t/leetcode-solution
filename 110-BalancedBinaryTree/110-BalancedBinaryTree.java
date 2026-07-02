// Last updated: 7/3/2026, 2:19:04 AM
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
17    boolean res=true;
18    public int dfs(TreeNode root){
19        if(root==null){
20            return 0;
21        }
22
23        int left = dfs(root.left);
24        int right = dfs(root.right);
25
26        int calc = Math.abs(left-right);
27        if(calc>1) res=false;
28        
29        return 1+Math.max(left,right);
30
31    }
32    public boolean isBalanced(TreeNode root) {
33        dfs(root);
34
35        return res;
36    }
37}