class Solution {
	static long countPairs(int n, int[] arr, int k) {
		// code here
		int[] f = new int[k];
		long ans=0;
		for(int val : arr) {
		    val%=k;
		    ans+=(long)f[val];
		    f[val]++;
		}
		return ans;
	}
}
