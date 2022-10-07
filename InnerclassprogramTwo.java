package DailyPrograms;

class College {
	static String principal = "WarenJohn";
	int fees = 30000;

	boolean laptop = false;

	void conductSports() {
		System.out.println("Sports for all the students");
	}
	// inner class -Department.

	class Department {
		boolean laptop=true;
		void conductSymphosim() {
           
			College name = new College();
			System.out.println(name.fees);
			System.out.println(name.principal);
			System.out.println(name.laptop);
			System.out.println(College.this.laptop);
		}

	}
}

public class InnerclassprogramTwo {

	public static void main(String[] args) {
		College value = new College();

		value.conductSports();
		// calling a method resides in a inner class.
		College.Department namenew = value.new Department();
		namenew.conductSymphosim();
		System.out.println(value.laptop);
		System.out.println(namenew.laptop);
		//System.out.println(College.this.laptop);(Throws error)

	}

}
