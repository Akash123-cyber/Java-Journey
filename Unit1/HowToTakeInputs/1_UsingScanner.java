package Unit1.HowToTakeInputs;
// 1. Using Scanner (Most Common)
// The Scanner class from java.util is widely used to take user input because of its simplicity.

// Steps to Use Scanner

// Import the class: import java.util.Scanner;
// Create a Scanner object: Scanner sc = new Scanner(System.in);

// Use appropriate methods to read inputs.

// Scanner Methods for Different Data Types

// Data Type	        Scanner Method	        Example Code
// int	                   nextInt()	        int x = sc.nextInt();
// long	                   nextLong()	        long l = sc.nextLong();
// float	               nextFloat()	        float f = sc.nextFloat();
// double	               nextDouble()	        double d = sc.nextDouble();
// String	               next()	            String str = sc.next();
// Multi-word	           nextLine()	        String line = sc.nextLine();
// char	                   No direct method 	Use char ch = sc.next().charAt(0);
// boolean	               nextBoolean()	    boolean b = sc.nextBoolean();

// int and long:

// Both are used to represent whole numbers in Java.
// int is 32-bit, while long is 64-bit, but the key focus here is on their mathematical use for integers.
// float and double:

// Both are floating-point types in Java, conforming to the IEEE 754 standard.
// float is single-precision, and double is double-precision.
// These are used for representing real numbers and allow decimal and scientific notation values.

import java.util.Scanner;


class UsingScanner {

    public static void print(String message){
        System.out.print(message); //wrapper function for print so no linefeed \n character is included
        // in this method
    }

    public static void main(String[] args){

// 1. INT
        Scanner sc = new Scanner(System.in);

        // print("Enter The value for x: ");
        // int x = sc.nextInt();

        // print("Value of input x : "+x+"\n");

        // print("Enter the value for y: ");
        // int  y = sc.nextInt();

        // // print("Addition of x+y = "+x+y); 
        // // we cannot add it like this as both x and y are treated as string 

        // System.out.print(" x + y = ");
        // System.out.println(x+y);

// -------------------------------------------------------------------------------------------------------
        // 2 LONG DATA TYPE INPUT its basically a long integer

        // print("Enter value for l: ");
        // long l = sc.nextLong();

        // print("Enter value for l1: ");
        
        // long l1= sc.nextLong();

        // long result = l + l1;

        // print("l + l1 = "+result+"\n");

        // print("l2 = ");
        // long l2 = sc.nextLong();

        // print("l3 = ");
        // long l3 = sc.nextLong();

        // print("l2 X l3 = ");
        // System.err.println(l2*l3);

// ----------------------------------------------------------------------------------------------------------------------

// 3. float data type input 
        // print("f = ");
        // float f = sc.nextFloat();

        // print("f1 = ");
        // float f1 = sc.nextFloat();

        // print("f / f1 = ");

        // System.out.println(f/f1);
    
        // NOTE: fractional part will be discarded only in divisions of int and longs

// --------------------------------------------------------------------------------------------------------------------------------

// 4. double data type input:

        // print("d = ");

        // double d = sc.nextDouble();
        
        // print("d1 = ");

        // double d1 = sc.nextDouble();

        // print("d % d1 = ");

        // System.out.println(d%d1);
        
// --------------------------------------------------------------------------------------------------------------------

// 5. String data Type input:

        // print("str = ");

        // String str = sc.next();

        // print("str1 = ");

        // String str1 = sc.next();

        // print("str + str1 = ");

        // System.out.println(str+str1);
    
        // System.out.println(str==str1);

// ----------------------------------------------------------------------------------------------------------------------

// 6. Char Input

        // NO direct method for this:

        // use char ch = sc.next().charAt(0);

        // print("enter the sentence: ");

        // char ch = sc.next().charAt(0);

        // print("sentence : "+ch);

// ----------------------------------------------------------------------------------------------------------------------------------

// 7. Line Input (multi word inputs)

        // print("Enter the sentence: ");

        // String strLine = sc.nextLine();

        // print("Enter the second Second Sentence: ");

        // String strLine1 = sc.nextLine();

        // print("Result = "+strLine+strLine1);

//---------------------------------------------------------------------------------------------------------------------------------------------

// 8. Boolean input

        // Note : Only take inputs as  true and false not 0s and 1s

        print("b = ");

        boolean b = sc.nextBoolean();

        print("b1 = ");

        boolean b1 = sc.nextBoolean();

        print("Short circuited OR => b || b1 = ");
        System.out.println(b||b1);

        sc.close();
    
    }
    



    
}