// Last updated: 7/28/2026, 4:28:16 PM
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
17    class Pair {
18        TreeNode node;
19        int row, col;
20        Pair(TreeNode node, int row, int col) {
21            this.node = node;
22            this.row = row;
23            this.col = col;
24        }
25    }
26
27    public List<List<Integer>> verticalTraversal(TreeNode root) {
28        // col -> row -> min-heap of vals
29        TreeMap<Integer, TreeMap<Integer, PriorityQueue<Integer>>> map = new TreeMap<>();
30
31        Queue<Pair> q = new LinkedList<>();
32        q.offer(new Pair(root, 0, 0));
33
34        while (!q.isEmpty()) {
35            Pair cur = q.poll();
36            if (cur.node == null) continue;
37
38            map
39                .computeIfAbsent(cur.col, k -> new TreeMap<>())
40                .computeIfAbsent(cur.row, k -> new PriorityQueue<>())
41                .offer(cur.node.val);
42
43            q.offer(new Pair(cur.node.left, cur.row + 1, cur.col - 1));
44            q.offer(new Pair(cur.node.right, cur.row + 1, cur.col + 1));
45        }
46
47        List<List<Integer>> result = new ArrayList<>();
48
49        // columns come out sorted (left -> right)
50        for (int col : map.keySet()) {
51            List<Integer> colList = new ArrayList<>();
52            TreeMap<Integer, PriorityQueue<Integer>> rowMap = map.get(col);
53
54            // rows come out sorted (top -> bottom)
55            for (int row : rowMap.keySet()) {
56                PriorityQueue<Integer> pq = rowMap.get(row);
57                while (!pq.isEmpty()) {
58                    colList.add(pq.poll()); 
59                }
60            }
61            result.add(colList);
62        }
63
64        return result;
65    }
66}