import java.util.Arrays;
import java.util.Scanner;

public class permutatate {

	
		static boolean Permutation(String str1, String str2)
		{
		    
		    int numberone = str1.length();
		    int numbertwo = str2.length();
		 
		    
		    if (numberone != numbertwo)
		    return false;
		    char ch1[] = str1.toCharArray();
		    char ch2[] = str2.toCharArray();
		 
		   
		    Arrays.sort(ch1);
		    Arrays.sort(ch2);
		 
		    for (int initial = 0; initial < numberone; initial++)
		    if (ch1[initial] != ch2[initial])
		        return false;
		 
		    return true;
		}
		 
		
		public static void main(String[] args)
		{
		    String value1;
		    String value2;
		    System.out.println("Enter the first string: ");
		    Scanner sc=new Scanner(System.in);
		    value1=sc.next();
		    System.out.println("Enter the second string: ");
		    value2=sc.next();
		    if (Permutation(value1, value2))
		    System.out.println("Yes");
		    else
		    System.out.println("No");
		 
		}
		

	}


