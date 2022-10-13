package DailyPrograms;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FizzBuzzusinglist {

	public static void main(String[] args) {
		List<String> val=new ArrayList<String>();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number: ");
		int number=sc.nextInt();
		for(int i=1;i<=number;i++) {
			if(i%3==0 && i%5==0) {
				val.add("fizzbuzz");
				
			}
			else if(i%3==0) {
				val.add("fizz");
				
			}
			else if(i%5==0) {
				val.add("buzz");
				
			}
			else {
				val.add(String.valueOf(i));
			}
		}
		System.out.println(val);
	}

}
