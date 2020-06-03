package com.tyss.dataS;

import java.util.LinkedList;
import java.util.Queue;

public class StackAsQueue {

	Queue<Integer> q1 = new LinkedList<Integer>();
	Queue<Integer> q2 = new LinkedList<Integer>();

	static int cur_size;

	public StackAsQueue() {
		cur_size = 0;
	}
	
	public void push(int x) {
		cur_size++;
		q2.add(x);
		
		while(!q1.isEmpty()) {
			q2.add(q1.peek());
			q1.remove();
		}
		 Queue<Integer> q = q1; 
         q1 = q2; 
         q2 = q;
	}
	
	public void pop() {
		 if (q1.isEmpty()) 
             return; 
         q1.remove(); 
         cur_size--; 
	}

	public int top() { 
        if (q1.isEmpty()) 
            return -1; 
        return q1.peek(); 
    } 

    static int size() 
    { 
        return cur_size; 
    } 
}
