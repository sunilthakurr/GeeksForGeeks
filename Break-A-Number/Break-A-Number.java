class Solution{
    int waysToBreakNumber(int N){
        // code here
        if(N == 1)
            return 3;
        long temp = (N + 1);
        long result = (temp * (temp + 1) / 2) % 1000000007;
        return (int)result;
    }
}
