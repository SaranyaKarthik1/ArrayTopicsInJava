import java.util.Scanner;

public class PermutationString {
	 
    static void permutate(String value_one, String ans)
    {
 
        if (value_one.length() == 0) {
            System.out.print(ans + " ");
            return;
        }
 
        for (int i = 0; i < value_one.length(); i++) {
 
           
            char ch = value_one.charAt(i);
 
            String result = value_one.substring(0, i) +
                        value_one.substring(i + 1);
 
         
            permutate(result, ans + ch);
            //System.out.print("exist in :");
        }
    }
 
    
    public static void main(String[] args)
    {
        //String str = "ABC";
       // permutate(str, "");
    	String str;String str2;
        System.out.println("Enter the first string:");
        Scanner sc=new Scanner(System.in);
        str=sc.next();
        System.out.println("Enter the second string:");
        str2=sc.next();
        System.out.print("exist in : ");
        permutate(str,"");
        if(str==str2) {
        	System.out.print("exist in :");
        	 permutate(str,"");
        	 
        }
       //else {
        	//System.out.println("Not permuted");
        //}
        
    }
}



	

