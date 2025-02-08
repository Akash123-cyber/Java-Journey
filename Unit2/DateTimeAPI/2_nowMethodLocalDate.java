package Unit2.DateTimeAPI;

// Methods of Local Date 
// 1. public static LocalDate now()
// 2. public static LocalDate now(Zoneld zone)
// 3. public LocalDate of(int year, Month month,int dayOfMonth)
// Note: DateTimeException can be thrown

//4. public static LocalDate of(int year, int month, int dayOfMonth)
// NOte:: DateTimeException can be thrown

// 5. public static LocalDate parse(CharSequence text)
// NOte: DateTimeParseException can be thrown.

import java.time.*; 
// * asterisk is to import everything

class UsingLocalDate{

    public static void main(String[] args){
        //create an LocalDate object

        LocalDate localDate = LocalDate.now();

        System.out.println("Local Date: "+localDate);
// -------------------------------------------------------------------------------------------------
        //Now (ZoneId zone)
        //create a clock
        ZoneId zid = ZoneId.of("America/New_York");

        // create an LocalDate object using now(ZoneId)
        LocalDate ld = LocalDate.now(zid);

        //print result
        System.out.println("Local Date: "+ld);
// ------------------------------------------------------------------------------------------------------------
        ZoneId zidParis = ZoneId.of("Europe/Paris");

        LocalDate parisDate = LocalDate.now(zidParis);

        System.out.println("Local Date in Paris: "+parisDate);

// ------------------------------------------------------------------------------------------------------

        // Example of (of() method)
        // public static LocalDate of(int year,int month,int dayOfMonth)
        
        // create LocalDate object
        LocalDate localDate2 = LocalDate.of(2020,5,13);

        //print full date
        System.out.println("Date: "+ localDate2);
    }
}