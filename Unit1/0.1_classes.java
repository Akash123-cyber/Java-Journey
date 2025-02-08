package Unit1;

// 1. Classes:

// A class in Java is a blue print for creating objects.It defines the properties (fields) and behaviors(methods)
// that objects of the class will have. A class is used to model real-world entitiesor concepts in the program.

// Fields: Variable that hold the state or data of an object.
// Methods: Functions that define the behaviors or actions of an object.
// Constructor: A Special method used to initialize objects when they are created.



class Car{

    //Fields (propertieds)
    String make;
    String model;
    int year;

    // Constructor

    Car(String make, String model, int year){
        this.make = make;
        this.model= model;
        this.year= year;
    }

    //Method (Behavior)
    public void startEngine()
    {   
        System.out.println("Engine Started.");

        }


    public static void main(String[] args){
        // here we to create the instance cause all methods are instance associated (non- static)
        Car car = new Car("Suzuki","Swift Dezire",2024);
        System.out.println();
        car.startEngine();
    }


}