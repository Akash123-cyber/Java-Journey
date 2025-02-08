package Unit1;


//Breakdown of the System.out.println statement  

// System class:

// It is a final class in the java.lang package.
// It cannot be subclassed because it's marked as final.

// out field:

// out is a static field of the System class.
// It is a pre-instantiated object (or reference) of the PrintStream class.
// It is used to send output to the console.

// println method:

// It is a non-static method of the PrintStream class.
// Because println is non-static, it is called on the out object (System.out.println), which is why you need the out object to access it.

// Purpose:
// System.out.println allows us to print text to the console using the PrintStream object (out).

// --------------------------------------------------------------------------------------------------------------------------------------------------------

class AboutMainFunction {
    
    public static void main(String[] args){
        println("Hello Java");     //Breakdown of the main method at the end of the page
    }


    private static void println (String message){ //private to maitain the access of this function to this class only
        System.out.println(message);
    }


    
}
// Context of System Class Being final
// final Class:

// A class marked as final cannot be extended (i.e., no child class can be created from it).
// This is done to prevent inheritance and modification of the class's behavior.
// Why is the System class final?

// The System class is part of the core Java API (java.lang) and provides critical functionality (like input/output through System.in and System.out, loading environment properties, etc.).
// Making it final ensures security and consistency by preventing anyone from altering its behavior by subclassing it.
// Implications of Being final:

// You cannot create a subclass of System to override or add new functionality.
// For example, this would result in a compilation error:

// ----------------------------------------------------------------------------------------------------------------------------------------------------------

// Let's break down the parameters of the main method:

// Main method is a entry window for JVM to 

// Code:
// java
// Copy code
// public static void main(String[] args) {
//     println("Hello Java");
// }
// Understanding the Parameters:
// The main method in Java has a parameter: String[] args. Here's what each part represents:

// String[]:

// This indicates that the parameter is an array of Strings.
// Each element of the array is a String.
// args:

// This is the name of the parameter. It's a conventional name and can be changed to any valid identifier (e.g., arguments, input, etc.). However, args is widely used by convention.
// Purpose:

// This array is used to capture command-line arguments that are passed to the program when it is run.
// When you run a Java program, you can pass arguments via the command line, and these arguments are stored in the args array.
// --------------------------------------------------------------------------------------------------------------------------------------
// Why is String[] used as the parameter?
// Command-Line Input: It provides a way to input data into the program when it starts.
// Flexibility: Using an array allows passing multiple arguments as needed.
// String Type: Command-line arguments are always interpreted as strings, which is why the array is of type String[].
// -----------------------------------------------------------------------------------------------------------------------------------------------------
