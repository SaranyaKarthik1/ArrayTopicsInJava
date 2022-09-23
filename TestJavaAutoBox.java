package Assignments;

class AutoBox{
	//int number=50;
	void print1() {
	Integer number=50;
	Float num=50.0f;
	Double value=24.5;
	Long val=22222l;
	System.out.println(number);
	System.out.println(num);
	System.out.println(value);
	System.out.println(val);
	
	
	}
}
public class TestJavaAutoBox {
	public static void main(String[] args) {
		AutoBox values=new AutoBox();
		values.print1();
	//System.out.println(number);
	}	
	

}
