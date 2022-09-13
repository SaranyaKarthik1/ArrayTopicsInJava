package Assignments;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayConversionToArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		String[] arr= {"Saranya","Pooja","AjayKrish"};
		System.out.println("Array :"+arr);
		
		for(String str:arr) {
			System.out.println(str);
			
		}
		//converting array to ArrayList using "Arrays.asList(arr)"-method.
			ArrayList<String> str1=new ArrayList<String>(Arrays.asList(arr));
			System.out.println("The arrays " +str1);
			str1.add("Devi");
			System.out.println("The added arrays " +str1);
	}

}
