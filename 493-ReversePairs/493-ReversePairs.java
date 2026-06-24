// Last updated: 6/24/2026, 8:53:59 PM
class Solution {

    int cnt=0;

    public void merge(int[] arr,int L, int mid , int R){
        int n1 = mid-L+1;
        int n2 = R-mid;

        int[] L_array = new int[n1];
        int[] R_array = new int[n2];

        for(int i=0;i<n1;i++){
            L_array[i] = arr[L+i];
        }

        for(int i=0;i<n2;i++){
            R_array[i] = arr[mid+1+i];
        }

        int x=0,y=0;

        while(x<n1 && y<n2){
            if(L_array[x]>(long)2*R_array[y]){
                cnt+=n1-x;
                y++;
            }else{
                x++;
            }
            
        }



        int i=0,j=0;
        int k=L;

        while(i<n1 && j<n2){
            if(L_array[i]<=R_array[j]){
                arr[k] = L_array[i];
                i++;
            }else{
                arr[k] = R_array[j];
                j++;
            }
            k++;
        }

        while (i < n1) {
            arr[k] = L_array[i];
            i++;
            k++;
        }

        while (j < n2) {
            arr[k] = R_array[j];
            j++;
            k++;
        }
    }

    public void mergesort(int[] arr, int L , int R){
        if(L<R){
            int mid = (L+R)/2;
            mergesort(arr,L,mid);
            mergesort(arr,mid+1,R);
            merge(arr,L,mid,R);
        }
        
        return;
    }

    public int reversePairs(int[] nums) {

        mergesort(nums,0,nums.length-1);
        return cnt;
        
    }
}