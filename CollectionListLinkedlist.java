package Assignments;

import java.util.Iterator;
import java.util.LinkedList;

public class CollectionListLinkedlist {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		LinkedList<Integer> num=new LinkedList<Integer>();
		LinkedList<String> str=new LinkedList<String>();
		num.add(101);
		num.add(102);
		num.add(103);
		Iterator<Integer> itr=num.iterator();//Traversing list through iterator.
		while(itr.hasNext()) {
			System.out.println(itr.next());//next()-print the next elements.
		
		}
		str.add("Pooja");
		
		Iterator<String> itr1=str.iterator();
		while(itr1.hasNext()) {
			System.out.print(itr1.next());
		}
	}

}
