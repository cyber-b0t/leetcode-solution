// Last updated: 6/24/2026, 8:54:29 PM
class Solution {
    public void rotate(int[][] matrix) {
        for(int i=0;i<matrix.length;i++){
            for(int j=i;j<matrix[0].length;j++){
                int temp = matrix[j][i];
                matrix[j][i] = matrix[i][j];
                matrix[i][j] = temp;
            }
        }

        for(int i=0;i<matrix.length;i++){
            int L=0;
            int R=matrix.length-1;

            while(L<=R){
                int temp = matrix[i][R];
                matrix[i][R] = matrix[i][L];
                matrix[i][L] = temp;

                L++;
                R--;
            }
        }
    }
}