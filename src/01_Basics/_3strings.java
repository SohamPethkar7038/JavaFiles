
public class _3strings {
    public static void main(String[] args){
        // Strings is a non-primitive data type


        // its functions are 
        
        // 1. concatenation:
        String name1="Soham";
        String name2="Pethkar";
       // String name3=name1 + name2;
        String name3=name1 + " and " + name2;
        //System.out.println(name3);


        // charAt()

        String friend="aneesh";
        //System.out.println(friend.charAt(0));

        // length()

        //System.out.println(friend.length());

        
        // replace() does not change or replace in original string infact it create new string 
        // as string is immutable
        
        String friends="soham and aneesh";
        String replaceString=friends.replace('a','z');
        //System.out.println(replaceString); 


        // compareTo
        // s1>s2   ==>  output : +ve value
        // s1==s2  ==>  output : 0
        // s1<s2   ==>  output : -ve

        String s1="soham";
        String s2="soham";

        System.out.println(s1.compareTo(s2));
    }
}



  