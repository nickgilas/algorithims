package com.nick.algorithms;

public abstract class UnionFind {

	private int count; // number of components
	private int[] id; // indexed sites

	public UnionFind(int max) {
		count = max;
		id = new int[max];
		for (int i = 0; i < max; i++) {
			id[i] = i;
		}
	}

	public boolean connected(int p, int q) {
		return find(p) == find(q);
	}

	public int count() {
		return count;
	}

	public abstract int find(int p);

	public abstract void union(int p, int q);
}
