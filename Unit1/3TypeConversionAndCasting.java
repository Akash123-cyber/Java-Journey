package Unit1;
// package : this keyword in java organizes the classes into the namespaces. It helps in avoiding name conflicts and controlling access.

//Unit1: The name of the package it should be located inside a directory named unit1.

class TypeConversionAndCasting{
    public static void main(String[] args){

        //When one type of data (smaller data type) is assigned to another type of variable (larger data type), an automatic type conversion will take place if the following
        // two conditions are met:
        //1> The two types are compatible.
        //2> The destination type is larger than source type.
        // When these two conditions are met a widening conoversion take place.
        //For example, the int type is always large enough to hold all valid byte values, so no explicit cast statement is required.
        //But if we try to assign the larger data type value (int ) to smaller data type value (byte) error would arise. so we need explicit data conversion statements


        // Widening conversion or Automatic Conversion:
        // Byte -> Short -> Int -> Long -> Float -> Double
        
        byte x = 123; // Assigning a valid byte value
        int y = x;    // Implicit widening conversion (byte to int)

        String message = "The Variable with Byte data type has value: "+x;
        System.out.println(message); // Output: 123

        String m1="The Variable with Data Type as int has value: "+y;
        System.out.println(m1);

        // String formatted = "Variable Type is Byte with value : "+x;

    //  ______________________________________________
    // |                                             |
    // |   int y = 123;                              |
    // |   byte x =y; Error-Incompatible type        |
    // |                                             |
    // |_____________________________________________|

        
    // Narrowing Conversion OR Explicit conversion:

    int a = 100;
    byte b =(byte)a;

    String m2 = "Narrow Conversion of int a to byte b results byte b = "+b;
    System.out.println(m2);

    double d  = 123.999999d;

    int i  = (int) d;

    System.out.println("The value of I variable :"+i); //output = 123;
    // because when doing the narrowing or Explicit Type Casting the fractional part is truncated instead of roudingoff thats why the output is 123;


    byte v = 127;
    v++;
    System.out.println("Value of byte type v = 127 increment by one"+v);
    
//     The increment operator v++ increases the value of v by 1.
//     Since v is already at the maximum value for a byte (127), incrementing it causes integer overflow in the byte range.
//     After incrementing:
//     The value wraps around from 127 to the lowest value in the byte range, which is -128
//     This happens because of how the integers are represented in 2's Complement 
//     127 is rep as 0111 1111 but when doing increment + 0000 0001 it becomes 1000 0000 which is represented as -128 thats
//     why the value of v wraps around to be -128

// similarly for the case of decrement for more follow the PDF;

    v--;
    System.out.println("Now Decrement of V:" +v);

    
    
    






    }
}