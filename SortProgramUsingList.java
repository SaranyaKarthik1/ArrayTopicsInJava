package Assignments;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class SortProgramUsingList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<String> str = new ArrayList<>();

		System.out.println("Enter the names");
		Scanner sc = new Scanner(System.in);

		for (int i = 0; i < 5; i++) {
			String temp = sc.next();
			if (!str.contains(temp)) {
				str.add(temp);
			}
		}
		System.out.println("The unique string are " + str);
		Collections.sort(str);
		System.out.println("The  sorted strings are " + str);

	}

}
