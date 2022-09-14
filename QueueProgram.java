package Assignments;

import java.util.PriorityQueue;
import java.util.Queue;

public class QueueProgram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Queue q=new PriorityQueue();
		q.offer(200);
		q.offer(300);
		System.out.println(q);
		q.poll();
		System.out.println(q);
		q.poll();
		System.out.println(q);
		q.remove();
	}

}
