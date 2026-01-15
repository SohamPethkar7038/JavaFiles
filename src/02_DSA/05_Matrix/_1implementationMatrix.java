import java.util.Scanner;

public class _1implementationMatrix {
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

        sc.close();
    }
}
