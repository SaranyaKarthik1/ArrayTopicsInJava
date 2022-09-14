package Assignments;

import java.util.HashSet;

public class HashprogramLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		HashSet<Integer> value=new HashSet<Integer>();
		
		value.add(1);
		value.add(2);
		value.add(3);
		
		for(int i=0;i<=10;i++) {
			if(value.contains(i)) {
				System.out.println(i+ " was found in the set");
			}
				else {
					System.out.println(i+" was not found in the set");
				
			}
		}
	}
}

	

