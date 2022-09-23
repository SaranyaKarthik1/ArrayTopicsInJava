package Assignments;

 abstract class ZohoIdentityCard{
	abstract void access();
}

 class BlackcolourID extends ZohoIdentityCard {
	public void access() {
		System.out.println("I have all the access inside the office");
	}
}

  class BluecolourId extends  ZohoIdentityCard{
	public void access() {
		System.out.println("I have access only in Woodlands");
	}
	
}

class YellowcolourId extends  ZohoIdentityCard{
	void access() {
		System.out.println("I have only limited access");
		 
	}
	void loginaccess() {
		System.out.println("I don't have login access");
	}
	void canteenaccess() {
		System.out.println("I have access inside the canteen ");
		
	}
	}
	

public class TestIdentityCard {

	public static void main(String[] args) {	
		ZohoIdentityCard card1=new ZohoIdentityCard() {
			void access() {
				
			}
		};
		ZohoIdentityCard card=new BlackcolourID();
		card.access();
		ZohoIdentityCard cardone=new BluecolourId();
		cardone.access();
		ZohoIdentityCard cardtwo=new YellowcolourId();
		cardtwo.access();
		YellowcolourId cardthree=new YellowcolourId();
		cardthree.loginaccess();
		cardthree.canteenaccess();
		
		

	}

}
