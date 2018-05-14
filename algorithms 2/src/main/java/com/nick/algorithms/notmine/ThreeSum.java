package com.nick.algorithms.notmine;

public class ThreeSum {

	public static void printAll(int[] a) {
		int N = a.length;
		for (int i = 0; i < N; i++) {
			for (int j = i + 1; j < N; j++) {
				for (int k = j + 1; k < N; k++) {
					if (a[i] + a[j] + a[k] == 0) {
						System.out.println(a[i] + " " + a[j] + " " + a[k]);
					}
				}
			}
		}
	}

	public static int count(int[] a) {
		int N = a.length;
		int cnt = 0;
		for (int i = 0; i < N; i++) {
			for (int j = i + 1; j < N; j++) {
				for (int k = j + 1; k < N; k++) {
					if (a[i] + a[j] + a[k] == 0) {
						cnt++;
					}
				}
			}
		}
		return cnt;
	}

	public static void main(String[] args) {

//		StopWatch timer = new StopWatch();
		// int cnt = count(a);
		// StdOut.println("elapsed time = " + timer.elapsedTime());
		// StdOut.println(cnt);
	}
}
