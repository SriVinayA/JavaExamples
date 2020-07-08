package DateTime;

import java.util.Date;

public class DateFormattingUsingPrintf_2 {
    public static void main(String[] args) {
        var date = new Date();

        System.out.printf("%1$s %2$tB %2$td, %2$tY", "Due date:", date);
    }
}