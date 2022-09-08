package ArraysAssignment;
import java.util.Arrays;
public class EqualsAndDeepEquals {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	
		    
		        // Let us create array of arrays
		        int[][] array1 = { { 1, 1 }, { 1, 2 } };
		        int[][] array2 = { { 1, 1 }, { 1, 0 } };
		 
		        System.out.println("Is arr1 equals to arr2 : "
		                           + Arrays.equals(array1, array2));
		        System.out.println("Is arr1 deepequals to arr2 : "
		                           + Arrays.deepEquals(array1, array2));
		    
		
	}

}
