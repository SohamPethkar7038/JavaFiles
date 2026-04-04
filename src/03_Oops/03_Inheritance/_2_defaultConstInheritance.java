// wrting program for inheritance by using default constructor
// here while running program...first parent(base) construtor is call and then 
// child (derived) constructor is call



class Person {
    String name;
    int age;

    Person() {
        System.out.println("parent constructor is called");
    }
}

class Student extends Person {
    int rollno;

    Student() {
        super(); // calls parent constructor
        System.out.println("Child constructor is called");
    }

    void getInfo() {
        System.out.println("Name :" + name);
         System.out.println("Age :" + age);
          System.out.println("Roll no :" + rollno); 
    }
}

public class _2_defaultConstInheritance {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.name = "soham";
        s1.age= 22;
        s1.rollno=42;

        s1.getInfo();

        }
}


// Student inherits from Person
// So student get name,age from Person

// Parent constructor is called first beacause:
// Child class depend on parent class initialization
// jvm ensures Parent part of object is fully initialized before child part


// ************** very important : super() *******************

// **************** Super() *********************


// super() is a keyword in java that refers to the parent class object
// it is used to : 
// call the parent constructor
// access parent variable
// call parent method

// Even though super() is not written, JVM inserts


// important rule
// 1st rule : 

//  super() must be first statement in constructor

// Student() {
//     System.out.println("Hello");
//     super(); // wrong it should be always at first statement of constructor
// }

// 2nd rule :

// if Parent class has only parameterized constructor, then
// child class must call it using super(parameters)
// otherwise it gives compilation error


// In simple way if default constructor => no need to write super()
// if only parameterized constructor => must write super(args)


