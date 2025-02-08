package Unit2.DateTimeAPI;

import java.time.*;

class ZoneIdMethodOfLocaTimeClass{

    public static void main(String[] args){

        // create a clock
        ZoneId zid = ZoneId.of("America/New_York");

        LocalTime time = LocalTime.now(zid);

        System.out.println("Time in NewYork: "+time);

    }
}