package com.demo;

import java.util.ArrayList;
import java.util.List;

public class FileCom {

	public static void main(String[] args) {
		//Boolean excist=false;
		Integer[] array1 = {4,5,2,7,8,10};
		Integer[] array2 = {1,2,3,4,5};
		List<Integer> list = new ArrayList<>();

		for(int i=0;i<array2.length;i++){
			for(int j=0;j<array1.length;j++){
				//System.out.println("array1[j]: "+array1[j]+"array2[i] : "+array2[i]);
				if(array1[j]  == array2[i]){
					//System.out.println("coming here");
					continue;
					//excist=true;
					//break;
				}
				else{
					
					list.add(array2[i]);
					break;
				}
				
			}
			
			//continue;
			//if(excist==true){
				//System.out.println(excist);
				//excist=false;
				//continue;
			//}else{
				//System.out.println(array2[i]);
				//list.add(array2[i]);
			}
		System.out.println(list);
		}

		//System.out.println(list);
	}











