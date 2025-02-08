package Unit1;

import java.util.Scanner;
public class wrapperMethod {
    
    // Below is Wrapper function for println()
    public static void println(String message){

        System.out.println(message);

    }

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();

        println("You entered : "+num);

        sc.close();

    }
}
