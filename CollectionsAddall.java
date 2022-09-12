package Assignments;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CollectionsAddall {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<String> str = new ArrayList<String>();
		ArrayList<String> str2 = new ArrayList<String>();
		str.add("Pooja");
		str.add("Ajay");
		System.out.println("Before array " + str);

		boolean b = Collections.addAll(str, "1", "2", "3");
		System.out.println("The added array " + str);

		// String s=Collections.addAll(str,"Saranya");
		System.out.println("The added array " + str);
		System.out.println("The added array " + b);

		str2.addAll(str);
		System.out.println("The added array " + str2);

		System.out.println("The size of the array " + str.size());// displays the size of the arraylist.
		//Adding the elements
		str.add(3, "Arun");
		System.out.println(str);
		
		//checking the element using "ontains".Containing the element
		System.out.println(str.contains("Arun"));
		
		//get method
		System.out.println(str.get(0));
		
		//remove
		System.out.println(str.remove(0));
		System.out.println(str);
		
		//set
		System.out.print(str.set(2, "Krish"));
		System.out.println(str);
		
		//Index
		System.out.println("Index "+str.indexOf("Krish"));
		
		//new arraylist
		ArrayList l3=new ArrayList();
		l3.add("chennai");
		l3.add("Madurai");
		l3.add("Coimbatore");
		System.out.println(l3);
		l3.addAll(2,str);
		System.out.println(l3);
		
		//sublist
		List l4=l3.subList(0, 2);
		System.out.println(l4);
	}
}
