package com.nick.algorithms.sorting.challenges;

import java.util.Arrays;
import java.util.Collections;

public class BinarySearch {

	public static void main(String[] args) {
		Integer array[] = {-5, 1,2,3,10, 20};
		
//		Collections.sort(Arrays.asList(array));
		
		BinarySearch search = new BinarySearch();
		System.out.println("Found index: " + search.search(array, 0, array.length, -5));
	}
	
	public int search(Integer[] array, int start, int end, int value) {
		
		// split in half
		int mid = start + end / 2;
		
		if (value == array[mid]) {
			return mid;
		} else if (value > array[mid]) {
			// search right half of array
			return search(array, mid + 1, array.length, value);
		} else {
			// search left half of array
			return search(array, 0, mid + 1, value);
		}
		
	}
	
}
