class Solution {
    long luckyPermutations(int N, int M, int arr[], int[][] graph) {
        // Code here
        int[][] adj = new int[N + 1][N + 1];
        
        for(int[] e : graph){
            adj[e[0]][e[1]]++;
            adj[e[1]][e[0]]++;
        }
        
        long[][] dp = new long[N][(1 << N)];
        
        for(int i=0; i<N; i++){
            dp[i][(1 << i)]++;
        }
        
        for(int i=1; i < (1 << N); i++){
            for(int j=0; j<N; j++){
                
                if(((i >> j) & 1) != 0 ){
                    
                    for(int k=0; k<N; k++){
                        
                        if(k != j && arr[k] != arr[j] && ((i >> k) & 1) != 0 && adj[arr[j]][arr[k]] == 1){
                            dp[j][i] += dp[k][(i ^ (1 << j))];
                        }
                        
                    }
                    
                }
                
            }
        }
        
        long counter = 0l;
        
        for(int i=0; i<N; i++){
            counter += dp[i][(1 << N) - 1];
        }
        
        return counter;
    }
}
