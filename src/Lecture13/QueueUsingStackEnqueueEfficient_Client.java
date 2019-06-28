package Lecture13;

public class QueueUsingStackEnqueueEfficient_Client {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		QUSEnqueueEfficient queue = new QUSEnqueueEfficient();
		queue.enqueue(10);
		queue.enqueue(20);
		queue.enqueue(30);
		queue.enqueue(40);
		queue.enqueue(50);
		queue.display();
		queue.dequeue();
		queue.dequeue();
		queue.display();
		System.out.println(queue.front());
		queue.display();

	}

}
