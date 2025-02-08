package Unit1;

import java.util.Scanner;
class SwappingUsingXOR {

    public static void main(String[] args){
        
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the Number1: ");
        int a = sc.nextInt();
        
        System.out.print("Enter the Number2: ");
        int b = sc.nextInt();

        System.out.println("Before Swapping: a = "+a+", b = "+b);

        // Swapping using XOR;

        a = a ^ b; 
        b = a ^ b;
        a = a ^ b;

//  Example:
//  Initial values:
//  a = 5 (0101 in binary)
//  b = 10 (1010 in binary)
//  a = a ^ b:
//  a = 0101 ^ 1010 = 1111
//  Now, a = 15 (1111) and b = 10 (1010).

//  b = a ^ b:
//  b = 1111 ^ 1010 = 0101
//  Now, a = 15 (1111) and b = 5 (0101).

//  a = a ^ b:
//  a = 1111 ^ 0101 = 1010
//  Now, a = 10 (1010) and b = 5 (0101).
        System.out.println("After Swapping: a = "+a+", b = "+b);

        sc.close();

    }
}
