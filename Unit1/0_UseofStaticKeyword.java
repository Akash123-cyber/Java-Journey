package Unit1;

// import java.lang.Math;  //without static keyword

import static java.lang.Math.sqrt;

// The static keyword in Java is a non-access modifier. 
// It is used to define class-level members (fields, methods, blocks, or nested classes) 
// that are shared across all instances of the class, instead of being tied to a specific instance.

// Characteristics of the static Keyword
// Non-Access Modifier

// Unlike access modifiers like public, private, or protected, the static keyword does not control visibility or accessibility. Instead, 
// it controls how a member (field, method, block, or nested class) is associated with the class.
// Class-Level Association

// static indicates that a member belongs to the class itself rather than to any specific object. Therefore, it is shared across all instances of the class.
// Applicable to Different Constructs
// The static keyword can be applied to:

// Fields (variables)
// Methods
// Blocks
// Nested classes

// Use Cases of the static Keyword

// ---------------------------------------------------------------------------------------------------------------------
// 1. Static Fields (Variables)
// Shared by all instances of a class.
// Only one copy exists for the entire class, regardless of how many objects are created.

class Example {
    static int count =0;

    Example(){
        count ++;
    }


};

// ------------------------------------------------------------------


// 2. Static Methods
// Can be called directly using the class name without creating an object.
// Cannot access non-static (instance) fields or methods directly.

class MathUtils{
    static int square(int num){ //static method
        return num*num;
    }
};

// ------------------------------------------------------------------------------

// 3. Static Blocks
// Used to initialize static fields or run code during the class loading phase.
// Executed once when the class is loaded into memory.

class StaticBlocks{
    static int count;

    // static block

    // NOTE************ below statement;
    static {  //Static Blocks are loaded into the memory and executed as soon as the fields or the members from the same class are called inside the main method;
        count = 10; 
        System.out.println("Static block executed. Count initialized to "+ count);

    }
};
// ---------------------------------------------------------------------------------------------

// 4. Static Nested Classes
// A nested class marked as static can be accessed without an object of the enclosing class.
// It does not have access to non-static fields and methods of the enclosing class.


class OuterClass{
    static class InnerClass{
        static void show() {
            System.out.println("Static nested class method");
        }
    }
}

// Key Characteristics:

// Independent of Outer Class Instances:
// A static nested class does not require an instance of the enclosing (outer) class to be instantiated.

// Class-Level Association:
// Since it is static, the nested class is associated with the enclosing class itself rather than with an instance of the enclosing class.

// Limited Access to Outer Class Members:
// A static nested class cannot access non-static members (fields or methods) of the outer class directly. 
// However, it can access the static members of the outer class.

// Comparison with Inner Classes
// -----------------------|---------------------------------------------------------------------------|------------------------------------------------------------------------|
// Feature	              |          Static Nested Class             	                              |              Inner Class                                               |
// Instance Dependency	  |      Independent of the enclosing class's instance.	                      |    Requires an instance of the enclosing class.                        |
// Access to Members	  |      Can access only static members of the outer class.	                  |    Can access both static and non-static members of the outer class.   |
// Instantiation	      |      Can be instantiated without creating an instance of the outer class. |	   Must be instantiated through an instance of the enclosing class.    |
// -----------------------|---------------------------------------------------------------------------|------------------------------------------------------------------------|

// Q-> Why Can't Top-Level Classes Be Static?
// In Java, a top-level class is always implicitly associated with its package, not with any other class. Hence, making it static would have no practical meaning because:

// The static keyword in Java implies association with the enclosing entity (a class), and a top-level class has no enclosing entity.
// Top-level classes are already "static" in the sense that they don't depend on instances of any other class.

// NOTE :: basically static keyword make the inner classes independent of the instances of the outer classes.

// ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------

// 5. Static Import
// The static import keyword allows you to import static members (fields or methods) of a class
// directly, so you don't need to qualify them with the class name.

// import java.lang.Math; this line is above at the top this document

// class ImportingMathLibrary{

//     public static void printSqrt(){
//     double number  = 16.0d;
//     double result = Math.sqrt(number);
//     System.out.println(number);
//     }
    
// }

class StaticImportMathLibrary{

    public static void printSqrt(){
    double number  = 16.0d;
    double result = sqrt(number);  // Here we don't need to qualify the Class Name because we import the method through static import;
    System.out.println(number);
    }

}
// -----------------------------------------------------------------------------------------------------------------------------


// ------------------------------------------------------------------------------------------
class UseOfStaticKeyword{

    public static void main(String[] args){


// -------------------------------------------------------------------------------------
//  1
        new Example(); //creates an object, count becomes 1
        Example obj = new Example();//Creates another object count becomes 2
        
        // note: if one instance of the class changes the static field of the class it is changed for all including class and all other instances.
        System.out.println("Count: "+Example.count);
        System.out.println("Count: "+obj.getClass());
        System.out.println("Count: "+obj.count);

// ---------------------------------------------------------------
//  2
        System.out.println(MathUtils.square(5));

//----------------------------------------------------------------------------------
//  3   
        System.out.println(StaticBlocks.count);

//----------------------------------------------------------------------------------
//  4 
        System.out.println("//4-------------------------------------------------------------------------------");
        OuterClass.InnerClass.show(); //this prints the first line "Static nested class method"

        OuterClass outerClass= new OuterClass ();

        OuterClass.InnerClass innerclass = new OuterClass.InnerClass();

        innerclass.show();//this prints second line


// -----------------------------------------------------------------------------------------------------------------------------------
// 5    
        System.out.println("-------------------------------------------------------------------------------------");
        System.out.println("Here We are printing the Square root using the sqrt() method of the Math class without qualifying the class name as we have imported through static import");
        StaticImportMathLibrary.printSqrt();

    }
}

// ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

// NOTE::

// Summary Table of static Use Cases

// Context	        Description
// Static Field	    Shared across all instances of the class.
// Static Method	Belongs to the class, can be called without creating an object.
// Static Block	    Used to initialize static variables or perform setup when the class loads.
// Static Class	    A nested class independent of the enclosing class's instance.
// Static Import	Allows direct access to static members without using the class name.

// ---------------------------------------------------------------------------------------------------------------------

// When to Use static?
// Use static fields            for constants or variables shared across all instances (e.g., PI, count).
// Use static methods           for utility functions (e.g., Math.sqrt()).
// Use static blocks            for one-time initialization of static variables.
// Use static nested classes    for classes that do not require access to enclosing class members.
 


