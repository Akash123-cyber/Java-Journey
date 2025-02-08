package Unit1;

class BooleanLogicalOperators{

    public static void println(String message){
        System.out.println(message);
        // wrapper function or wrapper method;
    }


    public static void main(String[] args){
        // (&) Logical And vs the   (&&) short-circuit And
        int a = 10;
        int b = 5;
        int c = 20;

        // NOTE:: IN A&&B if and only if A is false then no matter what B is the result will be false
        // cause b wont be executed at all

        System.out.println(a<b && a++<c);//false
        System.out.println(a);//10 because second condition is not checked
        
        System.out.println(a>b && a++<c);//true
        System.out.println(a);//11 true cause it only works when operand A is false
        
        
        //NOTE::  IN A&B both the operand conditions will be checked;
        // Now a is 11 and c is 20 
        System.out.println(a<b & a++<c);// false (false & true = false)
        System.out.println(a>b & a++<c);// false (true & true = true)

// --------------------------------------------------------------------------------------------------------------------------


        // (||) short-circuited OR  and   (|) logical OR


        // NOTE:: IN A||B If and only if A is true then only the short circuited OR results in true 
        // No matter the value of B as B will not be checked/executed;    
        
        // now here a is 13 already
        println("------------------------------------------------------------------------------");
        println("a is: "+a+", b is: "+b+" and c is: "+c);

        // doing for the short circuited OR  
        System.out.println(a>b || a++<c);//true
        System.out.println(a);//13 because second condtion is not checked 

        System.out.println(a<b || a++>c);//false
        System.out.println(a);//14 because second is checked;


        // now doing for Logical Operator (|)

        // here a is 14;
        System.out.println(a>b | a++<c);//true
        System.out.println(a);//15 because the both the condition got checked unlike the ||

        System.out.println(a<b | a++<c);//(true Or false = true)
        System.out.println(a);//16





    }


}