package com.nick.algorithms.datastructers;

import java.util.EmptyStackException;

public class SimpleStack<T> {

	private Node<T> top;
	private int size;

	public T pop() {
		if (isEmpty()) {
			throw new EmptyStackException();
		}
		T lastData = top.getData();
		size--;
		removeLastItem();
		return lastData;
	}

	private void removeLastItem() {
		Node<T> newLastItem = top.getNext();
		// check to see if the element is the last item in the stack
		if (newLastItem == null) {
			top = null;
		} else {
			top = top.getNext();
		}
	}

	public boolean isEmpty() {
		return top == null;
	}

	public void push(T item) {
		Node<T> newNode = new Node<T>(item);
		if (top == null) {
			top = newNode;
		} else {

		}
	}

	private void addToEmptyStack(T data) {
		top = new Node<T>(data);
	}
}
