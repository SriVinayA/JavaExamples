package WiproPrograms;

import java.util.*;

public class PrimeNumbersSpecificRange {
    public static void main(String[] args) {
        int input1 = 1;
        int input2 = 23;
        String k = "p";
        List<Integer> list = new ArrayList<Integer>();
        while (input1<=input2) {
            for (int i = 2; i <= input1/2; i++) {
                if (input1%i==0) {
                    k = "np";
                    break;      
                } else {
                    k = "p";
                }
            }
            if (k.equals("p")) {
                list.add(input1);
            }
            input1++;
        }
        System.out.println(list);
        System.out.println(list.size());
        for (Integer integer : list) {
            System.out.print(integer + " ");
        }
    }   
}