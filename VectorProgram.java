package Assignments;

import java.util.Iterator;
import java.util.Vector;

public class VectorProgram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Vector<String> str=new Vector<String>();
		str.add("sara");
		str.add("Pooja");
		str.add("sara");
		System.out.println(str);
		Iterator<String> itr=str.iterator();
		while(itr.hasNext()){
			System.out.println(itr.next());  
		
			
		}
		
	}

}
