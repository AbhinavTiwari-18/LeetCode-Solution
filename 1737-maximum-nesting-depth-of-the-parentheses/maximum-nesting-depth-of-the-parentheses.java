class Solution {
    public int maxDepth(String s) {
        Stack<Character> st = new Stack<>();
        int maxCount = 0;
        int count = 0;
        if(s.length() == 1 && s.charAt(0) >= 1  ||  s.charAt(0) <= 9 ){
            return count;
        }

        for(int i = 0; i<s.length(); i++){
            if(s.charAt(i) == '('){
                st.push(s.charAt(i));
                count++;
                maxCount = Math.max(maxCount , count);
            }
            else if(s.charAt(i) == ')'){
                st.push(s.charAt(i));
                count--;
            }

        }
        return maxCount;
    }
}