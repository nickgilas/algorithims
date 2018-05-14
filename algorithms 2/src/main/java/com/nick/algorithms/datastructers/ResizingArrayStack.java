package com.nick.algorithms.datastructers;

import java.util.Iterator;

/**
 * Last in last out (LIFO) Stack: (newest element get popped out first) The
 * array size will always be in a constant factor of the stack size
 * <ul>
 * <li>
 * <b>Pros:</b> Time of index lookup and push/pop operations are independent of
 * the size of the array.</li>
 * <li>
 * </br> <b>Cons:</b> Older nodes in the stack may never be processed/removed.
 * Longer insertion times when the stack needs to be resized. The performance
 * will deteriorate at an exponential rate based on the size of the array when
 * resized as all nodes need to be copied to a new array.</li>
 * </ul>
 */
public class ResizingArrayStack<T> implements Iterable<T> {

	private class ReverseArrayIterator implements Iterator<T> {
		// LIFO - Newer elements get returned first and older ones last
		int i = index;

		@Override
		public boolean hasNext() {
			return i > 0;
		}

		@Override
		public T next() {
			return array[--i];
		}

	}

	// internal data structure attributes
	@SuppressWarnings("unchecked")
	private T[] array = (T[]) new Object[1];

	private int index = 0;

	public boolean isEmpty() {
		return index == 0;
	}

	@Override
	public Iterator<T> iterator() {
		return new ReverseArrayIterator();
	}

	/**
	 * Returns the node at the top of the stack
	 */
	public T pop() {

		T t = array[--index];
		array[index] = null; // remove references to avoid loitering

		// do we need to decrease the array size if there is only a quarter of
		// the array filled?
		if (index > 0 && index <= array.length / 4) {
			resize(array.length / 2);
		}

		return t;
	}

	/**
	 * Adds an item to the top of the stack
	 */
	public void push(T t) {
		// if we have hit the end of the array, double it size
		if (index == array.length) {
			resize(array.length * 2);
		}
		// increment the counter
		array[index++] = t;

	}

	/**
	 * Resizes the current array to the given max size and copies the existing
	 * elements into a new array.
	 */
	private void resize(int max) {
		// create new array with max size

		@SuppressWarnings("unchecked")
		T[] tmp = (T[]) new Object[max];
		for (int i = 0; i < index; i++) {
			tmp[i] = array[i];
		}
		array = tmp;
	}

	public int size() {
		return index;
	}

}
