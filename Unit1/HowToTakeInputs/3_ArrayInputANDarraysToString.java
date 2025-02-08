package Unit1.HowToTakeInputs;

import java.util.Scanner;
import java.util.Arrays; //Import Arrays class for toString method

class ArrayInput {

    public static void print(String message){

        System.out.print(message);


    }

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        print("Enter the size of the array: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        print("Enter "+n+" Integers");

        for ( int i = 0; i<n; i++) {

            arr[i] = sc.nextInt();
        }

        System.out.println("Array: "+Arrays.toString(arr)); 
        // above we imported java.util.Arrays

        sc.close();
    }
    
}
