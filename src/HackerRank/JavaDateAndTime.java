/*

Sample Input
------------
08 05 2015

Sample Output
-------------
WEDNESDAY

Explanation
-----------
The day on August 5th 2015 was WEDNESDAY.

*/

package HackerRank;

import java.time.LocalDate;
import java.util.*;

public class JavaDateAndTime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int year = sc.nextInt();
        int month = sc.nextInt();
        int day = sc.nextInt();
        sc.close();

        LocalDate dt = LocalDate.of(year, month, day);
        System.out.println(dt);
        String output = String.valueOf(dt.getDayOfWeek());
        System.out.println(output);
    }
}