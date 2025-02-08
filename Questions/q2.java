// find slopw distance and midpoint of the given point and print the numbers till 2places after decimal point

package Questions;
import java.util.Scanner;

class q2 {

    public static void println(String message){
        System.out.println(message);
    }
    public static void print(String message){
        System.out.print(message);
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        println("Enter Number in the range of 1 to 3\n1 for slope\n2 for Distance\n3 for midpoints");

        int num  = sc.nextInt();

        if(num>0 && num<=3){
            println("Now Enter the Numbers in float");
            print("x1 = ");
            float x1 = sc.nextFloat();
            print("y1 = ");
            float y1 = sc.nextFloat();
            print("x2 = ");
            float x2 = sc.nextFloat();
            print("y2 = ");
            float y2 = sc.nextFloat();
            
            switch(num){

                case 1:
                    float slope = (y2-y1)/(x2-x1);
                    println("Slope: "+slope);
                    break;

                case 2:
                    double distance  = java.lang.Math.sqrt((x2 - x1)*(x2-x1) +(y2-y1)*(y2-y1));
                    String formattedDistance = String.format("%.2f",distance);

                    println("Distance: "+formattedDistance);
                    break;

                case 3:
                    float midpointX=(x1+x2)/2;
                    float midpointY=(y1+y2)/2;
                    println("Midpoint x= "+midpointX+" y= "+midpointY);
                    break;


                    
                    
                }
            }
            else{
                println("Invalid Choice. Please select a valid option");
            }

            sc.close();
            
    }    
}
