package com.nick.algorithms.datastructers;

public class Node2<T> {

	private Node2 next;
	private T data;

	public Node2(T data) {
		this.data = data;
	}

	public void add(T data) {
		// get a reference to this
		Node2<T> n = this;

		// create new node
		Node2<T> newNode = new Node2<>(data);

		// find the last node in the list
		while (n != null) {
			n = n.next;
		}
		n.next = newNode;

	}
}
