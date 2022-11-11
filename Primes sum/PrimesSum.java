class Solution {
    static String isSumOfTwo(int N){
        // code here
        if(N <= 2)
            return "No";
        for(int i = 2; i < N; ++i){
            if(isPrime(i) && isPrime(N - i))
                return "Yes";
        }
        return "No";
    }
    public static boolean isPrime(int N){
        int root = (int)Math.sqrt(N);
        for(int i = 2; i <= root; ++i){
            if(N % i == 0)
                return false;
        }
        return true;
    }
    
    
}

//problem link :- https://practice.geeksforgeeks.org/problems/primes-sum5827/1
