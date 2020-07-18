/*
*if the two letters in the separated words are same then add that letter to output and so on...
*If letters are not same then find the difference between their position values and then
    convert the value to its letter according to the its position then add to output and so on...
*Final output should be in Uppercase
*
Example-1:
input1 = "ww:ii:pp:rr:oo"

w=w => w
i=i => i
p=p => p
r=r => r
o=o => o

output : WIPRO
--------------------------------
Example-2:
input1 = "zx:za:ee";

z!=x => z-x => 26-24 => 2  => b
z!=a => z-a => 26-1  => 27 => y
e=e  => e

output : BYE
*/
package WiproPrograms;

public class FormAWord {
    public static void main(String[] args) {
        String input1 = "zx:za:ee";

        String[] str = input1.split(":");
        String output = "";
        for (String s : str) {
            if (s.charAt(0) == s.charAt(1)) output += s.charAt(0);
            else {
                int n = Math.abs(s.charAt(0) - s.charAt(1)) + 64;
                output += (char) n;
            }
        }
        System.out.println(output.toUpperCase());
    }
}