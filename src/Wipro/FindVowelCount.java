package Wipro;

public class FindVowelCount {
    public static void main(String[] args) {
        String input1 = "arsenious"; // "cauliflower"; //"caesiious";
        int ac = 0, ec = 0, ic = 0, oc = 0, uc = 0;
        String s1 = "";
        String output = "";
        String s3 = "";

        for (int i = 0; i < input1.length(); i++) {
            char c1 = input1.charAt(i);

            switch (c1) {
                case 'a':
                    ac++;
                    break;

                case 'e':
                    ec++;
                    break;

                case 'i':
                    ic++;
                    break;

                case 'o':
                    oc++;
                    break;

                case 'u':
                    uc++;
                    break;

                default:
                    s3 += Character.toUpperCase(c1);
                    break;
            }
            s1 += Character.toUpperCase(c1);
        }
        if (ac != 1 || ec != 1 || ic != 1 || oc != 1 || uc != 1) {
            String s2 = new StringBuffer(s1).reverse().toString();
            output = String.format("%s:ERROR", s2);
        } else {
            output = String.format("%s:%d", s3, s3.length());
        }
        System.out.println(output);
    }
}
