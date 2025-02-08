//find largest and smallest int in array

package Questions;

import java.util.Scanner;
import java.util.Arrays;

class question{

    public static void main(String[] args){

        Scanner sc =new Scanner(System.in);

        int size = 5;

        int[] arr = new int[size];

        System.out.println("Enter the Elements: ");

        for(int i =0; i<size; i++){
            arr[i]=sc.nextInt();

        }

        System.out.println("Array: "+Arrays.toString(arr));
        int smallest  = arr[0];
        int largest = arr[0];

        
        
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]>largest) {
                largest = arr[i];

            }
            if (arr[i]<smallest) {
                smallest = arr[i];
            }


        }


        System.out.println("Largest: "+largest);
        System.out.println("Smallest: "+smallest);

        sc.close();
    }
}