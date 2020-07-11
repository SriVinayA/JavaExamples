package WiproPrograms;

public class ReducedString {
    public static void main(String[] args) {
        String input1 = "LOCKDOWN"; //"REQUEST"
        StringBuilder s1 = new StringBuilder();
        int len = input1.length();

        if (len % 2 == 0) {
            s1.append(input1.charAt(0));
            for (int i = 1; i < len; i = i + 2) {
                s1.append(input1.charAt(i));
            }
        } else {
            for (int i = 0; i < len; i = i + 2) {
                s1.append(input1.charAt(i));
            }
        }
        System.out.println(s1);
    }
}
