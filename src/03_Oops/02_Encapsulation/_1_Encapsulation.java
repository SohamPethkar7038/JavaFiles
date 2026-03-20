// Encapsulation is the process of wrapping data (variables) and methods together into a single unit (class) and restricting direct access to the data using access modifiers.

// In Java, encapsulation is mainly implemented using:
// private variables
// public getter and setter methods

// So the formula is:
// Encapsulation = Data Hiding + Controlled Access



// program : If variables are public, anyone can modify them and put the object into an invalid state.

// 1).
// class Student {
//     public int age;
// }

// public class _1_Encapsulation {
//     public static void main(String[] args) {
//         Student s = new Student();

//         s.age = -10;  // logically wrong
//         System.out.println(s.age);
//     }
// }

// The object now contains invalid data




// 2).
 

// We make the variable private and provide controlled access using methods.
// Structure:

// private variable
// public setter
// public getter


// class Student {
//     private int age;

//     public void setAge(int age) {
//         if(age > 0) {
//             this.age = age;
//         }
//     }

//     public int getAge() {
//         return age;
//     }

// }
// public class _1_Encapsulation {
//     public static void main(String[] args) {
        
//         Student s = new Student();

//         s.setAge(20);
//         System.out.println(s.getAge());
//     }
// }

// output : 20
// Explanation:
// age cannot be accessed directly
// data is modified only through setAge()
// data is accessed through getAge()





// Why Getter and Setter are Used
// -->  Getter and setter methods provide controlled access.

// Getter
// Used to read the value

// Example:

// public int getAge()


// Setter
// Used to modify the value

// Example:
// public void setAge(int age)


// example 2

//  class BankAcccount {

//     private double balance;

//     public void deposit (double amount) {
//         if(amount > 0) {
//             balance = balance + amount;
//         }
//     }

//     public void withDraw(double amount) {

//         if(amount > 0 && amount <= balance) {
//             balance = balance - amount;
//         }
//     }

//     public double getBalance() {
//         return balance;
//     }
//  }

// public class _1_Encapsulation{
//     public static void main(String[] args) {
        
//         BankAcccount account = new BankAcccount();

//         account.deposit(10000);
//         account.withDraw(5000);

//         System.out.println(account.getBalance());
//     }
// }

// external code cannot directly change the balance;
//only deposit and withdraw methods are allowed
// this protect the object state




// **************  Read-Only Encapsulation  *************
// Definition

// Read-only encapsulation means the variable can be read but cannot be modified from outside the class.

// This is achieved by:
// making the variable private
// providing only getter
// no setter
// So the outside world can see the value but cannot change it.



// class Student {
//     private int id = 101;

//     public int getId() {
//         return id;
//     }
// }

// public class _1_Encapsulation{
//     public static void main(String[] args) {
        
//         Student s = new Student();
//         System.out.println(s.getId());

//         s.id = 200; // not allowed
//         s.setId(400); // no setter function
//     }
// }





// Write-Only Encapsulation
// Definition

// Write-only encapsulation means the value can be modified but cannot be read from outside the class.
// This is achieved by:
// making variable private
// providing setter only
// no getter
// This is rarely used but appears in some security-sensitive systems.



// **************** immutable class **************************

// an immutable class is a class whose object state cannot be changed after creation
// once he object is created, its data remains constant forever


// rules to create immuatble class
// make class final
// make variable private
// make variable final
// no setters
// initialze varibales using constructor
// provide getters only


final class Student {

    private final int id;
    private final String name;

    public Student(int id,String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }
}

public class _1_Encapsulation {
    public static void main(String[] args) {
        Student s = new Student(101,"rahul" );

        System.out.println(s.getId());
        System.out.println(s.getName());
    }
}



// Why Immutable Classes Are Important
// They provide:
// Thread safety
// Security
// Predictable behavior
// Safe caching
// That is why String class in Java is immutable



// Why is String immutable?
// Reasons:

// 1️⃣ Security (used in URLs, file paths, database connections)
// 2️⃣ Thread safety
// 3️⃣ String pooling optimization
// 4️⃣ Hashcode caching










