import java.util.Scanner;

public class StringProblem1 {

	static void print() {
	
	System.out.println("Enter the string with two letters : ");
	Scanner sc=new Scanner(System.in);

	String s=sc.nextLine();
	
	String[] result=s.split(" ");
	String ans=result[result.length-1];
	System.out.println(ans.length());
	
	
	}
	public static void main(String[] args) {
//		System.out.println("Enter the string with two letters : ");
//		Scanner sc=new Scanner(System.in);
//		String s1=sc.next();
//		
//		
//		int s2=s1.trim().length()-s1.trim().lastIndexOf(" ")-1;
//		
//		System.out.println(s2);
print();
	}

}
