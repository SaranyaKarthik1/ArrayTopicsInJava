package Assignments;

import java.util.Scanner;

public class CalculatorApplicationTwo {

	public static void main(String[] args) {
		double number;
		double numberone;
		double output;
		char cases;
		Scanner sc=new Scanner(System.in);
		System.out.println("Give two numbers ");
		number=sc.nextDouble();
		numberone=sc.nextDouble();
		
		System.out.println(" Enter the operator\n ");
		cases=sc.next().charAt(0);
		
		switch(cases) {
		case '+':output=number+numberone;
		break;
		case '-':output=number-numberone;
		break;
		case '*':output=number*numberone;
		break;
		case '/':output=number/numberone;
		break;
		default:
			System.out.println("Enter the valid symbols ");
			return;
		}	
		System.out.println("The result is \n");
		System.out.println(number+ " "+cases + numberone + " " + "=" +output);

	}

}
