package Assignments;

public class MainLevelEnum {
	
	private enum level{
		low,
		MEDIUM,
		HIGH,
		moderate,
		midRate,
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    level val=level.midRate;
    System.out.println(val);
	level values=level.HIGH;
		System.out.println(values);
		
		level values2=level.low;
		System.out.println(values2);
		
		level values3=level.MEDIUM;
		System.out.println(values3);
		System.out.println();
		
		System.out.println("Using Switch in enum");
		level value=level.HIGH;
		level value4=level.low;
		switch(value4) {
		case low:
			System.out.println("Low level");
			break;
		case MEDIUM:
			System.out.println("Medium level");
			break;
		case HIGH:
			System.out.println("High level");
			break;
		}
			
			System.out.println();
		//The enum type has a values() method, which returns an array of all enum constants.	
			System.out.println("Using for each");
		for(level var:level.values()) {
			System.out.println(var);
		}
		}
	}


