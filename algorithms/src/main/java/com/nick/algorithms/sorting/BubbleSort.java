package com.nick.algorithms.sorting;

import com.nick.algorithms.BaseSort;
import com.nick.algorithms.SortUtils;

public class BubbleSort extends BaseSort implements Sorter {

	private final SortUtils sortUtils = getSortUtils();

	@SuppressWarnings("unchecked")
	@Override
	public void sort(Comparable[] array) {

		// loop the whole array once from beginning to end
		for (int lastUnsortedIndex = array.length - 1; lastUnsortedIndex > 0; lastUnsortedIndex--) {
			
			for (int index = 0; index < lastUnsortedIndex; index++) {
				
				// swap for current item with next item if value greater than next value
				if (array[index].compareTo(array[index +1]) >  0) {
					getSortUtils().swap(array, index, index + 1);
				}
				
			}
		}
	}
}
