package ArraysAssignment;

import java.util.Scanner;

public class ArrayPatternProblemTwo {
	static void patternone(String s,int len){
		for(int i=0;i<len;i++) {
			int j=len-1-i;
			for(int k=0;k<len;k++) {
				if(k == i || k == j)
					System.out.print(s.charAt(k));
				else
					System.out.print(" ");
		
	}
		 
	System.out.println(" ");
		}
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the strings: ");
		String str=sc.next();
		int len=str.length();
		patternone(str,len);
		
	}
		// TODO Auto-generated method stub

	}



    
