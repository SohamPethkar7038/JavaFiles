// ********************* type of inheritance *****************************

// ************************** multi-level Inheritance ***************

// In this inheritance, a class is derived from another class, forming a 
// chain of inheritance. The feature of the base class are passed through multilvels.

// Multilevel inheritance is when a class inherits from another class and then another 
// class inherits from it
     
// eg Structure ==>  person -> Student -> Graduate

// Constructor order = top to bottom
// super() must be used correctly
// private data is not directly accessible
// object contains from all parent data

// Uses
// reuse login accross layers
// add specialization step-by-step
// maintain heirarchy

// real world caution
// hard to debug
// tight coupling
// difficult maintainence

// industry prefers composition over inheritance


class Person {
    private String name;
    private int age;

    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

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

class Student extends Person {
    private int rollno;

    Student(String name, int age, int rollno) {
        super(name, age);
        this.rollno = rollno;
    }

    public int getRollno() {
        return rollno;
    }

    public void setRollno(int rollno) {
        if(rollno > 0) {
            this.rollno = rollno;
        }
    }

    public void getInfo() {
        System.out.println("name : " + getName());
        System.out.println("age  : "   + getAge());
        System.out.println("rollno : "   + getRollno());
    }
}


class Graduate extends Student {
    private String researchPaper;

    Graduate(String name, int age, int rollno, String researchPaper) {
        super(name, age, rollno);
        this.researchPaper = researchPaper;
    }

    public String getResearchPaper() {
        return researchPaper;
    }

    public void setResearchPaper(String researchPaper) {
        if(researchPaper != null && !researchPaper.isEmpty()) {
            this.researchPaper = researchPaper;
        }
    }

    public void displayGraduateDetails() {
        getInfo();
        System.out.println("ResearchPaper : " + getResearchPaper());
    }
}



public class _04_MultilevelInheritance {
    public static void main(String[] args) {

        Graduate g1 = new Graduate("Soham", 20, 41, "Education system");
        Student s1 = new Student("Aneesh",22,34);
        
        g1.displayGraduateDetails();
        System.out.println();
        s1.getInfo();

        System.out.println();
        s1.setName("Nisha");
        s1.setAge(52);
        s1.getInfo();

        System.out.println();
        System.out.println(s1.getName());

        g1.getName();
    }
}


