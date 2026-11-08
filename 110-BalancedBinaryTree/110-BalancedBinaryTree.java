// Last updated: 11/8/2026, 4:56:27 PM
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
17
18    boolean ans = true;
19
20    public int dfs(TreeNode root){
21        if(root==null){
22            return 0;
23        }
24
25        int left = dfs(root.left);
26        int right = dfs(root.right);
27
28        if(Math.abs(left-right)>1){
29            ans = false;
30        }
31        return 1+Math.max(left,right);
32    }
33    public boolean isBalanced(TreeNode root) {
34        dfs(root);
35
36        return ans;
37        
38    }
39}