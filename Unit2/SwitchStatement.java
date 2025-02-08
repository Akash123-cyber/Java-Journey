package Unit2;

// Difference between the switch and ifs 
// switch can only test for equality, whereas if can evaluate any type of Boolean expression. that
// is, the switch looks only for a match between the value of the expression and one of its case constants.

// A switch statement is usually more efficient than a set of nested ifs.
// Note:: No two case constants in the same switch can have identical values. of course, a switch statement and 
// an enclosing outer switch can have case constants in common.

import java.util.Scanner;
class SwitchStatement {
    
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the Value from 0 to 9: ");
        int value = sc.nextInt();

        switch (value){

            case 0:
                System.out.println("You Entered zero");
                break;

            case 1:
                System.out.println("You Entered One");
                break;

            case 2:
                System.out.println("You Entered two");
                break;

            default:
                System.out.println("You know what you entered");
                break;
        }
        sc.close();

    }
}
