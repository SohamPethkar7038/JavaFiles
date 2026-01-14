// You are given a string s, consisting of lowercase alphabets. Your task is to remove consecutive duplicate characters from the string. 

// Example:

// Input: s = "aabb"
// Output:  "ab" 
// Explanation: 

public class _3RemoveConsecutive{
    static String removeConsecutiveString(String s){

        if(s==null || s.length()==0){
            return s;
        }

        StringBuilder result=new StringBuilder();
        int n=s.length();

        for(int i=0;i<n;i++){
            if(i<n-1 && s.charAt(i)==s.charAt(i+1)){
                continue;
            }
            else{
                result.append(s.charAt(i));
            }
        }
        return result.toString();
    }

    public static void main(String []args){
        System.out.println(removeConsecutiveString("aabbacd"));
    }
}