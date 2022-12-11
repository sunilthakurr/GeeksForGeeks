class Solution {
    public boolean canPair(int[] nums, int k) {
        // Code here
        for(int i=0;i<nums.length;i++)

        {

            nums[i]=nums[i]%k;

        }

        int count0=0;

        int index=-1;

        Arrays.sort(nums);

        for(int i=0;i<nums.length;i++)

        {

            if(nums[i]==0)

            count0++;

            else

            {

                index=i;

                break;

            }

        }

        if(count0%2!=0) return false;

        if(index==-1 && count0%2==0) return true;

        int left=index;

        int right=nums.length-1;

        while(left<right)

        {

            if((nums[left]+nums[right])!=k)

            return false;

            left++;

            right--;

        }

        return true;
    }
}
