package com.techlab;

import java.util.Iterator;
import java.util.LinkedList;

public class QueueAdapter<T> implements IQueue<T>, Iterable<T> {
	private LinkedList<T> queue;

	public QueueAdapter() {
		this.queue = new LinkedList<T>();
	}

	@Override
	public void enqueue(T item) {
		queue.add(item);
	}

	@Override
	public T dequeue() {
		return queue.remove();
	}

	@Override
	public int count() {
		return queue.size();
	}

	@Override
	public Iterator<T> iterator() {
		return queue.iterator();
	}

}
