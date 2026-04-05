import java.util.*;
import java.util.Stack;

class Solution {
    public boolean isParenthesisBalanced(String s) {

        Stack<Character> st = new Stack<>();
        
        for(int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);

            if(ch == '{' || ch == '(' || ch =='[') {
                st.push(ch);
            }
            else {

                if(st.isEmpty()) return false;

                if((st.peek() == '{' && ch == '}') ||
                   (st.peek() == '(' && ch ==')') ||
                    (st.peek() == '[' && ch == ']')) {
                        st.pop();
                }
                else {
                    return false;
                }
            }
        }
        return st.isEmpty();
    }
}
public class _5ParanthesisChecker {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // taking input
        System.out.println("Enter string : ");
        String s = sc.nextLine();

        // function call
        Solution sol = new Solution();
        boolean result = sol.isParenthesisBalanced(s);
        System.out.println(result);

    }
}
