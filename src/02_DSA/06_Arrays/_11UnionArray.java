import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;

class Solution {

    public static ArrayList<Integer> findUnion(int[]arr1, int[] arr2) {

        HashSet<Integer> set = new HashSet<>();

        for(int num : arr1) {
            if(!set.contains(num)) {
                set.add(num);
            }
        }

        for(int num1 : arr2) {
            if(!set.contains(num1)) {
                set.add(num1);
            }
        }

        return new ArrayList<>(set);
    }
}

public class _11UnionArray {
public static void main(String args[]) {

    Scanner sc = new Scanner(System.in);

    // input first array

    System.out.println("Enter the size of the first array : ");
    int n1 = sc.nextInt();

    int[] arr1 = new int[n1];
    
    System.out.println("Enter the element of first array : ");
    for(int i = 0; i < n1 ; i++) {
        arr1[i] = sc.nextInt();
    }

    // input second array

    System.out.println("enter the size of second array : ");
    int n2 = sc.nextInt();

    int []arr2 = new int[n2];

    for(int i = 0; i < n2; i++) {
        arr2[i] = sc.nextInt();
    }

    Solution sol = new Solution();
    ArrayList<Integer> ans = sol.findUnion(arr1, arr2);
    System.out.println(ans);

}
}