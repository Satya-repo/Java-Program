package io.satya;

public class SlidingWindow {

	public static void main(String[] args) {
		
		int currentSum = 0,maxSum = 0;
		int slider = 3;
		int [] array = {1,8,30,5,7,3};
		int n = array.length;
		
		for(int i =0;i<slider;i++) {
			currentSum = currentSum+ array[i];
		}
		for(int j = slider;j<n;j++) {
			
			maxSum = currentSum + (array[j]-array[j-slider]);
			currentSum = max(maxSum,currentSum);
		}
		
		System.out.println(currentSum);
	}

	private static int max(int maxSum, int currentSum) {
		return (maxSum>currentSum)? maxSum:currentSum;
	}


}
