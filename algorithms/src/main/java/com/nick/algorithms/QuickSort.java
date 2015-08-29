package com.nick.algorithms;

public class QuickSort {

	@SuppressWarnings("unchecked")
	public static void main(String[] args) {
		// Comparable<Integer>[] array = new Comparable[] { 12, 33, 2, 6, 9, 8,
		// 20, 2 };
		Comparable<String>[] array = new Comparable[] { "N", "I", "C", "K", "G", "I", "L", "A", "S" };
		QuickSort quickSort = new QuickSort();
		quickSort.sort(array);
		SortUtils.print(array);
	}

	@SuppressWarnings("rawtypes")
	private void quickSort(Comparable[] array, int left, int right) {
		// left and right scan indices
		Comparable pivot = array[left + (right - left) / 2];
		System.out.println("Using pivot point: " + pivot);

		int i = left, j = right;
		while (i < j) {

			// find the next value larger then the pivot on the left side of the
			// array
			while (SortUtils.less(array[i], pivot)) {
				i++;
			}
			// find the next value lower then the pivot on the right side of the
			// array
			while (SortUtils.less(pivot, array[j])) {
				j--;
			}

			if (i <= j) {
				SortUtils.swap(array, i, j);
				i++;
				j--;
			}
		}

		if (left < j) {
			quickSort(array, left, j);
		}
		if (i < right) {
			quickSort(array, i, right);
		}

	}

	@SuppressWarnings("rawtypes")
	public void sort(Comparable[] array) {
		if (array == null || array.length == 0)
			return;
		quickSort(array, 0, array.length - 1);

	}

}
