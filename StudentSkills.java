package Assignments;

public class StudentSkills {
	
	//Instance Variables 
	int roll_number=12;
	Long phone_number=6374461373L;
	String name;
	
	  static void read() {
		  //local variables for method read
		int number=10;
		System.out.println(number);
	}
	static void write() {
		read();
		System.out.println("I'm reading a Book!Don't disturb");
		
	}
	void draw() {
		
	}
	

	public static void main(String[] args) {
		

		//object for the StudentSkills.
		StudentSkills skill=new StudentSkills();
		System.out.println(skill.phone_number);
		System.out.println(skill.name);
		
		//calling the Static method
		System.out.println("methods called");
		read();
		write();
		
		

	}

}
