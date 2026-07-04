// Last updated: 7/4/2026, 1:32:03 PM
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
17    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
18        Queue<TreeNode> q = new ArrayDeque<>();
19        List<List<Integer>> list = new ArrayList<>();
20        int lvl=0;
21
22        if(root==null){
23            return new ArrayList<>();
24        }
25
26        q.offer(root);
27
28        while(!q.isEmpty()){
29            List<Integer> temp = new ArrayList<>();
30            int s = q.size();
31
32            for(int i=0;i<s;i++){
33                TreeNode el = q.poll();
34                temp.add(el.val);
35
36                if(el.left!=null) q.offer(el.left);
37                if(el.right!=null) q.offer(el.right);
38            }
39
40            if(lvl%2==1){
41                int x=0,y=temp.size()-1;
42
43                while(x<=y){
44                    int n = temp.get(y);
45                    temp.set(y,temp.get(x));
46                    temp.set(x,n);
47                    x++;
48                    y--;
49                }
50            }
51
52            list.add(temp);
53            lvl++;
54        }
55
56        return list;
57    }
58}