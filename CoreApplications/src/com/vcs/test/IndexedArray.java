package com.vcs.test;

public class IndexedArray {

	public static int[] swapArray(int[] arr) {

		int[] numbers = arr;
		int src = 0;
		int dest = 4;
		int temp = numbers[src];
		numbers[src] = numbers[dest];
		numbers[dest] = temp;
		return numbers;
	}

	public static void main(String[] args) {

		int[] input = { 0, 1, 2, 3, 4, 5 };

		int[] result = swapArray(input);

		for (int i = 0; i < result.length; i++) {

			System.out.println(result[i]);
		}

	}
}
