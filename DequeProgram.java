package Assignments;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Iterator;

public class DequeProgram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Deque class
Deque<String> dd=new ArrayDeque<String>();
dd.add("Pooja");
dd.add("Ajay");
dd.add("123");

	System.out.println(dd);
	for(String str:dd) {
		System.out.println(str);
		
	}
	Iterator<String> itr=dd.iterator(); 
	while(itr.hasNext()) {
		System.out.println("The iterators are "+itr.next());
		
	}
}

}
