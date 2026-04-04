
import java.util.ArrayList;



public class _3RemoveDuplicate {

    public static ArrayList<Integer> removeDuplicate(int [] arr) {

        ArrayList<Integer> result = new ArrayList<>();

        if(arr.length == 0) return result;

        result.add(arr[0]);

        for(int j = 1; j < arr.length; j++) {
            if(arr[j] != arr[j-1]) {
                result.add(arr[j]);
            }
        }

        return result;
    }
    public static void main(String[] args) {
        int [] arr = {1,2,2,3,3,3,3,4,4,5,6,7,9};

        ArrayList<Integer> ans = removeDuplicate(arr);

        for(int val : ans) {
            System.out.println(val  + " ");
        }
     }
}