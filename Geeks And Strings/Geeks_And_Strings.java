class Solution {
    public static String removePair(String s) {
        // code here
        String str = String.valueOf(helper(s));
        if(str.length() == 0)
            return "-1";
        return str;
    }
    public static StringBuilder helper(String str){
        Stack<Character> st = new Stack<>();
        st.push(str.charAt(0));
        for(int i = 1; i < str.length(); ++i){
            if(!st.isEmpty() && st.peek() == str.charAt(i) ){
                st.pop();

            }
            else
                st.push(str.charAt(i));
        }
        String s = "";
        StringBuilder sb = new StringBuilder();
        while(!st.isEmpty()){
           sb.append(st.pop());
        }
        return sb.reverse();
    }
}
        
