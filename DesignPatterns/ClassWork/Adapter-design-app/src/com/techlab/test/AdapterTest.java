package com.techlab.test;

import com.techlab.IQueue;
import com.techlab.QueueAdapter;

public class AdapterTest {

	public static void main(String[] args) {
		IQueue<String> q = new QueueAdapter<String>();
		q.enqueue("ten");
		q.enqueue("twenty");
		q.enqueue("thirty");

		System.out.println("Count => " + q.count());// 3

		System.out.println("Dequeue " + q.dequeue());
		System.out.println("Dequeue " + q.dequeue());
		System.out.println("Count " + q.count());// 1

		q.enqueue("twenty");
		q.enqueue("thirty");

		System.out.println("Elements");
		for (String e : q) {
			System.out.println(e);
		}
	}

}
