package HackerRank;

public class JavaSubstring {

    public static void main(String[] args) {
        String S = "Helloworld";
        int start = 3;
        int end = 7;
        String output = "";

        output = S.substring(start, end);
        System.out.println(output);
    }
}