/*
String input1 = "Rajiv";
String input2 = "Roy";
int input3 = 560037;
int input4 = 6;
----------------------------------
ANSWER = VrOY75
----------------------------------

String input1 = "Manoj";
String input2 = "Kumar";
int input3 = 561327;
int input4 = 2;
----------------------------------
ANSWER = JkUMAR62
----------------------------------
*/

package WiproPrograms;

public class UserIDGeneration_2 {
    public static void main(String[] args) {
        String input1 = "Rajiv";
        String input2 = "Roy";
        int input3 = 560037;
        int input4 = 6;
        //ANSWER = VrOY75

        String output = "";
        String sName;
        String lName;

        if(input1.length() > input2.length()){
            sName = input2;
            lName = input1;
        }
        else if(input1.length() < input2.length()){
            sName = input1;
            lName = input2;
        }
        else {
            if(input1.compareTo(input2) < 0){
                sName = input1;
                lName = input2;
            } else{
                sName = input2;
                lName = input1;
            }
        }

        output += lName.charAt(lName.length() - 1); //output = v
        output += sName; //output = vRoy

        output = oppositeCase(output); //output = VrOY

        output += String.valueOf(input3).charAt(input4 - 1); //output = VrOY7

        String sb = new StringBuilder(String.valueOf(input3)).reverse().toString();
        output += sb.charAt(input4 - 1); //output = VrOY75

        System.out.println(output);  //return output;
    }

    public static String oppositeCase(String str){
        String output = "";

        for(int i=0; i<str.length(); i++){
            char ch = str.charAt(i);
            if(Character.isUpperCase(ch))
                output += Character.toLowerCase(ch);
            else
                output += Character.toUpperCase(ch);
        }
        return output;
    }
}