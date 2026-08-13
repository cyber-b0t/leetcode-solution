// Last updated: 8/14/2026, 3:52:44 AM
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
17    int time=-1;
18    TreeNode startNode = null;
19    public void dfs(TreeNode root, HashMap<TreeNode,TreeNode> mpp,int start){
20        if(root==null){
21            return;
22        }
23        if(root.val==start && startNode==null){
24            startNode=root;
25        }
26
27        if(root.left!=null) mpp.put(root.left,root);
28        if(root.right!=null) mpp.put(root.right,root);
29
30        dfs(root.left,mpp,start);
31        dfs(root.right,mpp,start);
32    }
33
34    public void bfs(Queue<TreeNode> q, HashMap<TreeNode,TreeNode> mpp, HashSet<TreeNode> vis){
35        int size = q.size();
36
37        for(int i=0;i<size;i++){
38            TreeNode node = q.poll();
39            vis.add(node);
40            if(mpp.get(node)!=null && !vis.contains(mpp.get(node))) q.offer(mpp.get(node));
41            if(node.left!=null && !vis.contains(node.left)) q.offer(node.left);
42            if(node.right!=null && !vis.contains(node.right)) q.offer(node.right);
43        }
44        time++;
45    }
46    public int amountOfTime(TreeNode root, int start) {
47        HashMap<TreeNode,TreeNode> mpp = new HashMap<>();
48        dfs(root,mpp,start);
49        Queue<TreeNode> q = new LinkedList<>();
50
51        HashSet<TreeNode> vis = new HashSet<>();
52
53        q.offer(startNode);
54        while(!q.isEmpty()){
55            bfs(q,mpp,vis);        
56        }
57
58        return time;
59
60    }
61}