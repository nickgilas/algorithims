package com.nick.algorithms.notmine;
import java.util.Iterator;
import java.util.ListIterator;

public class Stack<T> implements Iterable<T> {

	// default size
	private Node first;
	private int numOfNodes;

	@Override
	public Iterator<T> iterator() {
		return new ListIterator<T>() {
			
			private Node current = first;
						
			@Override
			public boolean hasNext() {
				return current != null;
			}

			@Override
			public T next() {
				// pop the next item off the list and
				// move move previous Node to first
				final T t = current.item;
				final Node newNext = current.next;
				if (isEmpty()) {
					current = null;
				} else {
					current = newNext;
				}
				return t;
			}

			@Override
			public void remove() {
				current = current.next;
				current = null;
			}

			@Override
			public void add(T e) {
				current = current.next;
				current.item = e;
				numOfNodes++;
			}

			@Override
			public boolean hasPrevious() {
				// TODO Auto-generated method stub
				return false;
			}

			@Override
			public T previous() {
				// TODO Auto-generated method stub
				return null;
			}

			@Override
			public int nextIndex() {
				// TODO Auto-generated method stub
				return 0;
			}

			@Override
			public int previousIndex() {
				// TODO Auto-generated method stub
				return 0;
			}

			@Override
			public void set(T e) {
				// TODO Auto-generated method stub
				
			}
		};
	}
 
	public boolean isEmpty() {
		return numOfNodes == 0;
	}
	
	public int size() {
		return numOfNodes;
	}
	
	public T pop() {
		final Node current = first;
		// first become the next node
		first = first.next;
		if (isEmpty()) {
			first = null;
		}
		numOfNodes--;
		return current.item;
	}
	public void push(T t) {
		final Node oldFirst = first;
		first = new Node();
		first.next = oldFirst;
		first.item = t;
		numOfNodes++;
	}
	private class Node {
		T item;
		Node next;		
	}
	
	public void printIterator(Iterator<T> t) {
		
		while (t.hasNext()) {
			System.out.println(t.next());
		}
		
	}
	
	public String toString() {
		return first.item.toString();
	}
	
	public static void main(String[] args) {
		Stack<String> stack = new Stack<>();
		stack.push("1");
		stack.push("2");
		stack.push("3");
//		while (stack.numOfNodes > 0) {
//			
//			System.out.println();
//		}
		stack.printIterator(stack.iterator());
		System.err.println("---------------");
		stack.pop();
		final Stack<String> newStack = stack;
		stack.printIterator(newStack.iterator());
		System.err.println("---------------");
		stack.pop();
		stack.printIterator(stack.iterator());
		
	}

}