package Assignments;

import java.util.Scanner;

public class CalculatorApplicationThree {
	
	
	
	public static void main(String[] args) {
		double number;
		double numberone;
		
		double output = 0;
		char operator;
		//char operator1;
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the first number ");
		number=sc.nextDouble();
		
		System.out.println("choose the operator + - * / ");
		operator=sc.next().charAt(0);
		
		System.out.println("Enter the second number ");
		numberone=sc.nextDouble();
		
		switch(operator) {
		case '+':output=number+numberone;
		break;
		case '-':output=number-numberone;
		break;
		case '*':output=number*numberone;
		break;
		case '/':output=number/numberone;
		break;
		default:System.out.println("Enter the correct symbol ");
		}
		
		System.out.println("The result is \n");
		System.out.println(number+ " " + operator+ numberone + " " + "="+output );

		
		
		
		
		
	}

}
