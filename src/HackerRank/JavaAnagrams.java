package HackerRank;

public class JavaAnagrams {
    static boolean isAnagram(String a, String b) {
        if (a.length() != b.length()) return false;

        char[] a1 = a.toLowerCase().toCharArray();
        char[] b1 = b.toLowerCase().toCharArray();

        java.util.Arrays.sort(a1);
        java.util.Arrays.sort(b1);
        return java.util.Arrays.equals(a1, b1);
    }

    public static void main(String[] args) {
        String a = "listen";
        String b = "silent";
        boolean ret = isAnagram(a, b);
        System.out.println((ret) ? "Anagrams" : "Not Anagrams");
    }
}