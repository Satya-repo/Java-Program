package io.satya;

public class Max_Array_Sub {

	public static void main(String[] args) {
		
		int sum =0;
		// int [] array = {10,20,30,-10,-50,40,-50,-1,-3,2,3};
		int [] array = {1,2,3,-1,-2,-3,-4}; //= 1+2+3+-1+-3 = 2
		int x = array[array.length-1];
		for(int i=0;i<=array.length-2;i++) {
			if(array[i]>0) {
				sum = sum+array[i];
				System.out.println(sum+"value added is "+array[i]);
			}
			else {
				sum = sum+ max(array[i],array[i+1]);
				System.out.println(sum+"value added is "+max(array[i],array[i+1]));
				i++;
			}
		}
		if(x>0)
		{
			sum = sum+x;
		}
		System.out.println(sum);
	}
	static int max(int a,int b) {
		
		return (a>b)?a:b;
	}

}
