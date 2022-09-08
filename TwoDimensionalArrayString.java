package ArraysAssignment;/*Arrays.deepToString*/

import java.util.Arrays;

public class TwoDimensionalArrayString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String[][] child = new String[4][4];
String[][] parent=new String[4][3];
for (String[] row : child)
	for(String[] column:parent)
{
	Arrays.fill(row, "luke");
	Arrays.fill(column,"Rooney");
	
}
System.out.println(Arrays.deepToString(child));//Print the arrays
System.out.println(Arrays.deepToString(parent));
	}

}
