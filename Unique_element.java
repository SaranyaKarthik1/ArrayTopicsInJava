import java.util.Scanner;

public class Unique_element {


		
		    static boolean ChractersUnique(String str)
		    {
		  
		        int checker = 0;
		     
		        for (int initial = 0; initial < str.length(); ++initial)
		        {
		            char val = (char) (str.charAt(initial)-'a');
		     
		         
		            if ((checker & (1 << val)) > 0)
		                return false;
		     
		            
		            checker |= (1 << val);
		        }
		     
		        return true;
		    }
		     
		    
		    public static void main (String[] args)
		    {
		        String str = "hai";
		       Scanner sc=new Scanner(System.in);
		        System.out.println("Enter the string: ");
		        str=sc.next();
		        
 
		        if (ChractersUnique(str))
		            System.out.print("Yes Unique");
		        else
		            System.out.print("No:Its not unique");
		    }
		
	}


