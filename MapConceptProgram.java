package Assignments;

import java.util.HashMap;
import java.util.Map;

public class MapConceptProgram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<Integer,String> map1=new HashMap<Integer,String>();
		map1.put(1,"Arjun");
		map1.put(2, "Kaviya");
		map1.put(3, "Sara");
		System.out.println(map1);
		
		//traverse in any order
		for(Map.Entry m:map1.entrySet()) {
			//System.out.println(m);
			//System.out.println(m.getKey());
			
			
			System.out.println(m.getKey() + " " + m.getValue());
			
		}
		System.out.println(map1.entrySet());
		
		

	}

}
