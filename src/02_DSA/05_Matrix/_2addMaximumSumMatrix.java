
import java.util.Scanner;

public class _2addMaximumSumMatrix{

    static  int RowMaxSum(int[][]matrix,int rows,int columns){
        int maxSum=Integer.MIN_VALUE;
        for(int i=0;i<rows;i++){
            int rowSum=0;
            for(int j=0;j<columns;j++){
                rowSum+=matrix[i][j];
            }
            if(rowSum>maxSum){
                maxSum=rowSum;
            }
        }
        return maxSum;
    }
    public static void main(String[] args) {
         Scanner sc=new Scanner(System.in);

        System.out.println("Enter the number of rows :");
        int rows=sc.nextInt();

        System.out.println("enter the number of columns :");
        int columns=sc.nextInt();

        int [][] matrix=new int[rows][columns];

        System.out.println("entry the elements in matrix :");
        for(int i=0;i<rows;i++){
            for(int j=0;j<columns;j++){
                matrix[i][j]=sc.nextInt();
            }
        }

        System.out.println("printing the elements of matrix :");
        for(int i=0;i<rows;i++){
            for(int j=0;j<columns;j++){
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }

        int maxSum=RowMaxSum(matrix, rows, columns);
        System.out.println("maximum sum in rows is :"+maxSum);

        sc.close();
    }
    }