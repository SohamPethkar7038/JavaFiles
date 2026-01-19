//Given an array of strings arr[]. Return the longest common prefix among each and every strings present in the array. If there's no prefix common in all the strings, return "".

// input ['flower','flight','flow']
// output =  'fl'


import java.util.*;

public class _5LongestCommonPrefix{

    public static String LongestCommonPrefix(String arr[]){

        if(arr==null || arr.length==0){
            return "";
        }

        StringBuilder result=new StringBuilder();

        Arrays.sort(arr);

        String first=arr[0];
        String last=arr[arr.length-1];

        for(int i=0;i<first.length();i++){
            if(first.charAt(i)!=last.charAt(i)){
                break;
            }
            result.append(first.charAt(i));
        }
        return result.toString();
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.println("enter the number of Strings");
        int n=sc.nextInt();
        sc.nextLine();

        String []arr=new String[n];
        System.out.println("enter the Strings");

        for(int i=0;i<n;i++){
            arr[i]=sc.nextLine();
        }

        String longestCommonPrefixString=LongestCommonPrefix(arr);

        if(longestCommonPrefixString.isEmpty()){
            System.out.println("no longest common prefix in the string\n");
        }
        else{
            System.out.println("longest common prefix string is "+longestCommonPrefixString);
        }
        sc.close();
    }
}