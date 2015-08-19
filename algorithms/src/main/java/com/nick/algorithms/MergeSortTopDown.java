package com.nick.algorithms;

public class MergeSortTopDown extends BaseSort {

	@SuppressWarnings("rawtypes")
	@Override
	public void sort(Comparable[] array) {
		auxArray = new Comparable[array.length];
		sort(array, 0, array.length - 1);
	}

	@SuppressWarnings("rawtypes")
	void sort(Comparable[] array, int lo, int hi) {
		System.out.println(String.format("Sort: Lo: %d Hi: %d", lo, hi));
		// Sort array[lo..hi]
		if (hi <= lo) {
			// we have reached the left most index to process
			return;
		}
		// get the mid section of the array
		int mid = lo + (hi - lo) / 2;

		// sort the left half
		sort(array, lo, mid);

		// sort the right half (beginning one position to the right of the mid
		// index
		sort(array, mid + 1, hi);

		// merge the 2 halfs
		merge(array, lo, mid, hi);
	}
}
