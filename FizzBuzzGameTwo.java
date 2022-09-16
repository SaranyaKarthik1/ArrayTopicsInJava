package Assignments;

import java.util.Scanner;

public class FizzBuzzGameTwo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Enter the numeber ");
		Scanner sc=new Scanner(System.in);
		int number=sc.nextInt();
		
		for(int i=0;i<=number;i++) {
			
			if(i%3==0 && i%5==0) 
				System.out.println("FIZZ BUZZ!");
			
			else if(i%3==0) 
			System.out.println("FIZZ!");
			
			
			else if(i%5==0) 
				System.out.println("BUZZ!");
			
			
			else
				System.out.println(i);
			
		
			}
		}
	}


