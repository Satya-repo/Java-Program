package io.satya;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class StateCodeRange {

	public static void main(String[] args) {
		
//		String s = "satya iu bhkshs ds";
//		String[] array = s.split(" ");
//		System.out.println(array);
//		//System.out.println(s.trim());
//		for(String s1 : array) {
//			
//			System.out.println(s1+""+array.length);
//		}

		Scanner sc = new Scanner(System.in);
		List<String> list = new ArrayList<String>();
		int t = sc.nextInt();

		int count = 1;

		Scanner sc1 = new Scanner(System.in);
		while (count <= t && sc1.hasNext()) {

			list.add(sc1.nextLine());
			count++;
		}
		sc1.close();
		
		System.out.println(list);
		
		

	}

}
