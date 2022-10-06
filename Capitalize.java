import java.util.Scanner;
//import org.apache.commons.lang3.StringUtils; 
//import org.apache.commons.lang3.StringUtils;  
public class Capitalize {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name;
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter your name in lower case ");
		name=sc.nextLine();
		String[] result=name.split(" ");
		String result2;
		for(String out:result) {
			result2=out.substring(0,1).toUpperCase()+out.substring(1);
			System.out.print(result2+" ");
		}
		
		
		/*System.out.println(StringUtils.capitalize(name));
		System.out.println(StringUtils.capitalize("kaviya saranya"));  
		System.out.println(StringUtils.capitalize("java"));*/
		
	}

}
