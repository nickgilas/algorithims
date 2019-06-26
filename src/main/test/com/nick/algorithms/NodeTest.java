package com.nick.algorithms;

import static org.junit.jupiter.api.Assertions.assertTrue;

import com.nick.algorithms.datastructers.Node;
import org.junit.jupiter.api.Test;

public class NodeTest {

	@Test
	public void testDeleteDuplicates() {
		Node head = new Node(1);
		Node next = new Node(2);
		head.setNext(next);
		next.setNext(new Node(2));

		head.deleteDuplicates(head);
		assertTrue(head.getNext().getData().equals(2));
		assertTrue(head.getNext().getNext() == null);

	}

	@Test
	public void testDeleteMiddleNode() {
		Node a = new Node(1);
		Node b = new Node(2);
		a.setNext(b);
		Node c = new Node(3);
		b.setNext(c);
		Node d = new Node(4);
		c.setNext(d);

		assertTrue(c.deleteNode(c));
	}
}
