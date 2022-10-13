package DailyPrograms;

import java.util.Scanner;

public class ReverseString {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String result="";
		System.out.println("Enter the string: ");
		String s=sc.nextLine();
		for(int i=s.length()-1;i>=0;i--) {
			 result=result+s.charAt(i);
			 //System.out.print(result);
			
		}
		System.out.print(result);
	}

}
