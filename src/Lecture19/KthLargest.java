package Lecture19;

public class KthLargest {
	public static long start;
	public static long end;

	public static void startAlgo() {
		start = System.currentTimeMillis();
	}

	public static long endAlgo() {
		end = System.currentTimeMillis();
		return end - start;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Integer[] arr = { 3, 5, 4, 7, 8, 1, 6 };
		Integer[] arr=new Integer[1000000];
		for(int i=0;i<arr.length;i++) {
			arr[i]=(i+1)*10;
		}
		startAlgo();
		System.out.println(KthLargestWithMinHeap(arr,1000 ));
		System.out.println("Time taken in nlogk case:" + endAlgo());
		startAlgo();
		System.out.println(KthLargestWithMaxHeap(arr, 1000));
		System.out.println("Time taken in n+klogn case:" + endAlgo());
	}

	public static int KthLargestWithMinHeap(Integer[] arr, int k) {
		Heap<Integer> heap = new Heap<>(true);
		int i = 0;
		// klogk
		for (; i < k; i++) {
			heap.add(arr[i]);
		}
		// n-k*log(k)
		for (; i < arr.length; i++) {
			if (arr[i] > heap.getHP()) {
				heap.remove();
				heap.add(arr[i]);
			}
		}
		return heap.getHP();

		// complexity is nlogk

	}

	public static int KthLargestWithMaxHeap(Integer[] arr, int k) {
		// n for building heap
		Heap<Integer> heap = new Heap<>(arr, false);

		// k removal from heap
		for (int i = 0; i < k - 1; i++) {
			heap.remove();
		}

		return heap.getHP();

		// complexity is n+klogn
	}

}
