package DailyPrograms;

//Hashcode : Object stored in heap memory.String is immutable.
//String stores in SCP(String constant pool)

public class HashcodeforString {

	public static void main(String[] args) {
		String name="SBI";
		System.out.println(name.hashCode());
		
		String name2="SBI";
		System.out.println(name2.hashCode());
		
		String name3="Indian Bank";
		System.out.println(name3.hashCode());

	}

}
