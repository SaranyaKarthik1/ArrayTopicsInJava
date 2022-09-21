package Assignments;
abstract class Animalname{
	abstract void makesound();
		
	public void eat() {
		System.out.println("Animals eat plants");
	}
	
}

abstract class Tiger extends Animalname{
	public void eating() {
		System.out.println("Eat Living things!");
	}
}
class Cow {
	void eats() {
		System.out.println("Eat plants");
	}
	void givefood() {
		System.out.println("Gives us milk");
		
	}
}

public class Animal extends Cow {

	public static void main(String[] args) {
		Cow name=new Animal();
		name.givefood();
		name.eats();
		//name.eating();
	}
}
