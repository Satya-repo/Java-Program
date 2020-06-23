package io.satya;

import java.util.Scanner;

public class Anagram {
	
	public static void main(String[] args) {
		
	/*StringBuilder str = new StringBuilder();
	Scanner scanner = new Scanner(System.in);
	System.out.println("Enter first String");
	while(scanner.hasNext() && !scanner.hasNextInt()){
		str.append(scanner.next());
	}
		if(str.toString().equals(str.reverse().toString()))
			System.out.println("ANAGRAMMM");
		else
			System.out.println("NOT ANAGRAMM");*/
		m1();
		
}
	
public static void m1(){
	StringBuilder str1 = new StringBuilder();
	str1.append("satya");
	StringBuilder str2 = new StringBuilder();
	str2.append("satya");
	System.out.println(str1.equals(str2));
	System.out.println(str1.hashCode()==str2.hashCode());
	
	
}
	
	
	
}
