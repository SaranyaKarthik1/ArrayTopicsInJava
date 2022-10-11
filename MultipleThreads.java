package DailyPrograms;

import java.net.BindException;

class MultiThreads implements Runnable{
private Thread t;
private String threadName;

MultiThreads(String name){
	threadName=name;
	System.out.println("Creating "+ threadName);
	
}

public void run1() {
	System.out.println("Running" + threadName);
	try {
		for(int i=4;i>0;i--) {
			System.out.println("Thread: "+ threadName + "," +i);
			Thread.sleep(1000);
			
		}
	}catch(InterruptedException e) {
		System.out.println("Thread" + threadName + "interrupted.");
		
	}
	System.out.println("Thread " + threadName + "Exiting.");
}
public void start() {
	System.out.println("starting " + threadName);
	if(t==null) {
		t=new Thread(this, threadName);
		t.start();
	}
}
public void run() {
	// TODO Auto-generated method stub
	
}


}
public class MultipleThreads{

	public static void main(String[] args) {
		MultiThreads multi=new MultiThreads("Thread-1");
		multi.start();

	}
}

	
	

