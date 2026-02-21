// Given an array arr[] with non-negative integers representing the height of blocks. If the width of each block is 1, compute how much water can be trapped between the blocks during the rainy season. 

// Examples:

// Input: arr[] = [3, 0, 1, 0, 4, 0 2]
// Output: 10
// Explanation: Total water trapped = 0 + 3 + 2 + 3 + 0 + 2 + 0 = 10 units.



class Solution {

    public int rainwaterTrapping(int arr[]) {

        int n = arr.length;

        int l = 0;
        int r = n-1;

        int leftMax = 0;
        int rightMax = 0;
        int ans = 0;

        while(l < r) {

            if(arr[l] <= arr[r]) {

                if(arr[l] >= leftMax) {
                    leftMax = arr[l];
                }
                else {
                    ans += leftMax - arr[l];
                }

                l++;
            }

            else {
                
                if(arr[r] >= rightMax) {
                    rightMax = arr[r];
                }
                else {
                    ans += rightMax - arr[r];
                }

                r--;
            }

        }


        return ans;
    }
}


public class _4RainwaterTrapping {
    public static void main(String[] args) {

        int arr[] = {3,0,1,0,4,0,2};

        Solution sol = new Solution();
        
        int result = sol.rainwaterTrapping(arr);
        System.out.println("total water trap : " + result);
    }
}
