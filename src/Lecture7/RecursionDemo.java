package Lecture7;

public class RecursionDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// PD(5);
		// PI(5);
		// PDI(5);

		// PDISkip(6);
		// System.out.println(fact(5));

		System.out.println(power(2, 5));
		System.out.println(fib(5));

//		int[] arr = { 3, 5, 111, 14, 17, 19 };
//		System.out.println(isSorted(arr, 0));

		int[] arr = { 3, 8, 5, 8, 8, 4 };
		System.out.println(firstIndex(arr, 0, 88));
		System.out.println(lastIndex(arr, 0, 8));

		int[] ans = allIndices(arr, 0, 8, 0);
		for (int i = 0; i < ans.length; i++) {
			System.out.print(ans[i] + " ");
		}

	}

	public static void PI(int n) {
		if (n == 0) {
			return;
		}

		PI(n - 1);
		System.out.println(n);
	}

	public static void PDI(int n) {
		if (n == 0) {
			return;
		}
		System.out.println(n);
		PDI(n - 1);
		System.out.println(n);
	}

	public static void PDISkip(int n) {
		if (n == 0) {
			return;
		}

		if (n % 2 == 1) {
			System.out.println(n);
		}

		PDISkip(n - 1);

		if (n % 2 == 0) {
			System.out.println(n);
		}

	}

	public static int fact(int n) {
		if (n == 1 || n == 0) {
			return 1;
		}

		int fnm1 = fact(n - 1);
		int fn = n * fnm1;
		return fn;
	}

	public static int power(int x, int n) {
		if (n == 0) {
			return 1;
		}

		int pnm1 = power(x, n - 1);
		int pn = x * pnm1;
		return pn;
	}

	public static int fib(int n) {
		if (n == 0 || n == 1) {
			return n;
		}

		int fibnm1 = fib(n - 1);
		int fibnm2 = fib(n - 2);
		int fibn = fibnm1 + fibnm2;
		return fibn;
	}

	public static boolean isSorted(int[] arr, int i) {
		if (i == arr.length - 1) {
			return true;
		}
		if (arr[i] > arr[i + 1]) {
			return false;
		} else {
			boolean restans = isSorted(arr, i + 1);
			return restans;
		}
	}

	public static int firstIndex(int[] arr, int i, int data) {
		if (i == arr.length) {
			return -1;
		}

		if (arr[i] == data) {
			return i;
		} else {
			int restans = firstIndex(arr, i + 1, data);
			return restans;
		}
	}

	public static int lastIndex(int[] arr, int i, int data) {

		if (i == arr.length) {
			return -1;
		}
		int index = lastIndex(arr, i + 1, data);
		if (index != -1) {
			return index;
		} else {
			if (arr[i] == data) {
				return i;
			} else {
				return -1;
			}
		}
	}

	public static int[] allIndices(int[] arr,int i,int data,int count) {
		
		if(i==arr.length) {
			int[] br=new int[count];
			return br;
		}
		int[] indices=null;
		if(arr[i]==data) {
			indices=allIndices(arr, i+1, data,count+1);
		}else {
			indices=allIndices(arr, i+1, data,count);
		}
		
		if(arr[i]==data) {
			indices[count]=i;
		}
		return indices;
	}

}
