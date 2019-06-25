package Lecture12;

import Lecture11.QueuesUsingArrays;

public class DynamicQueueClient {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		QueuesUsingArrays queue = new DynamicQueue(5);

		for (int i = 1; i <= 5; i++) {
			queue.enqueue(i * 10);
			displayQueuesinfo(queue);
		}
		queue.dequeue();
		queue.dequeue();
		queue.enqueue(60);
		queue.enqueue(70);
		queue.enqueue(80);
		queue.display();

		// Queues.push(60);
//		while (!queue.isEmpty()) {
//			displayQueuesinfo(queue);
//			queue.dequeue();
//
//		}
		// queue.dequeue();
		// Queues.pop();
	}

	public static void displayQueuesinfo(QueuesUsingArrays queue) throws Exception {
		System.out.println("************************");
		queue.display();
		System.out.println("Front=>" + queue.front());
		System.out.println("Size=>" + queue.size());
		System.out.println("************************");
	}

}
