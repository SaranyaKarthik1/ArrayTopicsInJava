package Assignments;

import java.lang.reflect.Array;
import java.util.ArrayList;
//import java.util.Collection;
import java.util.Collections;
import java.util.Scanner;

public class ArrayListSortProblem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<Integer> value = new ArrayList<Integer>();

		System.out.println("Enter the integer ");
		Scanner sc = new Scanner(System.in);
		// sc.nextInt();

		for (int i = 0; i < 5; i++) {
			int temp = sc.nextInt();

			if (!value.contains(temp)) 
				value.add(temp);
			

		}
		System.out.println("The unique values are "+value);
		Collections.sort(value);
		System.out.print("The sorted values are "+value);

	}
}
