package com.nick.algorithms;

public class SortRunner {

	public static void main(String[] args) {
//		BaseSort sort = new MergeSortTopDown();
		BaseSort sort = new MergeSortBottomUp();
		Comparable[] array = new Comparable[] { "t", "h", "i", "s", "i", "s", "m", "e" };
		// e, h, i, i, m, s, s, t

		sort.sort(array);
		System.out.println("Sorted Array values");
		for (int i = 0; i <= array.length - 1; i++) {
			System.out.println(array[i]);
		}
	}
}
