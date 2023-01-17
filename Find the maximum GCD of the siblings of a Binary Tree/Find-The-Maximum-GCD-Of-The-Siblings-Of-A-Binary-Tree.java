/*class Node
{
    int data;
    Node left, right;

    Node(int item)
    {
        data = item;
        left = right = null;
    }
}
 */

class Solution {
    int maxGCD(Node root) {
        // code here 
        int max = 0;
        int ans = 0;
        int gcdContainer;
        Queue<Node> q = new LinkedList<>();
        q.add(root);
        while(q.size() != 0){
            Node temp = q.poll();
            if(temp.left != null && temp.right != null){
                gcdContainer = gcd(temp.left.data, temp.right.data);
                if(gcdContainer >= max){
                    max = gcdContainer;
                    ans = temp.data;
                }
            }
            if(temp.left != null)
                q.add(temp.left);
            if(temp.right != null)
                q.add(temp.right);
        }
        return ans;
    }
    public static int gcd(int a, int b){
        if(b == 0)
            return a;
        return gcd(b, a % b);
    }
}
