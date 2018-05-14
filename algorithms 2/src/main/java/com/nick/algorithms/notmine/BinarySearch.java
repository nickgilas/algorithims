package com.nick.algorithms.notmine;

public class BinarySearch {

    public static int rank(int key, int[] a) {
        int lo = 0;
        int hi = a.length - 1;
        while (lo <= hi) {
            // Key is in a[lo..hi] or not present.
            int mid = lo + (hi - lo) / 2; // find the middle
            
            if (key < a[mid])  {
            	hi = mid - 1; // trim array to less then mid index
            } else if (key > a[mid]) {
            	lo = mid + 1; // trim array to greater then mid index
            } else {
            	// match
            	return mid;
            }
        }
        // no match
        return -1;
    }
    
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
