package Unit1;

class BitwiseOperator{

    public static void main(String[] args){
        // bitwise And &

        int a = 5;
        int b = 4;

        System.out.println(a&b);//4
        // as
        // a = 101; and
        // b = 100 so
        // ____|||______
    //   a&b = 100 = 4

        
        // Bitwise OR |
        System.out.println(a|b);//5
        // as
        // a = 101; and
        // b = 100 so
        // ____|||______
    //   a|b = 101 = 5


        // Bitwise XOR ^
        System.out.println(a^b);//1
        // as
        // a = 101; and
        // b = 100 so
        // ____|||______
    //   a^b = 001 = 1

// -----------------------------------------------------------------------------------

        System.out.println("-----------------------------------------------------------------------");

        // for positive number:
        
        // LEFT SHIFT OPERATOR
        int value = 4;
        int num = 2;

        System.out.println(value<<num);//16 = 4*(2^2)

        // RIGHT SHIFT OPERATOR
        
        System.out.println(value>>num);//1 = 4/(2^2)
// ----------------------------------------------------------------------------------
        
        // for negagtive number:

        // LEFT SHIFT OPERATOR
        value = -4;
        num = 2; 
        System.out.println(value<<num);//-16 = (-4)*(2^2);

        // RIGHT SHIFT OPERATOR

        System.out.println(value>>num);//-1 = (-4)/(2^2);

        // BUT
        // if value is not completely divisible
        value = -5;
        num =2;

        System.out.println(value>>num);// {(-5)/(2^2)} -1 = -2
        // -1 will be added if not completely divisible by the number, otherwise (value/(2^num)); 

// --------------------------------------------------------------------------------------------------------------------------------------------------------------

// THE UNSIGNED RIGHT SHIFT:

// In  these  cases,  to  shift  a  zero  into  the  high-order  bit  no matter what its initial value was. This is known as an unsigned shift. 
// • To   accomplish  this,  we  will  use  Java’s  unsigned,  shift-right operator, >>>, which always shifts zeros into the high-order bit.
// •  Example:
// –11111111 11111111 11111111 11111111      –1  in                 binary as an int
// –>>>24
// –00000000 00000000 00000000 11111111    255  in                 binary as an int

        int negUnsignedNumber  = -1;                            //–11111111 11111111 11111111 11111111      –1  in                 binary as an int

        int unsigned_Right_Shift_Result=negUnsignedNumber>>>24; // –00000000 00000000 00000000 11111111    255  in                 binary as an int

        System.out.println("printing unsigned_Right_Shift_Result = "+unsigned_Right_Shift_Result); //255 here no need to take twos complement just zeros the no_of ones as specified by right unsigned shift 


// Unsigned right shift exampleTake example of -1(which will be represented as 2’s Complement of 1)
// 00000000 00000000 00000000 00000001(1)[32 bit representation]
// Taking 2's Complement:
// 11111111 11111111 11111111 11111110
// +                                                                      1
// -----------------------------------------------------------
// 11111111 11111111 11111111 11111111(-1)
// >>>24[Unsigned right shift][Shifting by 24 bits]
// 00000000 00000000 00000000 11111111(255)[Here higher order bits are replaced 
// with 0[No matter what the sign was][Here no need to take 2’s complement again 
// to get final answer, it will be 255]
// But if we use:
// >>24
// It will be:
// 11111111 11111111 11111111 11111111[Here we need to take 2’s complement
// Taking 2’s Complement again, and it wil be -1


        int negativeNumber = -1;
        int rightShiftOfNegativeNumber = negativeNumber >> 2;
        
        System.out.println("rightShiftOfNegativeNumber = "+rightShiftOfNegativeNumber); 
        //Unlike the right unsigned shift operator here after zeroing the no_of Ones specified by the right shift operator we have to take the two's complement of the final result after zeroing
    }
    
}