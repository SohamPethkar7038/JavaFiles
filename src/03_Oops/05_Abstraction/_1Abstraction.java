// Abstraction = showing only essential details, hiding implementation

// real-life analogy

// U use a car
// u dont know how engine, gearbox, combustion works internally

// u only interact with 
// start();
// accelerate()
// brake()
// That is a abstraction

// why abstraction is needed ?
// --> Without abstraction, code becomes complex and user must understand
//     everything internally.
//     with abstraction it reduces complexity, improve maintainability and 
//     focus on what to do, not how to do


//********************* types of abstraction **********************************

// 1). abstract class
// 2). interface


// ****************** abstract class *********************************

// A class declared with abstract keyword
// It can have:
// Abstract methods(no body)
// Normal methods(with body)


// eg
// abstract class Animal {
//     String name;

//     public Animal(String name) {
//         this.name = name;
//     }

//     // abstract method(no body)
//     abstract void sound();

//     // normal method
//     void sleep() {
//         System.out.println(name + " is sleeping");
//     }
// }

// class Dog extends Animal {

//     Dog(String name) {
//         super(name);
//     }

//     @Override
//     void sound() {
//         System.out.println(name + " is barking ");
//     }
// }

// public class _1Abstraction {
//     public static void main(String[] args) {
        
//         Animal a = new Dog("Tommy"); // runtime polymorphism
//         a.sound();
//         a.sleep();
//     }
// }


// Important rule of abstract class
// cannot create new object =>    new Animal() ... not allowed
// must be inherited but multiple inheritance not allowed
// abstract method must be overridden
// can have constructor
// use keyword extends while inheriting
// can have both abstract + concrete method



// ****************** interface ***********************************

// An interface provides 100% abtraction(mostly)


// eg

// interface Vehicle {
//     void start();    // abstract by default
//     void stop();
// }

// class Car implements Vehicle {
//     public void start() {
//         System.out.println("Car starts");
//     }

//     public void stop() {
//         System.out.println("car stops");
//     }
// }

// public class _1Abstraction {
//     public static void main(String[] args) {
        
//         Vehicle v = new Car(); // polymorphism
//         v.start();
//         v.stop();
//     }
// }

// rules of interface :
// constructor are not use
// multiple inheritance is allowed
// use public static final variables
// use keyword `implements` while inheriting



// eg : design a system where a user can send notification through different 
//      channels like email, sms, push notifications
//      Each notification type : has different sending logic
//      But follows a common structure



// abstract class Notification {

//     String receiver;

//     public Notification(String receiver) {
//         this.receiver = receiver;
//     }

//     // abstract method (must be implemented)
//     abstract void send(String message);

//     void logNotification() {
//         System.out.println("Notification send to " + receiver);
//     } 
// }
// // concrete classes
// class EmailNotification extends Notification {

//     public EmailNotification(String receiver) {
//         super(receiver);
//     }

//     @Override
//     public void send(String message) {
//         System.out.println("Sending email to " + receiver + " : " + message);
//     }
// }

// class SmsNotification extends Notification {

//     public SmsNotification(String receiver) {
//         super(receiver);
//     }

//     @Override
//     void send(String message) {
//         System.out.println("Sending SMS to : " + receiver + " : " + message);
//     }
// }

// class PushNotification extends Notification {
//     PushNotification(String receiver) {
//         super(receiver);
//     }

//     @Override
//     void send(String message) {
//         System.out.println("Sending push to : " + receiver + " : " + message);
//     }
// }

// public class _1Abstraction {
//     public static void main(String[] args) {
//         Notification n1 = new EmailNotification("abc@gmail.com");
//         Notification n2 = new SmsNotification("7038803773");
//         Notification n3  = new PushNotification("user123");

//         n1.send("hello via email");
//         n1.logNotification();

//         n2.send("hello via sms");
//         n2.logNotification();

//         n3.send("hello via push");
//         n3.logNotification();


        
//     }
// }


// eg mini banking system

// design a banking system where user has a bank acocunt and different bank 
// account types like saving , current and operation will be withdraw and deposit
// the ammount.

abstract class BankAccount {
    private String accountHolder;
    private double balance;

    BankAccount(String accountHolder, double balance) {
        this.accountHolder = accountHolder;
        this.balance = balance;
    }

    // getter
    public String getAccountHolder() {
        return accountHolder;
    }

    // getter for balance
    public double getBalance() {
        return balance;
    }

    // protected method to safely update balance
    protected void updateBalance(double amount) {
        this.balance += amount;
    } 

    // common method for all i.e deposit of money

    public void deposit(double amount) {
        if(amount > 0) {
            updateBalance(amount);
            System.out.println(amount + " deposit new balance : " + getBalance());
        }
        else {
            System.out.println("invalid deposit amount");
        }
    }

    // abstract method (different rules for each account)
    public abstract void withDraw(double amount);

    // common method
    public void showBalance() {
        System.out.println("account holder : " + accountHolder);
        System.out.println("balance : " + balance);
    }
}

class SavingAccount extends BankAccount {
    private double minBalance = 1000;

    SavingAccount(String name, double balance) {
        super(name, balance);
    }

    @Override
    public void withDraw(double amount) {
        if(amount <= 0) {
            System.out.println();
        }
    }
}

