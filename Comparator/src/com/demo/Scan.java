package com.demo;

import java.util.Scanner;

import org.w3c.dom.css.Counter;

public class Scan {
	
	private static int counter =0;
	public static void main(String[] args) {
		
		
		Scanner scanner = new Scanner(System.in);
		while(scanner.hasNextInt() && counter<5){
			System.out.println(scanner.next());
			counter++;
		}
		
		for(int i=0;i<10;i++){
			System.out.println(i);
		}
		
	}

}
