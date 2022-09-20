package Assignments;//Polymorphism-method overloading.

public class PolymorphismProgramone {
	
	
		public void play() {
			System.out.println("No players !");
		}
	void play(int player_one) {
     System.out.println("Single player only !");
		
	}
	
	void play(int player_one,int player_two) {
		System.out.println("Two players are allowed !");
		
	}


	public static void main(String[] args) {
		
		PolymorphismProgramone poly=new PolymorphismProgramone();
		poly.play();
		poly.play(1);
		poly.play(1,2);

	}

}

