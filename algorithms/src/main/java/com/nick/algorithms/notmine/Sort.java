package com.nick.algorithms.notmine;
public class Sort {

	@SuppressWarnings({ "rawtypes", "unchecked" })
	private static boolean less(Comparable v, Comparable w) {
		return v.compareTo(w) < 0;
	}

	@SuppressWarnings("rawtypes")
	private static void swap(Comparable[] a, int first, int second) {
		Comparable t = a[first];
		a[first] = a[second];
		a[second] = t;
	}

	@SuppressWarnings({ "unused", "rawtypes" })
	private static void show(Comparable[] a) { // Print the array, on a single
												// line.
		for (int i = 0; i < a.length; i++)
			System.out.println(a[i] + " ");
		System.out.println();
	}

	@SuppressWarnings("rawtypes")
	public static boolean isSorted(Comparable[] a) { // Test whether the array
														// entries are in order.
		for (int i = 1; i < a.length; i++)
			if (less(a[i], a[i - 1]))
				return false;
		return true;
	}

	public static void selectionSort(Comparable[] a) { // Sort a[] into
														// increasing order.
		int N = a.length; // array length
		for (int i = 0; i < N; i++) { // Exchange a[i] with smallest entry in
										// a[i+1...N).
			int min = i; // index of minimal entr.
			for (int j = i + 1; j < N; j++)
				if (less(a[j], a[min]))
					min = j;
			swap(a, i, min);
		}
	}

	@SuppressWarnings("rawtypes")
	public static void sort(Comparable[] a) { // Sort a[] into increasing order.
		int arrayLength = a.length;
		for (int outterIndex = 1; outterIndex < arrayLength; outterIndex++) { 
			for (int innerIndex = outterIndex; innerIndex > 0
					&& less(a[innerIndex], a[innerIndex - 1]); innerIndex--)
				swap(a, innerIndex, innerIndex - 1);
		}
	}

	public static void main(String[] args) {

	}

}
