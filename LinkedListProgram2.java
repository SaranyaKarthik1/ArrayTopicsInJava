package Assignments;

import java.util.LinkedList;

public class LinkedListProgram2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		LinkedList ll=new LinkedList();
		ll.add(10);
		ll.add(20);
		ll.add(30);
		ll.add(40);
		System.out.println(ll);
		ll.addFirst(200);
		System.out.println(ll);
		//poll-removes the first element.
		System.out.println("After poll "+ll.poll());
		System.out.println(ll);
		
		ll.offerFirst(500);
		System.out.println(ll);
		
		//clone method
		LinkedList ll2= (LinkedList)ll.clone();
		System.out.println("The clone in linked list are " +ll2);
		 
		//clear method
		ll2.clear();
		System.out.println("The clear method "+ll2);
		
	}

}
