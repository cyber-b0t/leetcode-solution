// Last updated: 7/4/2026, 12:56:16 AM
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
17    public List<List<Integer>> levelOrder(TreeNode root) {
18        Queue<TreeNode> q = new ArrayDeque<>();
19        List<List<Integer>> list = new ArrayList<>();
20
21        if(root==null){
22            return new ArrayList<>();
23        }else{
24            q.add(root);
25        }
26
27        while(!q.isEmpty()){
28            List<Integer> temp = new ArrayList<>();
29            int s = q.size();
30            for(int i=0;i<s;i++){
31                TreeNode el = q.poll();
32                temp.add(el.val);
33                if(el.left!=null) q.add(el.left);
34                if(el.right!=null) q.add(el.right);
35            }
36            list.add(temp);
37        }
38
39        return list;
40    }
41}