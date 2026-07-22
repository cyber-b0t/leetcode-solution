// Last updated: 7/22/2026, 7:07:41 PM
1class Solution {
2    public boolean backtrack(char[][] board,String word,int i,int j,int k){
3        if(k==word.length()){
4            return true;
5        }
6
7        if (i<0 || i>=board.length || j<0 || j>=board[0].length || board[i][j] != word.charAt(k)) {
8            return false;
9        }
10
11        char temp = board[i][j];
12        board[i][j] = '#';
13
14        int[] di = {1, -1, 0, 0};
15        int[] dj = {0, 0, 1, -1};
16
17        boolean found=false;
18
19        for (int dir = 0; dir < 4; dir++) { 
20            if (backtrack(board, word, i+di[dir], j+dj[dir], k+1)){
21                found=true;
22                break;
23            } 
24        }
25
26        board[i][j] = temp;
27
28        return found;
29    }
30    public boolean exist(char[][] board, String word) {
31
32        for(int i=0;i<board.length;i++){
33            for(int j=0;j<board[0].length;j++){
34                boolean x =backtrack(board,word,i,j,0);
35                if(x){
36                    return x;
37                }
38            }
39        }
40
41        return false;
42    }
43}