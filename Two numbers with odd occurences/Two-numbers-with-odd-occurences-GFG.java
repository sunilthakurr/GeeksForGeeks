class Solution
{
    public int[] twoOddNum(int Arr[], int N)
    {
        // code here
        return two(Arr, N);
    }
    public int[] two(int[] arr, int n){
        int xor= 0 ,res =0 , res1 =0;

       int [] result = new int [2];

        for(int i= 0;i< n ;i++){

                xor^= arr[i] ;

        }

        int rgt =  xor& ~(xor-1) ;

        for(int i= 0 ;i< n; i++){

            if((arr[i] & rgt) != 0){

                res= res^arr[i];

            }

            else{

                res1 = res1^arr[i] ;

            }

            

            if(res > res1){

                result[0] = res;

                result[1] = res1;

                

            }

            else{

                result[1] = res;

                result[0] = res1;

            }

        }

        return result;
    }
}
