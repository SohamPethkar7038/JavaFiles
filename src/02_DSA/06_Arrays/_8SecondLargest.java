class Solution {
    public int secondLargest(int arr[]) {

        if(arr == null || arr.length <= 2) {
            return -1;
        }

        int largest = arr[0];
        int second = Integer.MIN_VALUE;

        for(int i = 0; i < arr.length; i++) {
            if(arr[i] > largest) {
                second = largest;
                largest = arr[i];
            }
            else if(arr[i] < largest && arr[i] > second) {
                second = arr[i];
            }
        }

        return second;
    }
}

public class _8SecondLargest {
    public static void main(String[] args) {
        int arr[] = {12, 100, 1, 10, 99, 1};

        Solution sol = new Solution();
        int result = sol.secondLargest(arr);
        System.out.println(result);

    }
}
