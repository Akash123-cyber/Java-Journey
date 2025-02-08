package Unit2.DateTimeAPI;

import java.time.*;

class OfMethodOfLocalTimeClass{

    public static void main(String[] args){

        // Example of LocalTime of(int hour, int minutes)
        LocalTime localTime = LocalTime.of(6,5);

        System.out.println("Time: "+localTime);

// ---------------------------------------------------------------------------------------------------------
        // Example of LocalTime of(int hour, int minute, int second)

        LocalTime localTime2 = LocalTime.of(6,5,40);

        System.out.println("Time with Seconds: "+localTime2);

// -------------------------------------------------------------------------------------------------------------------

        // Example of LocalTime of(int hour, int minute, int seconds, int nanosecond)

        LocalTime localTime3 = LocalTime.of(6,5,40,50);

        System.out.println("Time with Nanoseconds also: "+localTime3);
    }
}