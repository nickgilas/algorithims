package com.nick.algorithms;

public class SortUtils {

	@SuppressWarnings("rawtypes")
	public static boolean isSorted(Comparable[] a) { // Test whether the array
		// entries are in order.
		for (int i = 1; i < a.length; i++) {
			if (less(a[i], a[i - 1])) {
				return false;
			}
		}
		return true;
	}

	@SuppressWarnings({ "rawtypes", "unchecked" })
	public static boolean less(Comparable v, Comparable w) {
		return v.compareTo(w) < 0;
	}

	@SuppressWarnings("rawtypes")
	public static void print(Comparable[] a) { // Print the array, on a single
		StringBuilder b = new StringBuilder();
		for (int i = 0; i < a.length; i++)
			b.append(a[i] + ", ");
		System.out.println(b.toString().substring(0, b.length() - 2));
	}

	@SuppressWarnings("rawtypes")
	public static void sort(Comparable[] a) { // Sort a[] into increasing order.
		int arrayLength = a.length;
		for (int outerIndex = 1; outerIndex < arrayLength; outerIndex++) {
			for (int innerIndex = outerIndex; innerIndex > 0 && less(a[innerIndex], a[innerIndex - 1]); innerIndex--)
				swap(a, innerIndex, innerIndex - 1);
		}
	}

	@SuppressWarnings("rawtypes")
	public static void swap(Comparable[] a, int first, int second) {
		System.out.println("Swapping: " + a[first] + " with: " + a[second]);
		Comparable t = a[first];
		a[first] = a[second];
		a[second] = t;
	}

}
