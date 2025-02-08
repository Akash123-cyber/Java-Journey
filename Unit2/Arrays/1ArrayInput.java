package Unit2.Arrays;

import java.util.Scanner;
import java.util.Arrays;
class ArrayInput{
    public static void main(String[] args){
        
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the Size for the Array: ");
        int size  = sc.nextInt();

        int[] arr = new int[size];

        System.out.print("Now enter the Elements for the Array: ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();

        }
        // Note: arr.length we can use this method to know the length of the array;
        

        System.out.println("Array : "+Arrays.toString(arr));

        sc.close();

        

    }
}