package com.tyss.dataS;

import java.util.Stack;

public class QueueAsStack {

	static Stack<Integer> s1 = new Stack<Integer>();
	static Stack<Integer> s2 = new Stack<Integer>();

	public void enQueue(int x) {
		while (!s1.isEmpty()) {
			s2.push(s1.pop());
		}

		s1.push(x);

		while (!s2.isEmpty()) {
			s1.push(s2.pop());
		}
	}

	// Dequeue an item from the queue
	public int deQueue() {
		// if first stack is empty
		if (s1.isEmpty()) {
			System.out.println("Q is Empty");
			System.exit(0);
		}

		// Return top of s1
		int x = s1.peek();
		s1.pop();
		return x;
	}
}
