
import java.util.Scanner;

public class _1binarySearch {

    static int binarySearch(int[] input, int target) {
        int lo = 0;
        int hi = input.length - 1;

        while (lo <= hi) {
            int mid = lo = (hi - lo) / 2;

            if (input[mid] == target) {
                return mid;
            } else if (input[mid] > target) {
                hi = mid - 1;
            } else {
                lo = mid + 1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number of element :");
        int n = sc.nextInt();

        int[] input = new int[n];
        for (int i = 0; i < n; i++) {
            input[i] = sc.nextInt();
        }

        System.out.println("give target value to find in data :");
        int target = sc.nextInt();

        System.out.println(binarySearch(input, target));
        sc.close();
    }
}
