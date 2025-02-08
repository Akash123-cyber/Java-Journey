package Unit1.HowToTakeInputs;
import java.util.Scanner;

class inputsUntilEndOfFile {
    
    public static void main(String[] args){
        System.out.println("As soon as you gonna enter exit program will exit: ");

        Scanner sc = new Scanner(System.in);

        while (sc.hasNext()) {
            String line = sc.nextLine();
            if (line.equalsIgnoreCase("exit")) {
                break; // Exit the loop if the user types "exit"
            }
            System.out.println(line);
        }
        
        sc.close();

    }
}
