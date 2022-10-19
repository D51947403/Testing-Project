package singraul.basic.logic;

import java.util.Arrays;

public class MaxInArray {

	public static void main(String[] args) {

		int[] arr = { 10, 30, 22, 127, 3, 15 };

		System.out.println(getMin(arr));
		System.out.println(getMax(arr));
		System.out.println(getMaxAlternate(arr));
	}

	private static int getMin(int[] arr) {

		return Arrays.stream(arr).min().getAsInt();
	}

	public static int getMax(int[] arr) {

		return Arrays.stream(arr).max().getAsInt();
	}

	public static int getMaxAlternate(int[] arr) {
		Arrays.sort(arr);
		return arr[arr.length - 1];
	}
}
