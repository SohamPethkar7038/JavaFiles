import java.util.Scanner;

class Solution {

    public  int PeakElement(int[] arr) {
        int n = arr.length;

        if(n == 1) return 0;

        if(arr[0] > arr[1]) return 0;

        if(arr[n-1] > arr[n-2]) return n-1;

        int low = 1;
        int high = n-2;

        while(low <= high) {

            int mid = low + (high - low) / 2;

            if(arr[mid] > arr[mid - 1] && arr[mid] > arr[mid + 1]) {
                return arr[mid];
            }
            else if(arr[mid] > arr[mid - 1]){
                low = mid + 1;
            }
            else{
                high = mid - 1; 
            }
        }

        return -1;
    }
}

public class _3PeakElement {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter the number of element : ");
        int n = sc.nextInt();

        int []arr = new int[n];

        System.out.println("enter the elements : ");
        for(int i = 0;i < n; i++) {
            arr[i] = sc.nextInt();
        }

        Solution sol = new Solution();
        int peakElement = sol.PeakElement(arr);

        System.out.println("peak element is : " + peakElement);

    }
    
}
