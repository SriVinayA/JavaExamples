package DateTime;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateFormattingUsing_SimpleDateFormat {
    public static void main(String[] args) {
        var date = new Date();
        var simpleDateFormat = new SimpleDateFormat("E yyyy.MM.dd 'at' hh:mm:ss a zzz");

        System.out.println(simpleDateFormat.format(date));
    }
}