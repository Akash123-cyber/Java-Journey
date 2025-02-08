package Unit2.Arrays;
import java.util.Scanner;
class StringArrays {
    public static void main(String[] args){
        
        String s[] = new String[5];

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter 5 Strings: ");

        for (int j = 0; j < s.length; j++) {
            s[j]=sc.nextLine();
        }

        System.out.println("You Entered these strings: ");
    
        for(String x : s){
            System.out.print(x+" ");
        }

        System.out.println();

        sc.close();
    }
}
