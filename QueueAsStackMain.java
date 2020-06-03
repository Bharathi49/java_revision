package com.tyss.dataS;

public class QueueAsStackMain {

	public static void main(String[] args) {

		QueueAsStack ds=new QueueAsStack();
		ds.enQueue(10);
		ds.enQueue(20);
		ds.enQueue(30);
		System.out.println(ds.deQueue());
	}

}
