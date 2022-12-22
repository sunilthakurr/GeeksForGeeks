class Solution{
    //Function to count subarrays with sum equal to 0.
    public static long findSubarray(long[] arr ,int n) 
    {
        //Your code here
        HashMap<Long, Long> map = new HashMap<>();
        
        long sum = 0;
        
        long ans = 0;
        
        for(long x : arr)
        {
            sum += x;
            
            if(map.containsKey(sum))
            {
                ans += map.get(sum);
            }
            
            if(sum==0)
            {
                ans++;
            }
            
            map.put(sum, map.getOrDefault(sum, 0l) + 1l);
            
        }
        
        return ans;
    }
}
