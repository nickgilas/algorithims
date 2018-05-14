package com.nick.algorithms;
import com.nick.algorithms.sorting.MergeSort;

public class SortRunner {
	public static final SortUtils sortUtils = new SortUtils();
	
	public static void main(String[] args) {
//		BaseSort sort = new MergeSortTopDown();
		BaseSort sort = new MergeSort();
//		Comparable[] array = new Comparable[] { "t", "h", "i", "s", "i", "s", "m", "e" };
		// e, h, i, i, m, s, s, t
//		Comparable<Integer>[] array = new Comparable[] { 12, 33, 2, 6, -1, 8, 20, 2 };
		
		Comparable<Integer>[] array = new Comparable[] { 2, 1, 5, 4, 3, 6};
		
		sortUtils.print(array);
		sort.sort(array);
		System.out.println("Is sorted:  " + sortUtils.isSorted(array));
		sortUtils.print(array);

	}
}
