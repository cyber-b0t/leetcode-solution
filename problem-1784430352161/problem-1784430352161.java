// Last updated: 7/19/2026, 8:35:52 AM
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
17    int cnt=0;
18    public int dfs(TreeNode root){
19        if(root==null) return 0;
20        if(root.left==null && root.right==null){
21            cnt+=1;
22            return root.val;
23        }
24
25        int left = dfs(root.left);
26        int right = dfs(root.right);
27
28        int max = Math.max(left,right);
29        if(root.val>=max){
30            cnt++;
31        }
32
33        return Math.max(root.val,max);
34    }
35    public int countDominantNodes(TreeNode root) {
36        dfs(root);
37        return cnt;
38    }
39}