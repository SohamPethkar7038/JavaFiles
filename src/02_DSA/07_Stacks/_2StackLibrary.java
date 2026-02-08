import java.util.Stack;

public class _2StackLibrary{
    
    public static void main(String[] args) {
        
        Stack<Integer> st = new Stack<>();

        st.push(10);
        st.push(20);
        st.push(30);
        st.push(40);

        System.out.println(st.peek());  // top()
        st.pop();
        System.out.println(st.peek());  // new top

        System.out.println();

    }
}