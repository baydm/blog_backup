package cn.yshye.adt;

import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.NoSuchElementException;

public class MyLinkedList<T> implements Iterable<T> {
	private int theSize;
	private int modCunt = 0;
	private Node<T> beginMarker;
	private Node<T> endMarker;

	public MyLinkedList() {
		clear();
	}

	public int size() {
		return theSize;
	}

	public boolean isEmpty() {
		return size() == 0;
	}

	public void add(T val) {
		addBefore(endMarker, val);
	}

	public void add(int index, T val) {
		addBefore(getNode(index), val);
	}

	public T get(int index) {
		return getNode(index).data;
	}

	public T set(int index, T val) {
		Node<T> pNode = getNode(index);
		T old = pNode.data;
		pNode.data = val;
		return old;
	}

	public T remove(int index) {
		return remove(getNode(index));
	}

	private void addBefore(Node<T> p, T val) {
		Node<T> newNode = new Node<T>(val, p.prev, p);
		newNode.prev.next = newNode;
		p.prev = newNode;
		theSize++;
		modCunt++;
	}

	private T remove(Node<T> p) {
		p.next.prev = p.prev;
		p.prev.next = p.next;
		theSize--;
		modCunt--;
		return p.data;
	}

	private Node<T> getNode(int index) {
		Node<T> pNode;
		if (index < 0 || index > size())
			throw new IndexOutOfBoundsException();
		if (index < size() / 2) {
			pNode = beginMarker.next;
			for (int i = 0; i < index; i++) {
				pNode = pNode.next;
			}
		} else {
			pNode = endMarker;
			for (int i = size(); i > index; i--) {
				pNode = pNode.prev;
			}

		}
		return pNode;
	}

	public void clear() {
		this.beginMarker = new Node<T>(null, null, null);
		this.endMarker = new Node<T>(null, beginMarker, null);
		beginMarker.next = endMarker;
		theSize = 0;
		modCunt++;
	}

	@Override
	public Iterator<T> iterator() {
		return new LinkedListIterator();
	}

	private static class Node<T> {
		public T data;
		public Node<T> prev;
		public Node<T> next;

		public Node(T data, Node<T> prev, Node<T> next) {
			this.data = data;
			this.prev = prev;
			this.next = next;
		}
	}

	private class LinkedListIterator implements Iterator<T> {

		private Node<T> current = beginMarker.next;
		private int expectedModCount = modCunt;
		private boolean okToRemove = false;

		@Override
		public boolean hasNext() {
			return current != endMarker;
		}

		@Override
		public T next() {
			if (modCunt != expectedModCount)
				throw new ConcurrentModificationException();
			if (!hasNext())
				throw new NoSuchElementException();
			T nextItem = current.data;
			current = current.next;
			okToRemove = true;
			return nextItem;
		}

		public void remove() {
			if (modCunt != expectedModCount)
				throw new ConcurrentModificationException();
			if (!okToRemove)
				throw new IllegalStateException();
			MyLinkedList.this.remove(current.prev);
			okToRemove = false;
			expectedModCount++;
		}

	}

}
