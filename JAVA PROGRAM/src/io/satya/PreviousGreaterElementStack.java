package io.satya;

import java.util.Stack;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class PreviousGreaterElementStack {
	
	public static void main(String[] args) {
		
		int [] array = {15,14,34,21,24,56,71,100};
		IntStream.of(array).forEach(System.out::println);
		
		Stack<Integer> st = new Stack();
		st.add(array[0]);
		System.out.println(-1);
		
		for(int i= 1;i<array.length;i++) {
			
			
			while(st.isEmpty()==false && st.peek()<= array[i]) {
				st.pop();
			}
			
			int pg = st.isEmpty()? -1:st.peek();
			
			System.out.println(pg);
			st.push(array[i]);
		}
		
		//IntStream.of(array).forEach(System.out::println);
		
	}

}
