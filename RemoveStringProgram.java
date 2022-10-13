package DailyPrograms;

import java.util.Scanner;

public class RemoveStringProgram {

	static void remove() {
		System.out.println("Enter the string: ");
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		String result="";
	for(int i=0;i<s.length();i++) {
			if(s.charAt(i)!=' ') {
				result=result+s.charAt(i);
				
			}
			
		//System.out.println(s.trim());
	}
	}
	public static void main(String[] args) {
		remove();
	}

}
