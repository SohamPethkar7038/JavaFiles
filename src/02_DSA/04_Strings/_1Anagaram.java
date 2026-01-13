import java.util.Arrays;

public class _1Anagaram{

    static boolean  checkAnagaram(String s1,String s2){
        if(s1.length()!=s2.length()){
            return false;
        }

        char[] a1=s1.toCharArray();
        char[] a2=s2.toCharArray();

        Arrays.sort(a1);
        Arrays.sort(a2);

        
        if(Arrays.equals(a1, a2)) {
            return true;
        }
        else{
            return false;
        }
    }
    public static void main(String []args) {
        String s1="sad";
        String s2="dsa";

        if(checkAnagaram(s1, s2)){
            System.out.println("strings are anagram");
        }
        else{
            System.out.println("string are not anagram");
        }
    }
}