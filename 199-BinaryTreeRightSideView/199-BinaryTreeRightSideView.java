// Last updated: 7/28/2026, 6:10:25 PM
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
17    public List<Integer> rightSideView(TreeNode root) {
18        List<Integer> ans = new ArrayList<>();
19
20        if(root==null) return ans;
21        
22        Queue<TreeNode> q = new LinkedList<>();
23        q.offer(root);
24
25        while(!q.isEmpty()){
26            int size = q.size();
27            for(int i=0;i<size;i++){
28                TreeNode node = q.poll();
29                if(node.left!=null){
30                    q.offer(node.left);
31                }
32                if(node.right!=null){
33                    q.offer(node.right);
34                }
35            
36                if(i==size-1){
37                    ans.add(node.val);
38                }
39            }
40        }
41
42        return ans;
43    }
44}