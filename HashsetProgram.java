package Assignments;

import java.util.HashSet;

public class HashsetProgram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		HashSet<String> name=new HashSet<String> ();
		name.add("AjayKrish");
		name.add("Siva");
		name.add("Shiva");
		name.add("AjayKrish");
		System.out.println(name);
		
		//contains-checking the element.
		System.out.println(name.contains("siva"));
		
		System.out.println(name.contains("Shiva"));
		
		for(String i:name) {
			System.out.println(i);
		}
		
	}

}
