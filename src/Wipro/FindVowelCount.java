package Wipro;

public class FindVowelCount {
    public static void main(String[] args) {
        String input1 = "arsenious"; // "cauliflower"; //"caesiious";
        int ac = 0, ec = 0, ic = 0, oc = 0, uc = 0;
        StringBuilder s1 = new StringBuilder();
        String output;
        StringBuilder s3 = new StringBuilder();

        for (int i = 0; i < input1.length(); i++) {
            char c1 = input1.charAt(i);

            switch (c1) {
                case 'a' -> ac++;
                case 'e' -> ec++;
                case 'i' -> ic++;
                case 'o' -> oc++;
                case 'u' -> uc++;
                default -> s3.append(Character.toUpperCase(c1));
            }
            s1.append(Character.toUpperCase(c1));
        }
        if (ac != 1 || ec != 1 || ic != 1 || oc != 1 || uc != 1) {
            String s2 = new StringBuffer(s1.toString()).reverse().toString();
            output = String.format("%s:ERROR", s2);
        } else {
            output = String.format("%s:%d", s3.toString(), s3.length());
        }
        System.out.println(output);
    }
}
