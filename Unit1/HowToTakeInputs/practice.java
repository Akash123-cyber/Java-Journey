package Unit1.HowToTakeInputs;

import java.util.Scanner;
import java.util.Arrays; //Import Arrays class for to string method
class practice {

    public static void print(String message){
        System.out.print(message);
    }

    public static void main(String[] args){
       
        Scanner sc = new Scanner(System.in);

        int[] arr = new int[5];

        for(int i = 0; i < 5; i++){
           arr[i] = sc.nextInt();
            
        }

        String array = Arrays.toString(arr);
        
        System.out.println(array);

        sc.close();

       
    }
    
}
