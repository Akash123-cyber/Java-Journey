package Unit1;

// Key Points about Static Nested Classes in Java
// Static nested classes do not have a reference to an instance of the outer class.

// Because they are declared as static, they behave like any other top-level class but are scoped inside the outer class.
// They can directly access static fields and methods of the outer class but cannot access non-static fields or methods of the outer class unless they have an explicit reference to an instance of the outer class.
// Static Members of the Outer Class:

// The static nested class can directly access static fields and static methods of the outer class because it shares the same class-level scope.
// Non-Static Members of the Outer Class:

// To access non-static fields or methods, the static nested class needs an explicit reference to an instance of the outer class.

class Outer {

    static String staticField = "Static Field of OuterClass";
    String nonStaticField = "Non Static Field of the OuterClass";

    public static void println(String message){//wrapper method to easen up the things
        System.out.println(message);
    }
    static void staticMethod(){
        println("Static Method of OuterClass");
    }

    void nonStaticMethod(){
        println("Non-Static Method of the OuterClass");
    }
    
    static class Inner{
        //Static members
        static String InnerStaticField = "Static Field of the Innerclass";
        static void staticMethod(){
            println("Static Method of the Inner Class");

        }
        
        //Non-Static Members;
        String nonStaticField = "Non-Static Field Of InnerClass";
        void nonStaticMethod() {
            println("Non-Static Method Of Inner Class");
        }

        void accessOuterMembers(){
            //Access static members of Outer class directly
            println(staticField); //println itself is the static wrapper method of the outerclass
            //which is very helpful to avoid writing the full clarification and it is belongs to class itself thats why it can be run without the help of any instance of the class
            println("\n");
            staticMethod();

            //Access non-static member of the Outer class - Need an Instance of Outer class
            // System.out.println(nonStaticField);// ❌ Error: Cannot access non-static Field directly

            Outer outerInstance = new Outer();
            println("\n"); //leaving a line
            println(outerInstance.nonStaticField);
            println("\n"); //leaving a line
            outerInstance.nonStaticMethod();
            println("\n"); //leaving a line on console
            println(outerInstance.staticField); //an instance of the class can access its static fields and methods also;
            

        }
    }

    void accessInnerMembers(){
        // Access Static members of the static nested class
        println(Inner.InnerStaticField);
        Inner.staticMethod();

        // Access Non - Static Members of the Static nested class

        Inner innerInstance = new Inner(); // to access the inner non-static members we have to create the instance of the inner class
        println("yeah 😀 "+innerInstance.nonStaticField);
        innerInstance.nonStaticMethod();

    }
}

class MainClass{
    public static void main(String[] args){
        Outer.Inner inner = new Outer.Inner();
        inner.accessOuterMembers();

    //Outer class accessing the members of the innerclass
        Outer outer = new Outer();
        outer.accessInnerMembers();
        
        
    }
}


// Why Is This Behavior the Case?
// Static Context: A static nested class is nested within the outer class but does not have a reference to any particular instance of the outer class. It belongs to the class level, not the instance level.
// Non-Static Members: Since non-static members of the outer class are tied to an instance, the static nested class cannot directly access them unless you explicitly provide an instance of the outer class.

// Summary for inner class
// Static fields and methods of the outer class are directly accessible within the static nested class.
// Non-static fields and methods of the outer class require an instance of the outer class to be accessed.
// The static nested class itself behaves like a top-level class but is scoped within the outer class.

// Detailed Explanation for Outer Class 
// Accessing Static Members of the Static Nested Class:

// The static members of the static nested class (staticField and staticMethod) can be accessed directly using the class name (Inner) because they belong to the class and not an instance.
// Accessing Non-Static Members of the Static Nested Class:

// The non-static members of the static nested class (nonStaticField and nonStaticMethod) require an instance of the static nested class to be accessed. This is because non-static members belong to an instance, not the class itself.
// Why Can the Outer Class Access Static Nested Class Members?
// The outer class and the static nested class share the same enclosing scope.
// Since the static nested class is defined within the outer class, it is fully visible to the outer class.
