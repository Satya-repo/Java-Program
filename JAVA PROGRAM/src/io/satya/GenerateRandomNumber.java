package io.satya;

import java.util.Random;
  
public class GenerateRandomNumber {

	/**
	 * @param args
	 * @throws InterruptedException
	 */
	public static void main(String[] args) throws InterruptedException {

		int totalRandomNumbers = 10;
		while (totalRandomNumbers >= 1) {
			Thread.sleep(2);
			System.out.println(String.valueOf(System.currentTimeMillis()).substring(10));
			totalRandomNumbers--;
		}
		
		 System.out.println("Random Numbers:");
	      System.out.println("***************");
	      for (int counter = 1; counter <= 5; counter++) {
	         System.out.println(new Random().nextInt(200));
	      }
		
	}

}
