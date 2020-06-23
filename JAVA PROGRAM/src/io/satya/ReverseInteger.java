package io.satya;

public class ReverseInteger {

	public static void main(String[] args) {
		
		int number = 23456;
		reverse(number);
	}

	private static void reverse(int number) {
		int num = 0;
		while(number>0){
			num = number%10+num;
			number = number/10;
			System.out.println(num);
		}
		
		
	}

}
