package Unit1.HowToTakeInputs;
import java.io.*;


// Steps to Use BufferedReader
// Import: import java.io.*;
// Create: BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
// Use readLine() to read input as a string.
class BufferedReaderInput {
    
// The line import java.io.*; in Java is an import statement that brings all classes from the java.io package into your program. Here's a detailed explanation:
// File: Represents files and directories.
// FileReader: Reads character files.
// FileWriter: Writes characters to files.
// BufferedReader: Reads text from a character-based input stream, with buffering to improve performance.
// BufferedWriter: Writes text to a character-based output stream, with buffering.
    public static void main(String[] args) throws IOException{ //Alternatively we can declare the IOException method in the main signature
        // By declaring throws IOException in the main method signature, you're telling Java that this method might throw an IOException,
        //  and the calling code (in this case, the JVM) should handle it. This way, you're not forced to handle the exception directly within the method using a try-catch block; instead, you're delegating the responsibility of handling it to the caller.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    //    The error in the code is likely caused by the IOException that can occur when using readLine() 
    //    with BufferedReader. The readLine() method throws this exception, so you need to handle 
    //    it either with a try-catch block or by declaring it in the method signature using throws.

            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("Enter a string:");
            String str = br.readLine();
            System.out.println("You entered: " + str);
        
       

    }
}
