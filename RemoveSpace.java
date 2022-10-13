package DailyPrograms;

import java.util.Scanner;

public class RemoveSpace {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the string: ");
		String s=sc.nextLine();
		String[] result=s.split(" ");
		for(int i=0;i<result.length;i++) {
			System.out.print(result[i]);
			
		}

	}

}
