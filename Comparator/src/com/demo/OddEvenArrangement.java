package com.demo;

import java.lang.reflect.Array;

public class OddEvenArrangement {
	
	public static void main(String[] args) {
	
	int[] array = {3,4,7,2,46,48,50};
	int length = array.length;
	System.out.println(array.length);
	for(int i = 0;i<array.length;i++){
		System.out.println("value of array "+array[i]);
		if(array[i]%2==0){
			array[i] = i;
		}else{
			//array[length-1] = i;
			//length--;
		}
		
	}
	for(int i : array){
		System.out.println(i);
	}
	}

}
