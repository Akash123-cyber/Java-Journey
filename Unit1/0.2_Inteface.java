package Unit1;

// Interface:
// An interface in Java is a contract that specifies a set of methods that a class must implement. 
// It allows you to define a common behavior without specifying how it should be implemented.
// A class can implement multiple interfaces.

//Abstarct Methods: Methods in an interface are abstract by default(i.e they don't have a body and must be implemented by any class that implements the interface).

// Default Methods: Java 8 introduced default methods in intefaces, which allow you to define method implementations within the interface itself.

interface Vehicle{
    public void start(); //Abstract method

    // public static start(); 
    // No Static function cannot be declared as abstract method in an inteface in Java
    // Since static methods are tied to the class/interface and cannot be overridden by subclasses, they have an implementation by default.
//   Conflict:

//      Abstract methods must be overridden and implemented by a subclass or implementing class.
//      Static methods cannot be overridden, as they are tied to the class or interface and not to instances.


    default void honk(){
        System.out.println("Honking!");

    }
}

class Car1 implements Vehicle{
    
    @Override 
    public void start(){
        System.out.println("Car started.");
    }

    public static void main(String[] args){
        Car1 car = new Car1();
        car.honk();
        car.start();
    }

    
}

// Problem occurs when in a directory you creates two classes with the same name in two different files inside the directory 

// The issue you're facing occurs because both file1 and file2 define a Car class with a main method, and the Java runtime gets confused about 
// which Car class to execute when you run the second file.

// In Java, classes with the same name in the same package (or directory) cause conflicts because the Java compiler cannot differentiate between them. 