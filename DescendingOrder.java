package ArraysAssignment;

import java.util.Arrays;

public class DescendingOrder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int a[]= {1,4,3,5,7,6};
System.out.println("The original arrays are ");
for(int num:a) {
	System.out.println(num+ " ");
}
Arrays.sort(a);
	System.out.println("The sorted arrays are ");
	for(int num:a){
		System.out.println(num+ " ");
	}
	System.out.println("The descending arders  are ");

	for(int i=a.length-1;i>=0;i--) {
		
		
		System.out.println(a[i]);
		
	}
	
	}
}

