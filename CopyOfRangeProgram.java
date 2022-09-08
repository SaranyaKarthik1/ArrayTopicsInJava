package ArraysAssignment;

import java.util.Arrays;

public class CopyOfRangeProgram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int number[]= {1,2,3,4,5,6,7};
		int[] copy_value = Arrays.copyOfRange(number,3,6);
		System.out.println("The copy of range from 3 to 6 are :");
		for(int arr:copy_value) {
			System.out.println(arr + " ");
			
		}
		
		System.out.println("");
		int[] copy_value2=Arrays.copyOfRange(number, 2, number.length+4);
		System.out.println("The range and addition values :");
		for(int arr1:copy_value2) {
			System.out.println(arr1);
		}
	}

}
