package DateTime;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class GregorianCalendarDemo {
    public static void main(String[] args) {
        String[] months = {"Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec"};
        int year = 0;

        var calendar = new GregorianCalendar();

        // Display current time and date information.
        System.out.println("Date: " +
                months[calendar.get(Calendar.MONTH)] +
                " " + calendar.get(Calendar.DATE) + " " +
                calendar.get(Calendar.YEAR));
        System.out.println("Time: " +
                calendar.get(Calendar.HOUR) + ":" +
                calendar.get(Calendar.MINUTE) + ":" +
                calendar.get(Calendar.SECOND));

        // BasicPrograms.Test if the current year is a leap year
        if(calendar.isLeapYear(year))
            System.out.println("The current year is a leap year");
        else
            System.out.println("The current year is not a leap year");
    }
}
