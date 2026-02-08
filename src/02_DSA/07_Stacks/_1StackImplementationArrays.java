class Stack{
    private int capacity;
    private int[] arr;
    private int top;

    Stack(int c) {
        this.capacity = c;
        arr = new int[c]; 
        this.top = -1;
    }


    void push(int data) {

        if(this.top == this.capacity - 1) {
            System.out.println("Stack is in overflow condition.");
            return;
        }

        this.top++;
        this.arr[this.top] = data;
    }

    int pop() {

        if(this.top == -1) {
            System.out.println("Underflow condition");
            return Integer.MIN_VALUE;
        }

        int popped = this.arr[this.top];
        this.top--;
        return popped;
    }

    int getTop() {

        if(this.top == -1) {
            System.out.println("Underflow condtion");
            return Integer.MIN_VALUE;
        }

        return this.arr[this.top];
    }


    boolean isFull() {
        return this.top == this.capacity -1;
    }

    int size() {
        return this.top+1;
    }

    boolean isEmpty() {
        return this.top == -1;
    }

}

public class _1StackImplementationArrays {
    public static void main(String[] args) {
        Stack st = new Stack(6);

        st.push(10);
        st.push(20);
        st.push(30);

        System.out.println(st.getTop());

        st.push(40);
        st.push(50);
        st.push(60);
        System.out.println(st.getTop());

        st.pop();
        st.pop();

        System.out.println(st.getTop());
        System.out.println(st.isEmpty());
        System.out.println(st.isFull());

    }
}
