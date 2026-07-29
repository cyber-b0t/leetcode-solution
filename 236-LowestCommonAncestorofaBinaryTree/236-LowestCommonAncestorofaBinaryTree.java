// Last updated: 7/29/2026, 10:06:53 PM
1/**
2 * Definition for a binary tree node.
3 * public class TreeNode {
4 *     int val;
5 *     TreeNode left;
6 *     TreeNode right;
7 *     TreeNode(int x) { val = x; }
8 * }
9 */
10class Solution {
11    public boolean find(TreeNode root, TreeNode T, ArrayList<TreeNode> arr){
12        if(root == null){
13            return false;
14        }
15        arr.add(root);
16
17        if(root==T){
18            return true;
19        }
20
21        if(find(root.left,T,arr)){
22            return true;
23        }
24        if(find(root.right,T,arr)){
25            return true;
26        }
27        arr.remove(arr.size()-1);
28
29        return false;
30    }
31    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
32        ArrayList<TreeNode> arrX = new ArrayList<>();
33        ArrayList<TreeNode> arrY = new ArrayList<>();
34
35        find(root,p,arrX);
36        find(root,q,arrY);
37
38        int i=0;
39
40        TreeNode node = root;
41        int n = Math.min(arrX.size(), arrY.size());
42        while(i<n){
43            if(arrX.get(i)==arrY.get(i)){
44                node=arrX.get(i);
45            }
46            i++;
47        }
48
49        return node;
50    }
51}