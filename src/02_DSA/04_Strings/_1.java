

class Solution{

    static String removeConsecutive(String s) {

        if(s == null || s.length() == 0) {
            return s;
        }

        StringBuilder result = new StringBuilder();

        int n = s.length();

        for(int i = 0; i < n; i++) {
            if(i < n - 1 && s.charAt(i) == s.charAt(i + 1)) {
                continue;
            }
            else {
                result.append(s.charAt(i));
            }
        }

        return result.toString();
    }
}

public class _1 {
    public static void main(String[] args) {

        Solution sol = new Solution();
        String s = "aabbacd";
        String removeStringConsecutive = sol.removeConsecutive(s);

        System.out.println(removeStringConsecutive);

    }
}
