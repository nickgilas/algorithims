package com.nick.algorithms;

public abstract class BaseSort {

	@SuppressWarnings("rawtypes")
	Comparable[] auxArray;
	
	@SuppressWarnings("rawtypes")
	protected void merge(Comparable[] array, int lo, int mid, int hi) {
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
	
	@SuppressWarnings("rawtypes")
	protected static void exch(Comparable[] a, int i, int j) {
		Comparable t = a[i];
		a[i] = a[j];
		a[j] = t;
	}

	@SuppressWarnings("rawtypes")
	public abstract void sort(Comparable[] array);

	

	@SuppressWarnings({ "rawtypes", "unchecked" })
	protected boolean less(Comparable a, Comparable b) {
		return a.compareTo(b) < 0;
	}

	public BaseSort() {
		super();
	}

}