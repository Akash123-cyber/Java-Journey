package Unit2.DateTimeAPI;

// Methods of LocalTime class

// 1. public static LocalTime now()
// 2. public static LocalTime now(ZoneId zone)

// 3. public static LocalTime of(int hour, int minute)
// 4. public static LocalTime of(int hour, int minute, int second)
// 5. public static LocalTime of(int hour, int min, int sec, int nsec)

// 6.public static LocalTime parse(CharSequence text)

import java.time.*;

class nowMethodLocalTimeClass{

    public static void main(String[] args){

        // Example of (now()) method of LocalTime Class

        LocalTime time = LocalTime.now();

        //printing 
        System.out.println("Time: "+time);
    }
}