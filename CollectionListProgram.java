package Assignments;

import java.util.ArrayList;
import java.util.Iterator;

public class CollectionListProgram {

	public static void main(String[] args) {
		// TODO Auto-generated method
		ArrayList<String> str=new ArrayList<String>();//creating arraylist
		str.add("saranya");
		str.add("Maheswari");
		str.add("yogesh");
		str.add("Lokesh");
		Iterator itr=str.iterator();
		while(itr.hasNext()) {
		System.out.println(itr.next());
		
		
		
	}

}
}