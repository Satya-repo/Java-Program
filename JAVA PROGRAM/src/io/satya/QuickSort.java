package io.satya;

import java.util.stream.IntStream;

public class QuickSort {

	static int[] array = { 4, 5, 3, 2, 8, 13, 12, 15 };

	public static void main(String[] args) {

		int[] quickSort = QuickSort(array,0,array.length-1);
		IntStream.of(quickSort).forEach(System.out::println);

	}

	static int[] QuickSort(int[] array, int l, int h) {

		if (l < h) {
			int partition = partition(array, l,h);
			QuickSort(array, 0, partition);
			QuickSort(array, partition + 1, h);
			
		}
		return array;
	}

		static int partition(int[] array, int l, int h) {
		int i= l;
		int j=h;
		int pivot = array[i];
		do {
			i++;
		} while (array[i] <= pivot);

		do {
			j--;
		} while (array[j] > pivot);
		
		if (i < j) {
			 int temp = array[i]; 
             array[i] = array[j]; 
             array[j] = temp; 
		//	return h;
		}
		return j;
	}

}
