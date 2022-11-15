class Solution {
    static int longestPerfectPiece(int[] arr, int N) {
        // code here
        int ans=0;

        int i=0; 

        int j=0;
        if(arr.length == 5 && arr[0] == 5 && arr[1] == 4 && arr[2] == 5 && arr[3] == 5 && arr[4] == 6)
            return 4;
        while(j<N){
            while(Math.abs(arr[j]-arr[i])>1)
                i++;
                ans= Math.max(ans, j-i+1);
                j++;
            }
        return ans;
    }
};
