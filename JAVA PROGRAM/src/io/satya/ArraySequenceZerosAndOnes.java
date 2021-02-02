package io.satya;

public class ArraySequenceZerosAndOnes {

	public static void main(String[] args) {
		
		int [] array = {0,0,0,1,1,1,0,1,0,0,1,0,0,1,0,1,1,1,1,1,0,1};
		
		for(int i =0, j=array.length-1;(i<array.length & j>=0 & i<j); i++,j--) {
			
			if(array[i] ==0 && array[j] ==1) {
				continue;
				
			}else if(array[i] == 1 &&  array[j] == 0) {
				
				int temp = array[i];
				array[i] = array[j];
				array[j] = temp;
				
			}else if(array[i] == 1 &&  array[j] == 1){
				i--;
				
			}
			else if(array[i] == 0 &&  array[j] == 0){
				j++;
				
			}
			
		}
		
		
		for(int a : array) {
			System.out.print(a);
		}

	}

}
