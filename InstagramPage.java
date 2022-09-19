package Assignments;

public class InstagramPage {
	
	String account_name;
	int password;
	int likes;
	int account_id;

	
	void setName(String name) {
	this.account_name=name;
	//System.out.println(account_name);
	
	}
	String getAccountName() {
		//this.account_name=name;
		return  account_name;
		
	}
	
	void setPassword(int value) {
		this.password=value;
		//System.out.println(password);
		
	}
	int getPassword() {
		return password;
		//System.out.println("password :");
	}
	
	
 void setId(int id) {
	this.account_id=id;
	//System.out.println(id);
}
 int getId() {
	 return account_id;
 }
 
 void addLikes() {
	 likes=likes+4;
	 likes++;
	 
 }
 void setLikes(int value2) {
		this.likes=value2;
	}
 
 int getLikes() {
	 return likes+4;
 }
 
 void logout(String nameone,int id2,int likesone,int pwd) {
	 this.account_name=nameone;
	 this.account_id=id2;
	 this.likes=likesone;
	 this.password=pwd;
 }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		InstagramPage insta=new InstagramPage();
		
		insta.setName("Name: sara");
		System.out.println(insta.getAccountName());
		
		insta.setPassword(123123);
		System.out.print("password:");
		System.out.println(insta.getPassword());
		
		insta.setId(2213);
		System.out.print("Insta Id :");
		System.out.println(insta.getId());
		
		insta.addLikes();
		insta.addLikes();
		insta.addLikes();
		insta.addLikes();
		System.out.print("Likes:"+insta.getLikes());
		
		insta.account_name="";
		
		
	}

}
