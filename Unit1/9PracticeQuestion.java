package Unit1;

class PracticeQuestions{
    //wrapper function
    public static void println(String message){
        
        System.out.println();
    }

    public static void main(String[] args){

        System.out.println(20+2%3*5-10/5); //first mod then multiply and then divide then sub and add

        System.out.println(2%3*5); //first mod 2%3 = 2 => 2*5 = 10
// ----------------------------------------------------------------------------------------------------------------
        
        println("\n");

        int a = 6, b = 3, c = 2;
        
        System.out.println(a>b+c++);
        System.out.println(b+c++);
        
        int d = 6;

        System.out.println(a>d);
// ----------------------------------------------------------------------------------------------------------------
        
        println("\n");

        int a1 = 100;

        boolean b1 = false;

        System.out.println(++a1>100&!b1); //true ++ > !
// ----------------------------------------------------------------------------------------------------------------
        
        println("\n");

        int a2=6,b2=7;

        boolean c2;
        c2=++a2==b2||b2++>=8; //because of the short-circuited OR right side won't be evaluated thats why the answer will be "true  7"
        System.out.println(c2+" "+b2);

// ----------------------------------------------------------------------------------------------------------------
        println("\n");

        System.out.println(12^3); //15
        //nums: 8421
        // 12:  1100
        // 3 :  0011
        // __________
        // XOR :1111 = 15  

// ----------------------------------------------------------------------------------------------------------------
        
        println("\n");

        System.out.println(2>1||4>3?false:true); //short-circuited OR Right side unexecuted

// ----------------------------------------------------------------------------------------------------------------
        println("\n");

        byte b3 = 14;
        System.out.println(b3>>3); //1
        //      8421
        // 14 = 1110
        // _________________
        // >>3= 0001 = numerical 1

// ----------------------------------------------------------------------------------------------------------------
        println("\n");
        System.out.println(10+20+"Hello"); //here addition will take place
        System.out.println("Hello"+10+20); //but here addition wont take place because nums too will be treated as a string 


// ----------------------------------------------------------------------------------------------------------------
        println("\n");
        int x,y=10;
        int z=12;
        x=y++ + z++;
        System.out.println(x);
    










}
} 