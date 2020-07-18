package WiproPrograms;

public class MostFreqOccurDigit {
	public static void main(String[] args) {
		int input1 = 123, input2 = 456, input3 = 345, input4 = 5043; //6

		int[] arr = {input1, input2, input3, input4};
		int output = 0;
		int[] count = new int[10];
		int max = 0;
		for (int i : arr) {
			String str = String.valueOf(i);
			for (int j = 0; j < str.length(); j++) {
				int n = Character.getNumericValue(str.charAt(j));
				count[n]++;
			}
		}
		for (int i = 0; i < count.length; i++) {
			int a = count[i];
			if (max <= a) {
				max = a;
				output = i;
			}
		}
		System.out.println(output);
	}
}