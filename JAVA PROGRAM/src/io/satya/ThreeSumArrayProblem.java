package io.satya;

public class ThreeSumArrayProblem {

	public static void main(String[] args) {
		
		int[] arr = {10,15,5,7,4,2,12};
		int target = 22;
		int n = arr.length;
		
		for(int i =0;i<n-2;i++) {
			
			int start = i+1;
			int end = n-1;
			while(start<end) {
				
				if(target - (arr[i]+arr[start]+arr[start+1])==0) {
					
					System.out.println(arr[i]+" "+ arr[start]+ " " +arr[start+1]);
					
					
				}
				start++;
			}
			
			
			
		}
		
		

	}

}
