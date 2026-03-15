
class Solution {

    public int majorityElement(int[] arr) {

        int n = arr.length;
        int count = 0;
        int ele = 0;

        for(int i = 0; i < n; i++) {

            if(count == 0) {
                count = 1;
                ele = arr[i];
            }
            
            else if(ele == arr[i]) {
                count++;
            }
            else {
                count--;
            }
        }

        int countelement = 0;

        for(int i = 0; i < n; i++) {
            if(arr[i] == ele) {
                countelement++;
            }
        }

        if(countelement > n/2) {
            return ele;
        }

        return -1;
    }
}
public class _7MajorityElement {
    public static void main(String[] args) {
        
        int []arr = {1 ,2, 2, 2, 3, 5, 2};

        Solution sol = new Solution();

        int result = sol.majorityElement(arr);
        System.out.println(result);
        
    }
}
