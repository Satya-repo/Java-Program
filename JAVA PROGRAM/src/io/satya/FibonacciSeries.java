package io.satya;

public class FibonacciSeries {

	public static void main(String[] args) {
		fib(5);
	}

	private static void fib(int i) {

		int[] array = new int[i];
		int fib1 = 0;
		int fib2 = 1;

		int count = 0;

		while (count < i && count<=1) {

			if (count == 0) {
				array[count] = fib1;
				count++;
			}
			if (count == 1) {
				array[count] = fib2;
				count++;
			}
		}

		while (count < i && count > 1) {
			int fib3 = fib1 + fib2;
			array[count] = fib3;
			count++;
			fib1 = fib2;
			fib2 = fib3;
		}
		for(int x:array){
			System.out.println(x);
		}

	}

}
