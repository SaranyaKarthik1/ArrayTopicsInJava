package DailyPrograms;
//Method Local Innerclass.

public class LocalInnerClass {
	static String principal="John";
	int fees=30000;
	
	
	public void createDepartment() {
		System.out.println("creating department:");
		
		class dept{
		
			void exam() {
				System.out.println("Exam starts within this month");
			}
		}
		dept val=new dept();
		val.exam();
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LocalInnerClass name=new LocalInnerClass();
		name.createDepartment();
		

	}

}
