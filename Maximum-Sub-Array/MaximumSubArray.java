class Solution {

    ArrayList<Integer> findSubarray(int a[], int n) {
        // code here
         ArrayList<Integer> ans=new ArrayList<>();

        int tosum=0;

        int sum=0;

        ArrayList<Integer> temp=new ArrayList<>();

        for(int i:a)

        {

            if(i>=0)

            {

                temp.add(i);

                sum+=i;

            }

            else

            {

                if(sum>tosum)

                {

                    ans.clear();

                    ans.addAll(temp);

                    tosum=sum;

                }

                sum=0;

                temp.clear();

            }

        }

         if(sum>tosum)

                {

                    ans.clear();

                    ans.addAll(temp);

                    tosum=sum;

                    sum=0;

                    temp.clear();

                }

        

       if(ans.size()!=0)

            return ans;

            

       ans.add(-1);

       return ans;

    
    }
}
