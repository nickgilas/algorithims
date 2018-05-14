package com.nick.algorithms.sorting;

import java.util.Arrays;

import com.nick.algorithms.BaseSort;

public class MergeSort extends BaseSort implements Sorter{

	@SuppressWarnings("rawtypes")
	@Override
	public void sort(Comparable[] array) {
		
		mergeSort(array, 0, array.length);

	}

	@SuppressWarnings("rawtypes")
	protected void mergeSort(Comparable[] array, int start, int end) {
		

		getSortUtils().print(array, start, end);
		
		// one element array, time to return
		if (end - start < 2) {
			return;
		}
		
		// partition the incoming array in half and search left and right partitions
		int mid = start + end / 2;
		
		mergeSort(array, start, mid);
		mergeSort(array, mid, end);
		mergeEr(array, start, mid, end);
	}
	
	@SuppressWarnings({ "unchecked", "rawtypes" })
	/**
	 * Left and right partitions should be sorted
	 */
	public <T extends Comparable> void mergeEr(Comparable[] array, int start, int mid, int end) {

		// If the left and right arrays are already sorted, nothing to do
		if (array[mid - 1].compareTo(array[mid]) <=0 ) {
			return;
		}
		
		int leftIndex = start;
		int rightIndex = mid;
		int tempIndex = 0;
		
		T[] tempArray = (T[]) new Comparable[end - start];
		
		while (leftIndex < mid && rightIndex < end) {
			
			// copy the smallest value in the temp array
			Comparable tmpValue;
			if (array[leftIndex].compareTo(array[rightIndex])  <= 0) {
				tmpValue = (Comparable) array[leftIndex++]; 
			} else {
				tmpValue = (Comparable) array[rightIndex++];
			}
			tempArray[tempIndex++] = (T) tmpValue;
			
			System.arraycopy(array, leftIndex, array, start + tempIndex, mid - leftIndex);
			System.arraycopy(tempArray, 0, array, start, tempIndex);
			getSortUtils().print(tempArray);
		}
		
		// handle the remaining elements 
	}

	
}
