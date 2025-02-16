package Unit2.DateTimeAPI;

import java.time.*;

class ClockCreation{

    public static void main(String[] args){
        // ZoneId method is used to create a time zone 
        ZoneId zid  = ZoneId.of("America/New_York");

        Clock clock = Clock.system(zid); //this method creates the clock based on the given zoneID

        Instant now = clock.instant(); //Fetches the current time as an instant

        System.out.println(now);
    }
}




