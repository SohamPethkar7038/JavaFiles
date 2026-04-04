// ***************** runtime polymorphism ***********************************



// Runtime polymorphism means the method to execute is decided at runtime base on 
// the actual object, not the reference type.

// key idea
// Parent ref = new Child();
// ref.method(); 
// method of child runs, not parent


// why runtime polymorphism exists(Real need)
// 1) u dont want if-else everywhere
// 2) u want extensible system

// example => payment -> upi/card/netBanking
//            notification -> Email/sms/push

// same interface => different behaviour


// ***************** overridden method **********************

// An overridden method is a method in a child class that has the same name, same 
// parameters, and the same return type as a method in the parent class, but provides
// a different implementation.


// ***********  ❓ what is overridding❓ **********
// 👉🏻 redefining parent method in child


// example of animal and dog

// class Animal {
//     void sound() {
//         System.out.println("Animal makes sound");
//     }
// }
// class Dog extends Animal {
//     void sound() {
//         System.out.println("dog barks");
//     }
// }

// public class _3RuntimePolymorphism {
//     public static void main(String[] args) {
        
//         Animal A1 = new Dog();
//         A1.sound();
//     }
// }

// output : dog barks
// ❓ why did the dog method run ?
// 👉🏻 this is the core of runtime polymorphism

// Here in Animal A1 = new Dog();
// reference type -> Animal
// Object type -> Dog

// JVM checks Does Dog override sound() ... if yes then run it.

// imp rule : method call depends on object type, not reference type

// 🚩 what is required for runtime polymorphism ?
// 1). inheritance
//     class Dog extends Animal

// 2). Method overriding
// `   void sound() {...}

// 3). Upcasting
//    Animal a = new Dog();


// now lets add encapsulation and parameterized constructors :


// class Animal {
//     private String name;

//     public Animal(String name) {
//         this.name = name;
//     }

//     // getter
//     public String getName() {
//         return name;
//     }

//     public void sound() {
//         System.out.println("animal makes sound");
//     }
// }

// class Dog extends Animal {
//     private String breed;

//     public Dog(String name, String breed) {
//         super(name);
//         this.breed = breed;
//     }

//     @Override
//     public void sound() {
//         System.out.println(getName() + "the dog barks");
//     }
// }

// public class _3RuntimePolymorphism {
//     public static void main(String[] args) {
//         Animal A1 = new Dog("bruno", "Labrador");
//         A1.sound();
//     }
// }

// output : bruno the dogs barks


// method overriding rules 
// 1). Same method name
// 2). Same parameters   
// 3). same return type(or covariant)
// 4). cannot reduce access modifier
// 5). final method -> cannot override
// 6). static -> not overridden(hidden)


// same parameter of methods are required in parent and child
// void sound() {....}   ****** is valid in parent and child
// void sound(int x) {...}  *******is not valid...it is overloading


// static method are not overridden. They are hidden, not overridden.


// class Parent {

//     static void show() {
//         System.out.println("Parent static");
//     }
// }

// class Child extends Parent {
//     static void show() {
//         System.out.println("Child static");
//     }
// }

// public class _3RuntimePolymorphism {
//     public static void main(String[] args) {

//         Parent p = new Child();
//         p.show();
//     }
// }

// output is parent static
// static method depends on reference type not object type


// final method cannot overridden

// class A{
    
//     final void show() {
//         System.out.println("Final method");
//     }
// }

// class B extends A{
//     // void show() {   // ❌ error cannot resolve

//     // }
// }




// private method cannot be overridden

// class A {
//     private void show() {
//         System.out.println("A");
//     }
// }

// class B extends A {
//     public void show() {
//         System.out.println("B");
//     }
// }

// output : it is not overridden
// The method in class B look like runtime polymorphism but, because of private
// access modifier in class A method, The method of class B is not overridden and 
// it is a new method


// eg of vehicle system

// class Vehicle {
//     private String brand;
//     private int speed;

//     public Vehicle(String brand, int speed) {
//         this.brand = brand;
//         setSpeed(speed);
//     }

//     public String getBrand() {
//         return brand;
//     }

//     public int getSpeed() {
//         return speed;
//     }

//     public void setSpeed(int speed) {
//         if(speed < 0) {
//             throw new IllegalArgumentException("invalid speed");
//         }

//         this.speed = speed;
//     }

//     // method to override
//     public void move() {
//         System.out.println("vehicle is moving");
//     }
// }

// class Car extends Vehicle {

//     private int doors;

//     public Car(String brand, int speed, int doors) {
//         super(brand, speed);
//         this.doors = doors;
//     }

//     @Override
//     public void move() {
//         System.out.println(getBrand() + " car is moving at " + getSpeed());
//     }
// }

// class Bike extends Vehicle {
//     private boolean hasGear;

//     public Bike(String brand, int speed, boolean hasGear) {
//         super(brand, speed);
//         this.hasGear = hasGear;
//     }

//     @Override
//     public void move() {
//         System.out.println(getBrand() + " bike is moving at " + getSpeed() + "km/h" );
//     }
// }

// public class _3RuntimePolymorphism {
//     public static void main(String[] args) {
        
//         Vehicle v1 = new Car("toyata", 120, 4);
//         Vehicle v2 = new Bike("yamaha" , 70, true);

//         v1.move();
//         v2.move();
//     }
// }

// here Vehicle is reference type and Car, Bike is object type
// move() is overridden in Car and Bike


// 😎***************** method resolution*****************😎

// variables is decided by reference type
// methods(overridden) by object type


// eg overridden + overloading together

// class Parent {
//     void show(int a) {
//         System.out.println("parent int");
//     }
// }

// class Child extends Parent {
//     @Override
//     void show(int a) {
//         System.out.println("child int");
//     }

//     //overloading
//     void show(String s) {
//         System.out.println("child String");
//     }
// }

// public class _3RuntimePolymorphism {
//     public static void main(String[] args) {
        
//         Parent p = new Child();
//         p.show(10);
//     }
// }

// output is child int



// *********** Super keyword ********

// super()   => call parent constructor
// super.method()    => call parent method
// super.variable()   => access parent variable


// super is always the first statement in constructor
// if not write, compiler adds it automatically


// 😎*************** super.method() ******************😎

// class Parent {
//     void show() {
//         System.out.println("parent method");
//     }
// }
// class Child extends Parent {
//     @Override
//     void show() {
//         super.show();   // calling parent method
//         System.out.println("child method");
//     }
// }
// public class _3RuntimePolymorphism {
//     public static void main(String[] args) {
//         Parent p = new Child();
//         p.show();
//     }
// }

// output : parent method
//          child method
// we use this when we want to extend parent behaviour(not replace) and 
// to add extra logic


// ******** example : employee system *****************


// class Employee {

//     private String name;
//     private double salary;

//     public Employee(String name, double salary) {
//         this.name = name;
//         setSalary(salary);
//     }

//     public String getName() {
//         return name;
//     }

//     public double getSalary() {
//         return salary;
//     }

//     public void setSalary(double salary) {
//         if(salary < 0) throw new IllegalArgumentException();
//         this.salary = salary;
//     }

//     public double calculateBonus() {
//         return salary * 0.05;
//     }
// }

// class Manager extends Employee {
//     private double bonusMultiplier;

//     public Manager(String name, double salary, double bonusMultiplier) {
//         super(name, salary);
//         this.bonusMultiplier = bonusMultiplier;
//     }

//     @Override
//     public double calculateBonus() {
//         double baseBonus = super.calculateBonus();
//         return baseBonus * bonusMultiplier;
//     }
// }

// public class _3RuntimePolymorphism {
//     public static void main(String[] args) {
        
//         Employee e = new Manager("soham", 50000, 2);
//         System.out.println(e.getName());
//         System.out.println("bonus : " + e.calculateBonus());
//     }
// }


// **********covariant return type **************************

// covariant return type means a child class can override a method and return 
// a more specific subtype of the parent's return type
// without it , flexibility is low
// with it, child can return its own type safely

class Vehicle {
    private String brand;

    public Vehicle(String brand) {
        this.brand = brand;
    }

    public String getBrand() {
        return brand;
    }

    public Vehicle getVehicle() {
        System.out.println("Return vehicle");
        return this;
    }
}

class Car extends Vehicle {

    public Car(String brand) {
        super(brand);
    }

    @Override
    public Car getVehicle() {     // covariant return
        System.out.println("returning car");
        return this;
    }
}

public class _3RuntimePolymorphism {
    public static void main(String[] args) {
        
      
        Vehicle v1 = new Vehicle("maruti");
        System.out.println(v1.getBrand());

          Vehicle v = new Car("Toyota");

        Vehicle obj = v.getVehicle();  // runtime decides method
        System.out.println(obj.getBrand());
    }
}

// here return type must be same or subclass of parent return type

// ❓ why covariant return ?
// 👉🏻 More specific return improves usability

