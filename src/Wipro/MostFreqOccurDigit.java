package Wipro;

public class MostFreqOccurDigit {
    public static void main(String[] args) {
        int[] input1 = {1237, 202, 666, 140}; //6
        //int input2 = input1.length;

        int output=0;
		int[] arr = new int[10];
		int max=0;
		for (int k : input1) {
			String str = String.valueOf(k);
			for (int j = 0; j < str.length(); j++) {
				int n = Character.getNumericValue(str.charAt(j));
				arr[n] += 1;
			}
		}
		for(int i=0; i<arr.length; i++){
			int a = arr[i];
			if(max<=a){
				max=a;
				output = i;
			}
		}
		System.out.println(output);
    }
}