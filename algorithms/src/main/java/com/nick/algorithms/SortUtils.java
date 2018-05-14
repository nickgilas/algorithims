package com.nick.algorithms;

public class SortUtils {

	
	public SortUtils getInstance() {
		return this; 
	}
	
	@SuppressWarnings("rawtypes")
<<<<<<< HEAD
	public boolean isSorted(Comparable[] a) { 
		
		for (int i = 1; i < a.length; i++)
			if (lessThan(a[i], a[i - 1]))
=======
	public static boolean isSorted(Comparable[] a) { // Test whether the array
		// entries are in order.
		for (int i = 1; i < a.length; i++) {
			if (less(a[i], a[i - 1])) {
>>>>>>> branch 'master' of https://github.com/nickgilas/algorithms.git
				return false;
			}
		}
		return true;
	}

	@SuppressWarnings({ "rawtypes", "unchecked" })
	public boolean lessThan(Comparable v, Comparable w) {
		
		return v.compareTo(w) < 0;
	}

	@SuppressWarnings("rawtypes")
	public void print(Comparable[] array, int start, int end) {
		StringBuilder b = new StringBuilder();
		for (int i = start; i < end; i++) {
			b.append(array[i] + ", ");
		}
		
		System.out.println(b.toString().substring(0, b.length() - 2));
	}
	
	@SuppressWarnings("rawtypes")
	public void print(Comparable[] a) { 
		
		StringBuilder b = new StringBuilder();
		for (int i = 0; i < a.length; i++) {
			b.append(a[i] + ", ");
		}
		
		System.out.println(b.toString().substring(0, b.length() - 2));
	}

	@SuppressWarnings("rawtypes")
	public void sortAsc(Comparable[] a) { // Sort a[] into increasing order.
		
		int arrayLength = a.length;
<<<<<<< HEAD
		for (int outterIndex = 1; outterIndex < arrayLength; outterIndex++) {
			for (int innerIndex = outterIndex; innerIndex > 0 && lessThan(a[innerIndex], a[innerIndex - 1]); innerIndex--)
=======
		for (int outerIndex = 1; outerIndex < arrayLength; outerIndex++) {
			for (int innerIndex = outerIndex; innerIndex > 0 && less(a[innerIndex], a[innerIndex - 1]); innerIndex--)
>>>>>>> branch 'master' of https://github.com/nickgilas/algorithms.git
				swap(a, innerIndex, innerIndex - 1);
		}
	}

	@SuppressWarnings("rawtypes")
	public void swap(Comparable[] a, int first, int second) {
		
		System.out.println("Swapping: " + a[first] + " with: " + a[second]);
		Comparable t = a[first];
		a[first] = a[second];
		a[second] = t;
	}

}
