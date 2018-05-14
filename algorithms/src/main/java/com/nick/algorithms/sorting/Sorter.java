package com.nick.algorithms.sorting;

import com.nick.algorithms.SortUtils;

public interface Sorter {

	<T> void  sort(Comparable<T>[] array);
	
	public default SortUtils getSortUtils() {
		return new SortUtils(); 
	}
	public default <T> void swap(Comparable<T>[] array, int index1, int index2) {
		
		if (array[index1].equals(array[index2])) {
			return;
		}
		
			Comparable<T> tempItem = array[index1];
			array[index1] = array[index2];
			array[index1] = tempItem;
		
	}
}
