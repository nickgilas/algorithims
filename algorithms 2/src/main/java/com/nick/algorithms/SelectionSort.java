package com.nick.algorithms;

public class SelectionSort<T> {

	@SuppressWarnings("unchecked")
	public static void main(String[] args) {
		Comparable<Integer>[] array = new Comparable[] { 12, 33, 2, 6, 9, 8, 20, 2 };
		SelectionSort.sort(array);
		SortUtils.print(array);
	}

	@SuppressWarnings("rawtypes")
	public static void sort(Comparable[] array) {

		for (int i = 0; i <= array.length - 1; i++) {
			// find out where the smallest values is and swap with the i index
			int smallestIndex = i;
			System.out.println("Finding value smaller then: " + array[smallestIndex]);
			for (int j = i + 1; j <= array.length - 1; j++) {
				// is the current value smaller then the smallestVal?
				System.out.println("Comparing: " + array[smallestIndex] + " == " + array[j]);
				if (SortUtils.less(array[j], array[smallestIndex])) {
					System.out.println(array[j] + " is smaller then " + array[smallestIndex]);
					// yes, found a smaller value, update smallestIndex
					smallestIndex = j;
				} else {
					System.out.println("Not less then");
				}
			}
			// by here we have found the smallest index value
			SortUtils.swap(array, i, smallestIndex);
		}

	}
}
