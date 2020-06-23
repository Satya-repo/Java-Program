package io.satya;

import java.util.stream.IntStream;
public class MissingNumberInArray {

	private static int[] array2 = {1,2,3,4,6,7,8,9,10};

	public static void main(String[] args) {
		int idealSum = IntStream.range(1, 11).sum();
		int actualsum =  IntStream.of(array2).sum();
		
		System.out.println("Missing number is "+ (idealSum-actualsum));
		
		
		
		
	}
	
	

}
