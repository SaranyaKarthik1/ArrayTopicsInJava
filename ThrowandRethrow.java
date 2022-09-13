package Assignments;

import java.util.Scanner;

public class ThrowandRethrow {
	public static void demo() {
		Scanner sc=new Scanner(System.in);
		int arr[]= { 1,2,4,5,6,7};
		System.out.print("The arrays are "+sc.toString());
		System.out.print("Choose numerator and ddenominator " );
		int a=sc.nextInt();
		 int b = sc.nextInt();
	      try {
	         int result = (arr[a])/(arr[b]);
	         System.out.println("Result of "+arr[a]+"/"+arr[b]+": "+result);
	      }
	      catch(ArrayIndexOutOfBoundsException e) {
	         throw new IndexOutOfBoundsException();
	      }
	      catch(ArithmeticException e) {
	         throw e;
	      }
	   }
	   public static void main(String[] args) {
	       ThrowandRethrow.demo();
	   }
	}

	