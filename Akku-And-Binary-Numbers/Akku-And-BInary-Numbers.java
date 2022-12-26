class Solution{
    
    void precompute(){
        // Code Here
    }
    long solve(long L, long R){
        // Code here
        
        long count = 0;  // for storing the total no. of elements lie in the range
        long temp = 0;   // for checking purpose
        
        // we use 3 nested loop to find all the combination of 3 one's 
        // 10^18 is almost equal to 2 ^64 so we run our loop from 0 - 63.
        
        // we storing the all the values that is possible with 3 set bits in temp and then 
        // check whether the value is lying in the range or not. If it lies in the range 
        // then we simply increase our count by one otherwise simply check next permutation.
        
        for(int i = 0; i < 63; ++i){
            for(int j = i + 1; j < 63; ++j){
                for(int k = j + 1; k < 63; ++k){
                    temp = (long)(Math.pow(2, i) + Math.pow(2, j) + Math.pow(2, k));
                    if(temp >= L && temp <= R)
                        ++count;
                }
            }
        }
        return count;
        
    }
    
}
// we can also use simple and operation and right shift but it gives TLE in last 2 
//   testcases.

// Time Complexity :- O(63^3)
// Space Complexity :- O(1)

// By :- Sunil Kumar
