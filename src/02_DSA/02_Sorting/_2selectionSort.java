// selecion sort

// defintion
// Selection Sort is a comparison-based sorting algorithm in which the array is divided into two parts:
//   1). a sorted part at the beginning
//   2). an unsorted part at the end

// algo
// Divide the array into:
//   Sorted part (left)
//   Unsorted part (right)
// For each index i:
// Assume arr[i] is minimum (smallerIndex)
// Find the smallest element in i+1 to n-1  (consider j=j+i)
// if (arr[j]<arr[smallerIndex])
// Swap it with arr[i]



public class _2selectionSort {
    static void selectionSort(int[] arr){
        int n=arr.length;
        for (int i=0;i<n-1;i++){
            int smallerIndex=i;
            for(int j=i+1;j<n;j++){
                if(arr[j]<arr[smallerIndex]){
                    smallerIndex=j;
                }
            }
            int temp=arr[i];
            arr[i]=arr[smallerIndex];
            arr[smallerIndex]=temp;
        }
    }

    public static void main(String[] args){
        int[] arr={4,1,5,2,3};

       selectionSort(arr);

       for(int x : arr){
        System.out.print(x +" ");
       }
    }
}
