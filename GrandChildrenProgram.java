package ArraysAssignment;
//import java.util.Scanner;
public class GrandChildrenProgram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String name[][]={ {"luke","shaw"},
		{"wayne","rooney"},
		{"rooney","ronaldo"},
		{"shaw","rooney"}};
String son;
int count=0;
//Scanner sc=new Scanner(System.in);
//System.out.println("Enter the G")
for(int i=0;i<name.length;i++) {
	if(name[i][1]=="ronaldo") {
		son=name[i][0];//here prints a rooney
		break;
	}
}
for(int i=0;i<name.length;i++) {
	if(name[i][1]=="rooney") {
		count++;
	}
		
	
}

	System.out.println("Grandchildren " +count);
}

}