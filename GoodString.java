package DailyPrograms;

import java.util.Scanner;

public class GoodString {

	public int countSubstrings(String str1) {
		int count=0;
		for(int i=0;i<str1.length()-2;i++) {
			char x=str1.charAt(i);
			char y=str1.charAt(i+1);
			char z=str1.charAt(i+2);
			if(x!=y && y!=z && y!=x) {
				count++;
			}
		}
		return count;
	}
	public static void main(String[] args) {
		
	GoodString str=new GoodString();
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the string: ");
	String str1=sc.next();
	//str.countSubstrings(str1);
	System.out.println(str.countSubstrings(str1));
	}

}
