// Given an array arr[] with non-negative integers representing the height of blocks. If the width of each block is 1, compute how much water can be trapped between the blocks during the rainy season. 

// Examples:

// Input: arr[] = [3, 0, 1, 0, 4, 0 2]
// Output: 10
// Explanation: Total water trapped = 0 + 3 + 2 + 3 + 0 + 2 + 0 = 10 units.

// ans for better solution 

// min(leftMax,rightMax) - heightofbuilding......formula for calculating 
//                                               rainwater trapping


// for optimal solution go on 4th program



class Solution {
    public int RainwaterTrappingPrefixSuffix(int []arr) {

        int n = arr.length;

        // step 1 : to create suffix and prefix array

        int []leftMax = new int[n];
        int []rightMax = new int[n];

        // build leftMax(suffix) array
        leftMax[0] = arr[0];
        for(int i = 1; i < n; i++) {
            leftMax[i] = Math.max(leftMax[i - 1], arr[i]);
        }

        // build rightMax(prefix) array
        rightMax[n - 1] = arr[n - 1];

        for(int i = n - 2; i >= 0; i--) {
            rightMax[i] = Math.max(rightMax[i + 1], arr[i]);
        }

        // apply formula

        int water = 0;

        for(int i = 0; i < n; i++) {
            water += Math.min(leftMax[i], rightMax[i]) - arr[i];
        }

        return water;

    }
}

public class _5RainwaterTrappingArrays{

    public static void main(String []args) {
        
        int arr[] = {3,0,1,0,4,0,2};

        Solution sol = new Solution();

        int result = sol.RainwaterTrappingPrefixSuffix(arr);
        System.out.println("Total water trapped : " + result);
    }
}