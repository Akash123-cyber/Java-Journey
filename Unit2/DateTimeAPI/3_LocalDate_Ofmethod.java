package Unit2.DateTimeAPI;

import java.time.*;

class OfMethodLocalDate{

    public static void main(String[] args){

         // Example of (of() method)
        // public static LocalDate of(int year,int month,int dayOfMonth)
        
        // create LocalDate object
        LocalDate localDate = LocalDate.of(2020,5,13);

        //print full date
        System.out.println("Date: "+ localDate);

// ----------------------------------------------------------------------------------

        //localDate object
        LocalDate localDate2 = LocalDate.of(2020,Month.MARCH,17);

        System.out.println("localDate2: "+localDate2);
    }
}