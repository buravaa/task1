package main.task1;

public class Task1 {
	public static void main(String[] args) {
		int n = Integer.parseInt(args[0]);
		int m = Integer.parseInt(args[1]);
		test(n, m);
	}
	
	static void test(int n, int m) {
		int[] array = new int[n];
		int number = 1;
		for (int i = 0; i < n; i++) {
			array[i] = number++;
		}
		int[] array2 = new int[n * n];
		int count = 0;
		
		for (int i = 0; i < array2.length; i++) {
			array2[i] = array[i % array.length];
		}
		System.out.print(1);
		
		for (int i = 0; i < array2.length; i++) {
			count++;
			if (count == m) {
				if (array2[i] == 1) {
					break;
				} else {
					System.out.print(array2[i--]);
					count = 0;
				}
			}
		}
	}
}
