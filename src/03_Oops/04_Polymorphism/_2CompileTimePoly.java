
// *************** Compile Time Polymorphism ******************************

// The function call is resolved at compiled time
// The compiler decides which function or operator to invoke during compilation

// Also called as method overloading(Static binding)

// This type of polymorphism provides faster execution because function binding
// happens before program execution.

// Same method name but different parameters
// Rules
// 1) method name must be same
// 2). parameter must differ (type / number  / order)
// 3). Return type alone is NOT enough



// class MathUtils {
//     int sum(int a, int b) {
//         return a + b;
//     }

//     int sum(int a, int b, int c) {
//         return a + b + c ;
//     }

//     double sum(double a, double b) {
//         return a + b;
//     }
// }
// public class _2CompileTimePoly {
//     public static void main(String [] args) {
//         MathUtils obj = new MathUtils();
//         int result1 = obj.sum(5, 5);
//         int result2 = obj.sum(15, 15, 15 );
//         double result3 = obj.sum(5.5, 5.5);
//         System.out.println(result1);
//         System.out.println(result2);
//         System.out.println(result3);
//     }
// }

//  here compiler checks 
// method name = sum
// arguments  = (int, int)
// find exact match -> sum(int, int)


//Rule : If exact match not found -> compiler tries
// 1). Type promotion (int -> long -> float -> double)
// 2). then ambiguity error if multiple matches


// *************** type promotion (interview favorite) ************************


// class Test {
//     void show(int a) {
//         System.out.println("int");
//     }

//     void show(double a) {
//         System.out.println("double");
//     }
// }

// public class _2CompileTimePoly {
//     public static void main(String[] args) {
//         Test t1 = new Test();
//         t1.show(5);
//         t1.show(5.5);
//         t1.show('A'); // here 'A' char promoted to int .... output : int
//         t1.show('b'); // here 'b' char promoted to int ... output :int
//     }
// }

// output : int 
//          double


// *************** Invalid overloading **********************

// int sum(int a, int b) {}
// double sum(int a, int b) {}  // ERROR  (compiler confusion it is not allowed)


// ************** valid overloading ***********************

// void display(int a, String b) {}
// void display(String b, int a) {}
// parameter order matters in valid overloading

 
// If interviewer asks:
// ❓ “Does Java support function overloading and operator overloading?”
// 👉 Answer: Java supports method overloading (compile-time polymorphism)
// Java does not support operator overloading, except internally for String +

// 🔷 6. What You Should Remember
// ✔ Function overloading in cpp = Method overloading (in Java)
// ✔ Operator overloading in cpp = ❌ not allowed
// ✔ String + in java = special case


//  **************** core concept of function(method) overloading *****************

// what actually happens at compile time ?
// when u write 
// obj.method(args)

// the compiler:
// 1). looks at reference type
// 2). matches method name
// 3). matches parameter list(signature)
// 4). choose the most specific applicable method
// This is the process called as static binding / early binding

// example - payment procesing system


// class PaymentService {

//     private double lastTransactionAmount;

//     public void validate(double amount) {
//         if(amount <= 0) {
//             throw  new IllegalArgumentException("invalid amount");
//         }
//     } 

//     // case1 : only amount
//     public void processPayment(double amount) {
//         validate(amount);
//         lastTransactionAmount = amount;
//         System.out.println("proccessing RS : " + amount);
//     }

//     // case 2: amount + payment method
//     public void processPayment(double amount, String method) {
//         validate(amount);
//         lastTransactionAmount = amount;
//         System.out.println("proccessing RS : " + amount + " via " + method);
//     }

//     // case3 : amount + method + currency

//     public void processPayment(double amount, String method, String currency) {
//         validate(amount);
//         lastTransactionAmount = amount;
//         System.out.println("proccessing RS : " + amount + " via " + method + " " + currency);
//     }

//     // returning the amount (getters)
//     public double getLastTransactionAmount() {
//         return lastTransactionAmount;
//     }
// }

// public class _2CompileTimePoly {
//     public static void main(String[] args) {
//         PaymentService service = new PaymentService();

//         service.processPayment(100000);
//         service.processPayment(5000,null);
//         service.processPayment(2000,"debit card", "INR");
//         System.out.println(service.getLastTransactionAmount());
//     }
// }

// here in this code compiler does :
// 1) find method name : processPayment
// 2). arguments : (double, String)
// 3). exact match found -> calls the particular function


// interview questions

// ❓ Q1: Why not use different method names?
// 👉 Beacuse overloading improves API usability and readability

// ❓ Q2: What if I pass 2000, null?
// 👉 Compiler still selects (double, String) .....case 2
//     Runtime may cause logic issues.



// *** example 2 : Constructor Overloading : user 

// class User {

//     private String name;  // at default reference type => null
//     private int age;  // at default primitive => 0
//     private String email; // at default reference type => null

//     // contructor 1
//     public User(String name) {
//         this.name = name;
//     }

//     // constructor
//     public User(String name, int age) {
//         this.name = name;
//         setAge(age); // use setter for validation
//     }

//     // constructor 3
//     public User(String name, int age, String email) {
//         this.name = name;
//         setAge(age);
//         setEmail(email);
//     }

//     //getter for name
//     public String getName() {
//         return name;
//     }

//     // setter for name
//     public void setName(String name) {
//         if(name == null || name.isEmpty()) {
//             throw new IllegalArgumentException("name cannot be emppty");
//         }
//         this.name = name;
//     }


//     // getter for age
//     public int getAge() {
//         return age;
//     }


//     //setter for age
//     public void setAge(int age) {
//         if(age > 0) {
//             this.age = age;
//         }
//         else {
//             throw new IllegalArgumentException("invalid age");
//         }
//     }

//     // getter for email
//     public String email() {
//         return email;
//     }

//     // setter for email 
//     public void setEmail(String email) {
//         if(email != null && !email.contains("@")) {
//             throw new IllegalArgumentException("Invalid email");
//         }
//         this.email = email;
//     }
 
//     public void displayDetails() {
//         System.out.println(name + " | " + age + " | " + email);
//     }
// }

// public class _2CompileTimePoly {
//     public static void main(String[] args) {
//         User u1 = new User("Soham");
//         // here only name is initialized and age and email remails default

//         User u2 = new User("aneesh", 21,"aneesh@gmail.com");
//         User u3 = new User("nisha", 52, "Nisha@gmail.com");

//         u1.setEmail(("soham@gmail.com")); // email is modify using setter
          
//         u1.displayDetails();
//         u2.displayDetails();
//         u3.displayDetails();
//     }
// }


//  ***************** NULL ambuiguity in polymorphism (interview trap) ************

// null works only with reference types(Integer, String, Object,class or Interface) 
// null not work with primitives(int,long,double, float)

// most specific order for the null ambiguity ........so important

// String and Integer => same level(no order between them)
// then object is a least specific
// Compiler walks down the inheritance chain → picks most specific....statement in the interview

// class Test {
//     void show(String s) {
//         System.out.println("String");
//     }

//     void show(Object o) {
//         System.out.println("object");
//     }
// }
// public class _2CompileTimePoly {
//     public static void main(String[] args) {
//         Test t = new Test();
//         t.show(null);
//     }
// }

// null can be go to both
// output is string.....Because string is morer specific than object



// ************* Ambuigity error (same code as before one but different parameter)********** 

// class Test {
//     void show(Integer i) {
//         System.out.println("Integer");
//     }

//     void show(String s) {
//         System.out.println("String");
//     }
// }
// public class _2CompileTimePoly {
//     public static void main(String[] args) {
//         Test t = new Test();
//         t.show(null);
//     }
// }

// output : compile time error (ambigious)
// here null matches both integer and String
// any heirarchy between integer and string

