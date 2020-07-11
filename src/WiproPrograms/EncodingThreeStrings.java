package WiproPrograms;

public class EncodingThreeStrings {
    public static void main(String[] args) {
        String input1 = "John";
        String input2 = "Johny";
        String input3 = "Janardhan";

        String[] arr1 = new String[3];
        String[] arr2 = new String[3];
        String[] arr3 = new String[3];

        stringDivision(input1, input1.length(), arr1);
        stringDivision(input2, input2.length(), arr2);
        stringDivision(input3, input3.length(), arr3);

        System.out.println(arr1[0] + arr2[0] + arr3[0]);
        System.out.println(arr1[1] + arr2[1] + arr3[1]);
        System.out.println((arr1[2] + arr2[2] + arr3[2]).toUpperCase());

    }

    private static void stringDivision(String input, int len, String[] arr) {
        int k = len / 3;
        if (len % 3 == 0) {
            arr[0] = input.substring(0, k);
            arr[1] = input.substring(k, 2 * k);
            arr[2] = input.substring(2 * k, len);
        } else if (len % 3 == 1) {
            arr[0] = input.substring(0, k);
            arr[1] = input.substring(k, 2 * k + 1);
            arr[2] = input.substring(2 * k + 1, len);
        } else if (len % 3 == 2) {
            arr[0] = input.substring(0, k + 1);
            arr[1] = input.substring(k + 1, 2 * k + 1);
            arr[2] = input.substring(2 * k + 1, len);
        }
    }
}
