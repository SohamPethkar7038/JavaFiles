// Input: arr[] = [1, 3, 2, 4]
// Output: [3, 4, 4, -1]

// You are given an array arr[] of integers, the task is to find the next greater element for each element of the array in order of their appearance in the array. Next greater element of an element in the array is the nearest element on the right which is greater than the current element.

import java.util.ArrayList;
import java.util.Collections;
import java.util.Stack; 

public class _3NextGreaterElement {

    public static ArrayList<Integer> nextGreaterElement(int[] arr) {
        Stack<Integer> st = new Stack<>();
        ArrayList<Integer> result = new ArrayList<>();

        for (int i = arr.length - 1; i >= 0; i--) {
            while (!st.isEmpty() && st.peek() <= arr[i]) {
                st.pop();
            }

            if (st.isEmpty()) {
                result.add(-1);
            } else {
                result.add(st.peek());
            }

            st.push(arr[i]);
        }

        Collections.reverse(result);
        return result;
    }

    public static void main(String[] args) {
        int[] arr = {1, 3, 2, 4};
        ArrayList<Integer> ans = nextGreaterElement(arr);

        System.out.print("Next greater elements: ");
        for (int val : ans) {
            System.out.print(val + " ");
        }
        System.out.println();
    }
}