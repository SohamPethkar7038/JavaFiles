// find the first occurence of the elements from the array using binary search

import java.util.Scanner;

public class _2firstOccurence {

    static int firstOccurence(int[] input,int target){
        int lo=0;
        int hi=input.length-1;
        int ans=-1;
        while(lo<=hi){
            int mid=lo+(hi-lo)/2;

            if(input[mid]==target){
                ans=mid;
                hi=mid-1;
            }
            else if(input[mid]<target){
                lo=mid+1;
            }
            else{
                hi=mid-1;
            }
        }
        return ans;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("enter the number of element in input :");
        int n=sc.nextInt();
        int[] input=new int[n];

        System.out.println("enter the elements for input :");
        for(int i=0;i<n;i++){
            input[i]=sc.nextInt();
        }

        System.out.println("enter the target for search :");
        int target=sc.nextInt();

        System.out.println(firstOccurence(input, target));
        sc.close();

    }
}
