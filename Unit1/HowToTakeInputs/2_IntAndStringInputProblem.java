package Unit1.HowToTakeInputs;

import java.util.Scanner;

// INPUT PROBLEM OF INTEGER AND STRING ONE AFTER ANOTHER IS DISCUSSED HERE: 

class IntAndStringInputProblem {

    public static void print(String message){
        System.out.print(message);
    }

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

// 1 . Taking input of Integer and String Together

        print("Enter a integer: ");
        
        int num = sc.nextInt();//Reads the integer 
        
        sc.nextLine(); //Consumes the leftover newline

        print("Enter a string: ");

        String strL = sc.nextLine(); //Reads the full line

        System.out.println("You entered: "+num+" and "+strL);

        // NOTE~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
        // The reason for the line sc.nextLine(); after reading the integer is to handle 
        // the newline character left behind by the nextInt() method. Without it, 
        // the subsequent sc.nextLine() (for reading a string) would just consume 
        // the leftover newline character instead of waiting for the user to input a string.
        // ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
        //  What Happens with sc.nextInt()?
            // When you input an integer using sc.nextInt(), it reads the integer from the input 
            // but does not consume the newline character (\n) that is generated when you press Enter.
            // As a result, the newline remains in the input buffer
    
            // Why Use sc.nextLine() After sc.nextInt()?
            // The intermediate sc.nextLine() after reading the integer ensures that 
            // the leftover newline is consumed, so the next sc.nextLine() can correctly 
            // wait for and read the user’s string input
        // ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~

        sc.close();
    
    
        }
    
}
