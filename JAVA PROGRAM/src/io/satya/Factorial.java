package io.satya;

public class Factorial {

	public static void main(String[] args) {
		
		int fact=1,factorial = 8;
		
		while(factorial>=1){
			fact = factorial*fact;
			factorial--;
		}
		System.out.println(fact);
		
		
		

	}

}
