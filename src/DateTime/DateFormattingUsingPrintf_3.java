package DateTime;

import java.util.Date;

public class DateFormattingUsingPrintf_3 {
    public static void main(String[] args) {
        var date = new Date();

        System.out.printf("%s %tB %<te, %<tY", "Due date:", date);
    }
}