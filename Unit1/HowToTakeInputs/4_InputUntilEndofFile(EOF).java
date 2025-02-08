package Unit1.HowToTakeInputs;

import java.util.Scanner;
class InputUntilEndofFile {
    
    public static void print(String message){
        System.out.print(message);


    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        print("enter the Sentence: \n");

        while (sc.hasNext()) { //It take input unitl enter is hit then the next line of code prints the input on to the console and its a infinite loop
            System.out.println(sc.nextLine());
        }
        // this program will terminate with ctrl + D only
        

        // this can be done in this way also :

       sc.close();
    }
}
