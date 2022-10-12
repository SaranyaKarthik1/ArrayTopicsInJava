

class MyThread extends Thread {
	
	public void run() {
		for(int i =0; i<10; i++) {
			System.out.println("Child Thread "+i);
			if(i == 5) {
				try {
					Thread.currentThread().sleep(5000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				//Thread.currentThread().interrupt();
			}
			
				
		}
	System.out.println(Thread.currentThread().getName());
	}
	
}

	public class Threadone{

		public static void main(String[] args) {
			//MultiThreads multi=new MultiThreads("Thread-1");
			//multi.start();
			System.out.println(Thread.currentThread().getName());
			
			
			Thread t = new MyThread();
			t.start();
			
			
			for(int i= 100; i < 150; i++) {
				System.out.println("Main Thread "+i);
			}
		

		}
	}

		

