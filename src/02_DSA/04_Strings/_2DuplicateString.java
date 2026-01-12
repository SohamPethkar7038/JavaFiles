
import java.util.HashSet;

public class _2DuplicateString {

    static String removeDuplicate(String s){
    HashSet<Character>set=new HashSet<>();
    StringBuilder result=new StringBuilder();

    
    for(int i=0;i<s.length();i++){
        char ch=s.charAt(i);
        if(!set.contains(ch)){
            set.add(ch);
            result.append(ch);
        }
    }
    return result.toString();
    }
    public static void main(String []args){
        String input="programming";
        System.out.println(removeDuplicate(input));
}
}

