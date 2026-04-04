
// ******************  problem : Kadane Algorithm ********************

// You are given an integer array arr[]. You need to find the maximum sum of a subarray (containing at least one element) in the array arr[].

// Note : A subarray is a continuous part of an array.

// Examples:

// Input: arr[] = [2, 3, -8, 7, -1, 2, 3]
// Output: 11
// Explanation: The subarray [7, -1, 2, 3] has the largest sum 11.


// kadane algorithm for returning maxSum of subbarray

class Solution {

    public int maxSubarraySum(int[] arr) {
        
        int currSum = 0;
        int maxSum = Integer.MIN_VALUE;

        for(int i = 0; i < arr.length; i++) {

            currSum += arr[i];
            maxSum = Math.max(currSum, maxSum);

            if(currSum < 0) {
                currSum = 0;
            }
        }

        return maxSum;

    }
}
public class _6MaximumSubarraySum {
    public static void main(String[] args) {

        int[] arr = {2, 3, -8, 7, -1, 2, 3};
        Solution sol = new Solution();

        int result = sol.maxSubarraySum(arr);
        System.out.println(result);
    }
}


// printing subarray who is having max sum is problem number 9