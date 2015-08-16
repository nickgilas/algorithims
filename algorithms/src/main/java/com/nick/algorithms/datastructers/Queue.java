package com.nick.algorithms.datastructers;

import java.util.Iterator;
import java.util.Scanner;

/**
 * First in first out (FIFO) queue backed by a doubly linked list
 */
public class Queue<T> implements Iterable<T> {

	private class Node {
		T item;
		Node next;

		@Override
		public String toString() {
			return item.toString();
		}
	}

	public static void main(String[] args) {
		Queue<String> q = new Queue<String>();
		// read values from input
		try (Scanner scanner = new Scanner(System.in)) {

			// TODO - profile the difference in number of objects/memory usage
			// by having the "item's" scope within and outside of the loop
			// String item = null;

			while (scanner.hasNext()) {
				String item = scanner.nextLine();
				System.out.println("Processing: " + item);
				if (!item.equals("-")) {
					q.enqueue(item);
				} else if (!q.isEmpty()) {
					System.out.println(q.dequeue() + " ");
				}
			}
			System.out.println("(" + q.size() + " left on queue)");
		}
	}

	private Node newestNode; // link to the newest/first added node

	private int nodeCount = 0;

	private Node oldestNode; // link to oldest/last node in the links

	/**
	 * Removes the oldest item in the queue
	 * 
	 * @return
	 */
	public T dequeue() {
		// Remove the item from the beginning (oldest) node of the list
		T item = oldestNode.item;
		System.out.println("Removing oldes item: " + item);
		// replace the last/oldest node with his own next, moves up in the queue
		// by one position
		oldestNode = oldestNode.next;

		// do we have an empty list?
		if (isEmpty()) {
			System.out.println("Empty list detected");
			// yes, null out the newest since there is nothing left
			newestNode = null;
		}

		nodeCount--;
		return item;
	}

	/**
	 * Adds the new item to the end of the queue
	 * 
	 * @param newItem
	 */
	public void enqueue(T newItem) {
		System.out.println("Putting new item: " + newItem + " on to the end of the queue");
		// Add item to the end of the list.

		// copy last node to update later
		Node previousOldestNode = newestNode;

		// create new node for the last node of the queue
		newestNode = new Node();
		newestNode.item = newItem;
		newestNode.next = null;

		if (isEmpty()) {
			oldestNode = newestNode;
		} else {
			// update the link of previous node to the newley create node
			previousOldestNode.next = newestNode;
		}

		nodeCount++;
	}

	public boolean isEmpty() {
		return nodeCount == 0;
	}

	@Override
	public Iterator<T> iterator() {
		return null;
	}

	public int size() {
		return nodeCount;
	}

}
