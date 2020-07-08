package DateTime;

import java.util.Date;

public class DateFormattingUsingStringFormat {
    public static void main(String[] args) {
        var date = new Date();

        System.out.format("%tc", date);
    }
}