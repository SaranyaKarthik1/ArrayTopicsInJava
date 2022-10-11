package DailyPrograms;

public class ThreadusingString implements Runnable{

	public static void main(String[] args) {
		Runnable child=new ThreadusingString();
		
		Thread name=new Thread(child,"Thread using string");//create Thread in Java using Thread(String name): 
		name.start();
		name.run();
		//name.resume();
		String str=name.getName();
		System.out.println(str);

	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		
		System.out.println("Login page for gmail:");
		
	}

}
