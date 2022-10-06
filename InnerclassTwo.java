package DailyPrograms;


	
	class Outerclass{
		int number=100;
		class Innerclass{
			public int start() {
				return number;
			}
		}
	}
	public class InnerclassTwo {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Outerclass name=new Outerclass();
Outerclass.Innerclass name2=name.new Innerclass();
System.out.print(name2.start());
		
	}

}
