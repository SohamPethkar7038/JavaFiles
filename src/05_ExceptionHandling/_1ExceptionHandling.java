

// An exception is an unexpected event that occurs during program execution.
// It affects the flow of the program instructions which can cause the program to 
// terminate abnormally.

// An exception can occur for many reasons. Some of them are : 

// Invalid user input
// Device failure
// Loss of network connection
// physical limitations (out of disk memory)
// Code errors
// Opening an unavailable file


// Exception are of two types :
// 1). Java RUntime exceptions.
// 2). Java IOException Exceptions.


// ***********************  Java RUntime exceptions*******************************

// A  Java RUntime exceptions happens due to a programming error. They are also known 
// as unchecked exceptions.They are checked on runtime.
// Some of the common runtime exception are :
// 1). Null pointer access (missing the initialization of variable) -
//          This is a NullPointerException
// 2). out-of-bounds arrays access - ArrayIndexOutOfBounsExceptions
// 3). Dividing a number by 0 - ArithmeticException



// **************************** Java IOException Exceptions. ******************

// An IOException is also known as checked exception. They are checked by the 
// compiler at the compile-time and the programmer is prompted to handle 
// these exceptions.
// some of the checked exception are : 
// trying to open a file that doesnot exist results in FileNotFoundException.
// trying to read past the end of a file.


// *************** handling the exceptions **************************

// 1) try-catch block

// The try-catch block in java is used to handle exceptions and prevents the abnormal
// termination of the program.
// syntax :
//         try {
            // code           
//         }
//         catch(exception) {
//            // code
//         }


public class _1ExceptionHandling {
    public static void main(String [] args) {
        int arr[] = new int[5];
        try {
            int result = 5/0;
            System.out.println(arr[8]);
            
         }
        //  catch (ArrayIndexOutOfBoundsException e) {
        // //     System.out.println("Tried to access out of bound element");
        //  }
        // catch(ArithmeticException e) {
        //     System.out.println(e.getStackTrace());
        //     System.out.println(e.getMessage());
        //     System.out.println(e);
        //     System.out.println("this is error of dividing by 0");
  
        // }
        // when we want one exception to be handle once at a time
        catch(ArrayIndexOutOfBoundsException | NullPointerException | ArithmeticException e) {
            System.out.println("handling exception");
        }

        System.out.println("Bye guys");
    }
}


