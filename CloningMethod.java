package ArraysAssignment;

import java.util.Arrays;

public class CloningMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int a[]= {1,2,3,4};
int b[]=a.clone();
b[0]++;
b[3]++;
System.out.println("The numers of a[] ");
for(int i=0;i<a.length;i++)
	System.out.println(a[i] + " ");

System.out.println("The cloning are ");
for(int i=0;i<b.length;i++)
	System.out.print(b[i] + " ");
	}
	//System.out.println(Arrays.toString(a)));
	//System.out.println(Arrays.de(b[]);
}


