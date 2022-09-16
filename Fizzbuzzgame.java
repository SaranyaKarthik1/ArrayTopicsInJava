package Assignments;

import java.util.Scanner;

public class Fizzbuzzgame {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Enter the number ");
		Scanner sc=new Scanner(System.in);
		int number=sc.nextInt();
		
		//for(int i=0;i<=number;i++) {
			
			if(number%3==0 && number%5==0) {
				System.out.println("FIZZ BUZZ!");
			}
			else if(number%3==0) {
			System.out.println("The number is FIZZ!");
			}
			
			else if(number%5==0) { 
				System.out.print("BUZZ!");
			
			}
		
			else {
				System.out.println("The number is not FIZZBUZZ");
			}
				
			
	}
}
		
	


