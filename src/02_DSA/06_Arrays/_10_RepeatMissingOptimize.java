// Given an unsorted array arr[] of size n, containing elements from the range 1 to n, it is known that one number in this range is missing, and another number occurs twice in the array, find both the duplicate number and the missing number.

// Input: arr[] = [4, 3, 6, 2, 1, 1]
// Output: [1, 5]
// Explanation: Repeating number is 1 and the missing number is 5.


// optimize solution

import java.util.ArrayList;

class Solution {
    public ArrayList<Integer>findTwoElement(int []arr) {

        int n = arr.length;

        long SN = (long)n * (n + 1) / 2;
        
        long S2N = (long)n * (n + 1) * (2 * n + 1) / 6;

        long S1 = 0, S2 = 0;

        for(int i = 0; i < n; i++) {
            S1 += arr[i];
            S2 += arr[i] * arr[i]; 
        }

        // x = repeat    y = missing

        long val1 = S1 - SN;
        long val2 = S2 - S2N;

        val2 = val2 / val1;

        long x = (val1 + val2) / 2;
        long y = x - val1;

        ArrayList<Integer> result = new ArrayList<>();
        result.add((int)x);
        result.add((int)y);

        return result;
    }
}

public class _10_RepeatMissingOptimize {
    public static void main(String[] args) {
        //  int arr[] = {4,3,6,2,1,1};

        int arr[] = {1,3,3};


        Solution sol = new Solution();
        ArrayList<Integer> repeatMissingElement = sol.findTwoElement(arr);
        System.out.println(repeatMissingElement);
    }
}
