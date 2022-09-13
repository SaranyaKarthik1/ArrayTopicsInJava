package Assignments;

//import java.lang.reflect.Array;
import java.util.ArrayList;

public class ArrayListForLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> name=new ArrayList<>();
		name.add("Pooja");
		name.add("saranya");
		name.add("kavya");
		for(int i=0;i<3;i++) {
			System.out.println("The names are "+name);
		}for(int j=0;j<3;j++)
			name.add("123");
			System.out.println("The other loop "+name);
		
		
		//removing the name in the arraylist
		name.remove(0);
		//name.get(123);
        System.out.println(name);
	}

}
