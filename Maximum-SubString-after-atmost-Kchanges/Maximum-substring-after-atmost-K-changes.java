class Solution
{
    
    public int characterReplacement(String s, int k)

    {

        int i=0 , j=0 , max=0 , ans=0;

        HashMap<Character,Integer> map= new HashMap<>();

        while(j<s.length()){

            map.put(s.charAt(j),map.getOrDefault(s.charAt(j),0)+1);

            max= Math.max(max, map.get(s.charAt(j)));

            if((j-i+1)-max>k){

                map.put(s.charAt(i),map.get(s.charAt(i))-1);

                i++;

            }

            ans= Math.max(ans,j-i+1);

            j++;

        }

        return ans;

    }
}

// problem link :- https://practice.geeksforgeeks.org/problems/maximum-sub-string-after-at-most-k-changes3220/1
