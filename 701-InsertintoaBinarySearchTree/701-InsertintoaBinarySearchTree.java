// Last updated: 8/1/2026, 2:14:46 AM
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
17    public TreeNode insertIntoBST(TreeNode root, int val) {
18
19        if(root==null){
20            root = new TreeNode(val);
21            return root;
22        }
23        TreeNode node = root;
24        while(true){
25            if(node.val>val){
26                if(node.left!=null) node=node.left;
27                else{
28                    node.left = new TreeNode(val);
29                    break;
30                }
31            }else{
32                if(node.right!=null) node=node.right;
33                else{
34                    node.right = new TreeNode(val);
35                    break;
36                }
37            }
38        }
39
40        return root;
41
42    }
43}