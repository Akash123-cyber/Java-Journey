package Unit2.DateTimeAPI;

import java.time.*;

class ParseMethod{

    public static void main(String[] args){

        //create a LocalDate object
        LocalDate localDate = LocalDate.parse("2025-05-30");

        //print
        System.out.println("LocalDate :"+localDate);

        // More Examples

        // LocalDate ldt = LocalDate.now();
        // ldt = LocalDate.of(2015, Month.FEBRUARY, 28);
        // ldt = LocalDate.of(2015, 2, 13);
        // ldt = LocalDate.parse("2017-02-28”);
    
}

}