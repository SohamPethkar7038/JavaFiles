// Given an array arr[] of integers, for each element in the array, find the nearest smaller element on its left. If there is no such smaller element, return -1 for that position.

// Input: arr[] = [1, 6, 2]
// Output: [-1, 1, 1]


import java.util.ArrayList;
import java.util.Stack;


public class _4PreviousSmallerElement {

    public static ArrayList<Integer> previousSmallerElement(int[] arr) {

        Stack<Integer> st = new Stack<>();

        ArrayList<Integer> result = new ArrayList<>();

        for(int i=0; i <= arr.length-1; i++) {
            
            while(!st.isEmpty() && st.peek() >= arr[i]) {
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

        return result;
    }

    public static void main(String[] args) {
        int[] arr = {1, 6, 2};

        ArrayList<Integer> ans = previousSmallerElement(arr);

        System.out.println("Previous smaller element :");

        for(int val : ans) {
            System.out.print(val + " ");
        }

        System.out.println();
        
    }
}
