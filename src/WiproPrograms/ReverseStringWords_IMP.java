/*
 * input2 = 0 
 * ---------- 
 * Wipro TechNologies BangaLore -> orpiW seigoloNhceT eroLagnaB
 * 
 * Wipro TechNologies, BangaLore -> orpiW ,seigoloNhceT eroLagnaB
 *
 * input2 = 1 
 * ---------- 
 * Wipro TechNologies BangaLore -> Orpiw SeigOlonhcet ErolaGnab
 * 
 * Wipro TechNologies, BangaLore -> Orpiw ,seigoloNhceT ErolaGnab
 */

package WiproPrograms;

import java.util.*;

public class ReverseStringWords_IMP {
    public static void main(String[] args) {
        String input1 = "Wipro TechNologies, BangaLore";
        Random random = new Random();
        int input2 = random.nextInt(2); // -> 0 or 1

        StringBuilder result = new StringBuilder();
        String[] arr = input1.split(" ");

        if (input2 == 0) {
            for (String s : arr) {
                String str = reverseWord(s);
                result.append(str).append(" ");
            }
        }

        else if (input2 == 1) {
            for (String s : arr) {
                StringBuilder word = new StringBuilder();
                ArrayList<Integer> al = new ArrayList<>();
                for (int i = 0; i < s.length(); i++) {
                    int num = s.charAt(i) - 64;
                    if (1 < num && num < 26) {
                        al.add(i);
                    }
                }
                String str = reverseWord(s.toLowerCase());
                for (int i = 0; i < str.length(); i++) {
                    boolean k = checkNumber(i, al);
                    if (k) {
                        if (Character.isLetter(str.charAt(i))) {
                            word.append(Character.toUpperCase(str.charAt(i)));
                        } else {
                            word = new StringBuilder(reverseWord(s));
                            break;
                        }
                    } else {
                        word.append(str.charAt(i));
                    }

                }
                result.append(word).append(" ");
            }
        }

        System.out.println("input2 = " + input2);
        System.out.println("----------");
        System.out.println(result.toString().replaceAll(".$", ""));
    }

    private static boolean checkNumber(int i, ArrayList<Integer> al) {
        boolean k = false;
        for (int j : al) {
            if (i == j) {
                k = true;
                break;
            }
        }
        return k;
    }

    private static String reverseWord(String s) {
        StringBuilder str = new StringBuilder(s);
        return String.valueOf(str.reverse());
    }
}