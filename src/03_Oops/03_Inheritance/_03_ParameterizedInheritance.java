// writing program of inheritance using parameterized constructor

// parent is also called base class and Child class is called Derived class

// the program above wrote is single-level inheritance

// when one class inherts properties and methos directly from one parent class to child class is called single-level inheritance

// here only one level of inheritance exists

class Person {
   private String name;
   private int age;

   Person(String name, int age) {
    this.name = name;
    this.age = age;
   }

   // getter (read and controller access)
   public String getName() {
    return name;
   }

   public int getAge() {
    return age;
   }

   // setters (modify with validation)

   public void setName(String name) {

    if(name != null && !name.isEmpty()) {
        this.name = name;
    }
   }

   public void setAge(int age) {

    if(age > 0) {
        this.age = age;
    }
   }
}

// inheritance
class Student extends Person {
    private int rollno;

    Student(String name, int age, int rollno) {
        super(name, age); // initialize parent
        this.rollno = rollno;
    }

    public int getRollno() {
        return rollno;
    }

    public void setRollno(int rollno) {
        this.rollno = rollno;
    }

    public void getInfo() {
        // accessing the parent data via getters
        System.out.println("Name : " + getName());
        System.out.println("Age : " + getAge());
        System.out.println("Rollno : " + getRollno());
        
    }
}

public class _03_ParameterizedInheritance {
    public static void main(String[] args) {
        Student s1 = new Student("Soham", 20, 41);
        s1.setAge(-10); // invalid so ignored due to validaion
        s1.getInfo();
        System.out.println();

        // update using the setters
        s1.setAge(21);
        s1.setRollno(42);
       s1.getInfo();
    }
}