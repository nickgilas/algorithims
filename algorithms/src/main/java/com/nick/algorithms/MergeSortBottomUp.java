package com.nick.algorithms;

public class MergeSortBottomUp extends BaseSort {

	@SuppressWarnings("rawtypes")
	@Override
	public void sort(Comparable[] array) {
		int arrayLength = array.length;
		auxArray = new Comparable[arrayLength];
		
		for (int subArraySize = 1; subArraySize < arrayLength; subArraySize = subArraySize+subArraySize) {
			System.out.println("subArraySize: " + subArraySize);
			
			for (int lo = 0; lo < arrayLength - subArraySize; lo += subArraySize+subArraySize) {
				merge(array, lo, lo+subArraySize-1, Math.min(lo+subArraySize+subArraySize-1, arrayLength-1));
			}
		}
	}

}
