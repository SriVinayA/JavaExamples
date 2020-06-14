/*
 * input2 = 0 
 * ---------- 
 * Wipro Technologies Bangalore -> orpiW seigolonhceT erolagnaB
 * 
 * Wipro Technologies, Bangalore -> orpiW ,seigolonhceT erolagnaB
 * 
 * input2 = 1 
 * ---------- 
 * Wipro Technologies Bangalore -> Orpiw Seigolonhcet Erolagnab
 * 
 * Wipro Technologies, Bangalore -> Orpiw ,seigolonhceT Erolagnab
 */

package Wipro;

import java.util.Arrays;
import java.util.Random;

public class ReverseStringWords {
    public static void main(String[] args) {
        String input1 = "Wipro Technologies Bangalore";
        Random random = new Random();
        int input2 = random.nextInt(1);

        String[] arr = input1.split(" ");
        if(input2 == 0){
            for (String s : arr) {

            }
        }
    }
}