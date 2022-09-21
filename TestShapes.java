package Assignments;
//cannot create object for the Abstract class.
abstract class Shapes {

	public abstract void length();
		
	}
		
	abstract class Triangle extends Shapes {
		
		public void draw() {
			System.out.println("To draw a circle !");
		}
	}
	
public class TestShapes{
	public static void main(String[] args) {
		TestShapes tri=new TestShapes();
		tri.equals("saranya");
		System.out.println(tri);
		
		
	}
	
}
	


