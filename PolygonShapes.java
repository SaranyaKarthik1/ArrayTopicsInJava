package Assignments;

interface polygon{
	void getarea();
	default void getsides(){
		System.out.println("I can get sides of the polygon");
	}
}

 class Rectangle implements polygon {

	@Override
	public void getarea() {
		int length=6;
		int breadth=7;
		int area = length*breadth;
		System.out.println("The area of rectangle is : "+area);
		
	}
	 
 }
 class Square implements polygon{
	 public void getAreaSquare() {
		 int length=2;
		 int  area=length*length;
		 System.out.println("The area of square is "+area);
	 }

	@Override
	public void getarea() {
		// TODO Auto-generated method stub
		System.out.println("I have 4 sides ");
	}
	 
 }

public class PolygonShapes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Rectangle rect=new Rectangle();
		rect.getarea();
		
		Square shape=new Square();
		
		shape.getAreaSquare();
		shape.getarea();

	}

}
