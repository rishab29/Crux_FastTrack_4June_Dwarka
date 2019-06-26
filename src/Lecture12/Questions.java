package Lecture12;

public class Questions {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		DynamicStack stack = new DynamicStack(5);
		DynamicStack helper = new DynamicStack(5);
		for (int i = 1; i <= 5; i++) {
			stack.push(i * 10);
		}
		stack.display();
		reverseStack(stack, helper, 0);
		stack.display();

		DynamicQueue queue = new DynamicQueue();
		for (int i = 1; i <= 5; i++) {
			queue.enqueue(i * 10);
		}

		queue.display();
		reverseQueue(queue);
		queue.display();

	}

	public static void reverseStack(DynamicStack stack, DynamicStack helper, int index) throws Exception {
		if (stack.isEmpty()) {
			return;
		}
		int element = stack.pop();
		reverseStack(stack, helper, index + 1);
		helper.push(element);
		if (index == 0) {
			while (!helper.isEmpty()) {
				stack.push(helper.pop());
			}
		}
	}

	public static void reverseQueue(DynamicQueue queue) throws Exception {
      if(queue.isEmpty()) {
    	  return;
      }
		int element=queue.dequeue();
		reverseQueue(queue);
		queue.enqueue(element);
	}

}
