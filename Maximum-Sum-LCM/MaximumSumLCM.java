class Solution {
    static long maxSumLCM(int n) {
        // code here
        if(n == 1)
        return 1;
        long ans=1+n;

        long res=0;     

        for(long i=2;i<=Math.sqrt(n);i++){

         long a=i;

         long b=n/i;

         if(n%a==0){

         if(a!=b){

             ans+=a+b;

         }

         else{

             ans+=a;

         }

        }

        }

       

        return ans;
    }
}
