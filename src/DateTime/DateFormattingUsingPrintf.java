package DateTime;

import java.util.Date;

public class DateFormattingUsingPrintf {
    public static void main(String[] args) {
        var date = new Date();

        var str = String.format("%tc", date);
        System.out.print(str);
    }
}