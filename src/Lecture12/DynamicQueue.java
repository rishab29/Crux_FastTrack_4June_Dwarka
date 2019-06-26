package Lecture12;

import Lecture11.QueuesUsingArrays;

public class DynamicQueue extends QueuesUsingArrays {
	public DynamicQueue() throws Exception {
		this(DEFAULT_CAPACITY);
	}

	public DynamicQueue(int capacity) throws Exception {
		super(capacity);
	}

	public void enqueue(int element) throws Exception {
		if (this.size() == this.data.length) {
			int[] arr = new int[2 * this.data.length];
			for (int i = 0; i < this.size(); i++) {
				arr[i] = this.data[(this.front + i) % this.data.length];
			}
			this.data = arr;
			this.front = 0;

		}
		super.enqueue(element);
	}

}
