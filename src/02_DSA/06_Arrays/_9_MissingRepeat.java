// Given an unsorted array arr[] of size n, containing elements from the range 1 to n, it is known that one number in this range is missing, and another number occurs twice in the array, find both the duplicate number and the missing number.

// Input: arr[] = [4, 3, 6, 2, 1, 1]
// Output: [1, 5]
// Explanation: Repeating number is 1 and the missing number is 5.


// better solution....not optimize


import java.util.ArrayList;
class Solution {
    public ArrayList<Integer> findTwoElement(int arr[]) {

        int n = arr.length;

        int []freq = new int[n + 1];

        // count occurenece
        for(int i = 0; i < n; i++) {
            freq[arr[i]]++;
        }

        int repeat = -1;
        int missing = -1;

        for(int i = 1; i <= n; i++) {

            if(freq[i] == 2) repeat = i;

            if(freq[i] == 0) missing = i;

            if(repeat != -1 && missing != -1) {
                break;
            }
        }

        ArrayList<Integer> result = new ArrayList<>();
        result.add(repeat);
        result.add(missing);

        return result;
    }
}
public class _9_MissingRepeat{
    public static void main(String[] args) {
        int arr[] = {4,3,6,2,1,1};


        Solution sol = new Solution();
        ArrayList<Integer> repeatMissingElement = sol.findTwoElement(arr);
        System.out.println(repeatMissingElement);


    }
}

// optimize solution _10_RepeatMissingOptimize.java