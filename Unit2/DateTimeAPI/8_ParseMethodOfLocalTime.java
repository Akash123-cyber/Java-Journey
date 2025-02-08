package Unit2.DateTimeAPI;

import java.time.*;

class ParseMethodLocalTimeClass{

    public static void main(String[] args){

        // Creates a Local time object
        LocalTime lt = LocalTime.parse("10:15:45");

        System.out.println("Local Time: "+ lt);
    }
}