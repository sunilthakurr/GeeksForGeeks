class Solution
{

	public int minDifference(int arr[], int n) 
	{ 
	    // Your code goes here
	    int sum =0 ;

     int addsum =0 ;

    for(int i =0;i<n;i++){

        sum += arr[i];

    }

    int dp[][] = new int[n][sum];

    

    for(int i =0 ;i<n;i++){

        Arrays.fill(dp[i],-1);

    }

    int ans = func(sum , addsum , 0 , arr, dp );

    return ans;

 } 

 

 public int func(int sum , int addsum , int i  , int arr[] , int dp[][]){

     if(i == arr.length){

         return Math.abs(addsum - sum);

     }

     if(dp[i][addsum] != -1){

         return dp[i][addsum];

     }

    

     int x = func(sum-arr[i] , addsum+arr[i],i+1 , arr,dp);

     

     int y = func(sum , addsum , i+1, arr, dp);

     

     return dp[i][addsum] = Math.min(x,y);
	} 
}
