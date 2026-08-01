// Last updated: 8/2/2026, 3:38:02 AM
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
17    public TreeNode deleteNode(TreeNode root, int key) {
18        if (root == null) return null;
19
20        if (key < root.val) {
21            root.left = deleteNode(root.left, key);
22        } else if (key > root.val) {
23            root.right = deleteNode(root.right, key);
24        } else {
25
26            if (root.left == null) return root.right;
27
28            if (root.right == null) return root.left;
29
30            TreeNode successor = findMin(root.right);
31            root.val = successor.val;
32            root.right = deleteNode(root.right, successor.val);
33        }
34
35        return root;
36    }
37
38    private TreeNode findMin(TreeNode node) {
39        while (node.left != null) {
40            node = node.left;
41        }
42        return node;
43    }
44}
45