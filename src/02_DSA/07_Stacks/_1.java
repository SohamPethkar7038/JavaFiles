
import java.util.ArrayList;
import java.util.Collections;
import java.util.Stack;

public class _1 {
    
    public static ArrayList<Integer> nextGreaterElement(int[] arr) {
        
        Stack<Integer> st = new Stack<>();
        ArrayList<Integer>result = new ArrayList<>();

        for(int i = arr.length-1; i >= 0; i--) {

            while(!st.isEmpty() && st.peek() < arr[i]) {
                st.pop();
            }

            if(st.isEmpty()) {
                result.add(-1);
            }
            else {
                result.add(st.peek());
            }

            st.push(arr[i]);
        }

        Collections.reverse(result);
        return result;

    }

    public static void main(String[] args) {
        int []arr = {1, 3, 2, 4};

        ArrayList<Integer> ans = nextGreaterElement(arr);

        for(int val : ans) {
            System.out.print(val  + " ");
        }
    }
}
