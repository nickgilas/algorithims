package com.nick.algorithms.sorting;

public class CountingSort {

	public static void main(String[] args) {
		
		int[] input = new int[] {2,5,9,8,2,3,10};
		
		countingSort(input, 2, 10);
		
		print(input);
	}

	private static void print(int[] input) {
		System.out.println();
		System.out.print("[");
		for (int i = 0; i < input.length; i++) {
			System.out.print(input[i]);
			if (i + 1 < input.length) {
				 System.out.print( ", "); 
			}
		}
		System.out.print("]");
	}
	
	public static void countingSort(int[] input, int min, int max) {
		
		int[] countArray = new int[(max - min) + 1];
		
		for (int i = 0; i < input.length; i++) {
			countArray[input[i] - min]++;
			print(countArray);
		}
		
		int j = 0;
		for (int i = min; i <= max; i++) {
			while (countArray[i - min] > 0) {
				input[j++] = i;
				countArray[i - min]--;
				print(input);
			}
		}
	}
}
