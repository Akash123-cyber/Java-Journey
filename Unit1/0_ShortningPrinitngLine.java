package Unit1;

import static java.lang.System.out;

class ShortningPrinitngLine {

//Here we are going to short :
// System.out.println(); line

// method 1
// add import static java.lang.System.out line at the top of the class 
private static void shortPrint(){
    out.println("Hello World!");
}

// method 2
// Using Custom Wrapper Method:
private static void println(String message){
    System.out.println(message);
}

public static void main(String[] args){

    println("Printing with the help of import java.lang.System.out Statement: ");
    shortPrint();

    println("\nPrinting with the help of the Wrapper method: \nHello World! 😀");
}





    
}
