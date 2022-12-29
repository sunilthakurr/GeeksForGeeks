class Solution {
    static int result = Integer.MIN_VALUE;
    public static int findLargestSubtreeSum(Node root) {
        // code here
        result = Integer.MIN_VALUE;
        helper(root);
        return result;
    }
    public static int helper(Node root){
        if(root == null)
            return 0;
        
        int left = helper(root.left);
        int right = helper(root.right);
        result = Math.max(root.data + left + right, result);
        return root.data + left + right;
        
    }
}
        
