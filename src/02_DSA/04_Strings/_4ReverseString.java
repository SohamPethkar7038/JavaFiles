import java.util.Stack;

class Solution{
    public String reverseString(String s){
        Stack<Character> st = new Stack<>();

        for(int i=0;i<s.length();i++) {
            st.push(s.charAt(i));
        }

        StringBuilder result=new StringBuilder();

        while(!st.empty()){
            result.append(st.pop());
        }

        return result.toString();
    }
}

public class _4ReverseString {
    public static void main(String[] args) {    
        
        Solution sol=new Solution();
        
        String input="hello";

        String ans=sol.reverseString(input);
        System.out.println("reverse is "+ans);
    }
}
