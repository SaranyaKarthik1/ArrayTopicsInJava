package Assignments;

import java.util.Collection;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;


public class MapComparingByKey {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<String,Integer> maptwo=new HashMap<String,Integer>();
		maptwo.put("Anitha",101);
		maptwo.put("Brindha", 102);
		maptwo.put("Sara", 103);
		
		maptwo.entrySet();
		System.out.println(maptwo);
		
		//maptwo.get("101");
		//get function is not return the values search in hashmap.
		System.out.println(maptwo.get(101));
		System.out.println(maptwo.get(103));
		System.out.println(maptwo.get(104));
		//return the values if the get method key is used.
		System.out.println(maptwo.get("Anitha"));
		System.out.println(maptwo.get("Sara"));
		
		
		//keyset
		for(String i:maptwo.keySet()) {
			System.out.println(i);
			
		}
		
		//values
		for(Integer i:maptwo.values()) {
			System.out.println(i);
			
		}
		
		for(Map.Entry m:maptwo.entrySet()) {
		
		//Comparator.reverseOrder();
		
		System.out.println(m);
		}
		
		//maptwo.size();
		System.out.print(maptwo.size());
	

	}

}
