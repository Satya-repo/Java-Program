package io.satya;

public class FibonacciRecurssion {

	static int fib1 =0;static int fib2=1;static int count =7;static int fib3 = 0;
	
	public static void main(String[] args) {
		
		
		System.out.println(fib1);
		System.out.println(fib2);
		fibRecurssion(count);
	}

	private static void fibRecurssion(int count) {
		
		if(count>=0){
			fib3 = fib1+fib2;
			System.out.println(fib3);
			fib1=fib2;
			fib2=fib3;
			fibRecurssion(count-1);
		}
	}
}
