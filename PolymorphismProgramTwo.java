package Assignments;//Methods overriding.-Same method name with same arguments in a different(inherited) classes.(Runtime)
//

class Mobileone {

	void mobile(int amount,int num) {
		System.out.println(amount);
		System.out.println(num);
		System.out.println("The Smart phone user !");
	}
}

class Mobile extends Mobileone {
	void mobile(int amount) {
		System.out.println(amount);
		System.out.println("Welcome! Android user!");
	}
}

public class PolymorphismProgramTwo {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Mobile val = new Mobile();
		val.mobile(20000);
		Mobileone val2=new Mobileone();
		val2.mobile(20000,2);

	}

}
