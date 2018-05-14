package com.nick.algorithms.sorting;

import com.nick.algorithms.BaseSort;

public class SelectionSort extends BaseSort implements Sorter {

	@SuppressWarnings({ "rawtypes", "unchecked" })
	@Override
	public void sort(Comparable[] array) {

		for (int lastUnsortedIndex = array.length - 1; lastUnsortedIndex >0; lastUnsortedIndex--) {
			
			int largestValIndex = 0;
			for (int idx2 = 0; idx2 <= lastUnsortedIndex; idx2++) {
				
				// is the value of this index greater then the next index value?
				if (array[idx2].compareTo(array[largestValIndex]) > 0) {
					largestValIndex = idx2;
					System.out.println("Largerest index: " + idx2 + "[" + array[idx2] + "]");
				}
			}
			
			getSortUtils().swap(array, largestValIndex, lastUnsortedIndex);
			getSortUtils().print(array);
			
		}
	}

}
