package com.tyss.dataS;

public class StackAsQMain {

	public static void main(String[] args) {

		StackAsQueue st=new StackAsQueue();
		st.push(10);
		st.push(20);
		st.push(30);
		
		System.out.println(st.top());
		st.pop();
		
		System.out.println(st.top());
		st.pop();
		System.out.println(st.top());
	}

}
