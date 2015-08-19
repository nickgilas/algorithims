package com.nick.algorithms;

public class MergeSort {

	private Comparable[] auxArray;

	public void sort(Comparable[] array) {
		auxArray = new Comparable[array.length];
		sort(array, 0, array.length - 1);
	}

	private void sort(Comparable[] array, int lo, int hi) {
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

		// sort the right half (beginning one position to the right of the mid index
		sort(array, mid+1, hi);
		
		// merge the 2 halfs
		merge(array, lo, mid, hi);
	}

	private void merge(Comparable[] array, int lo, int mid, int hi) {
		System.out.println(String.format("Merge lo: %d mid: %d hi: %d", lo, mid, hi));
		
		// Merge a[lo..mid] with a[mid+1..hi].
		int lowIndex = lo;
		int midIndex = mid + 1;

		// Copy array[lo..hi] to auxArray[lo..hi].
		System.out.println("Populating auxArray");
		for (int i = lo; i <= hi; i++) {
			System.out.println(array[i]);
			auxArray[i] = array[i];
		}

		// Merge back to array[lo..hi].
		for (int k = lo; k <= hi; k++) {
			if (lowIndex > mid) {
				array[k] = auxArray[midIndex++];
			} else if (midIndex > hi) {
				array[k] = auxArray[lowIndex++];
			} else if (less(auxArray[midIndex], auxArray[lowIndex])) {
				array[k] = auxArray[midIndex++];
			} else {
				array[k] = auxArray[lowIndex++];
			}
		}
	}

	private boolean less(Comparable a, Comparable b) {
		return a.compareTo(b) < 0;
	}

	private static void exch(Comparable[] a, int i, int j) {
		Comparable t = a[i];
		a[i] = a[j];
		a[j] = t;
	}
	
	public static void main(String[] args) {
		MergeSort sort = new MergeSort();
		Comparable[] array = new Comparable[] {"t", "h", "i", "s", "i", "s", "m", "e"};
		// e, h, i, i, m, s, s, t
		
		sort.sort(array);
		System.out.println("Sorted Array values");
		for (int i = 0; i <= array.length -1; i++) {
			System.out.println(array[i]);
		}
	}
}
