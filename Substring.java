package DailyPrograms;

public class Substring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String value="environmental science";
		String result=value.substring(0,7);
		System.out.print(result);
		String result1=value.substring(1,5);
		System.out.print(result1);
		String result3=value.substring(2,7).toUpperCase();
		System.out.print(result3+" ");
		System.out.println(value);
		String result4=value.substring(7,17);
		System.out.println(result4);
		
	}

}
