// Last updated: 8/6/2026, 2:31:52 AM
1class Solution {
2    public void setZeroes(int[][] matrix) {
3        boolean firstRowZero=false;
4        boolean firstColZero=false;
5
6        for(int i=0;i<matrix[0].length;i++){
7            if(matrix[0][i]==0){
8                firstRowZero=true;
9            }
10        }
11
12        for(int i=0;i<matrix.length;i++){
13            if(matrix[i][0]==0){
14                firstColZero=true;
15            }
16        }
17
18        for(int i=1;i<matrix.length;i++){
19            for(int j=1;j<matrix[0].length;j++){
20                if(matrix[i][j]==0){
21                    matrix[0][j]=0;
22                    matrix[i][0]=0;
23                }
24            }
25        }
26
27        for (int i = 1; i < matrix.length; i++) {
28            for (int j = 1; j < matrix[0].length; j++) {
29                if (matrix[i][0] == 0 || matrix[0][j] == 0) {
30                    matrix[i][j] = 0;
31                }
32            }
33        }
34
35        if (firstRowZero) {
36            for (int j = 0; j < matrix[0].length; j++) {
37                matrix[0][j] = 0;
38            }
39        }
40
41        if (firstColZero) {
42            for (int i = 0; i < matrix.length; i++) {
43                matrix[i][0] = 0;
44            }
45        }
46    }
47}