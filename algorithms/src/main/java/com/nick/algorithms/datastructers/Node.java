package com.nick.algorithms.datastructers;

import java.util.Hashtable;

import lombok.Data;

@Data
public class Node<T> {

	private Node<T> next;
	private T data;

	public Node(T data) {
		this.data = data;
	}

	public boolean deleteNode(Node<T> node) {
		if (node == null || node.next == null) {
			return false;
		}
		Node<T> next = node.next;
		node.data = next.data;
		node.setNext(next);

		return true;
	}

	public void appendToTail(T data) {
		Node<T> end = new Node<>(data);
		Node<T> me = this;

		// loop through all of the link list "next" nodes until we are at the last one
		while (me.next != null) {
			me = me.next;
		}
		// now that "me" is the end, add the new node to my "next" as that will be the
		// end of the linked list
		me.next = end;
	}

	public void deleteDuplicates(Node<T> n) {
		Hashtable<T, Boolean> table = new Hashtable<>();
		Node<T> previous = null;
		while (n != null) {
			if (table.containsKey(n.data)) {
				// duplicate node, skip
				previous.next = n.next;
			} else {
				table.put(n.data, true);
				previous = n;
			}
			n = n.next;
		}
	}
}
