/*

G	Era designator				AD
y	Year in four digits			2001
M	Month in year				July or 07
d	Day in month				10
h	Hour in A.M./P.M. (1~12)	12
H	Hour in day (0~23)			22
m	Minute in hour				30
s	Second in minute			55
S	Millisecond					234
E	Day in week					Tuesday
D	Day in year					360
F	Day of week in month		2 (second Wed. in July)
w	Week in year				40
W	Week in month				1
a	A.M./P.M. marker			PM
k	Hour in day (1~24)			24
K	Hour in A.M./P.M. (0~11)	10
z	Time zone					IST(Indian Standard Time)
'	Escape for text				Delimiter
"	Single quote				`

*/

package DateTime;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateFormattingUsingSimpleDateFormat {
    public static void main(String[] args) {
        var date = new Date();
        var simpleDateFormat = new SimpleDateFormat("E yyyy.MM.dd 'at' hh:mm:ss a zzz");

        System.out.println(simpleDateFormat.format(date));
    }
}