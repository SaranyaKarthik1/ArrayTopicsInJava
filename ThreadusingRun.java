package DailyPrograms;

//to create Thread by using Runnable Interface:  
public class ThreadusingRun implements Runnable {

	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("Thread is running Sucessfully");
		int number_one=10;
		int number_two=20;
		int sum=number_one+number_two;
		int multiply=number_one*number_two;
		System.out.println(sum);
		System.out.println(multiply);
	}
	public static void main(String[] args) {
		ThreadusingRun obj=new ThreadusingRun();
		Thread t=new Thread(obj);
		t.run();
	}

}
