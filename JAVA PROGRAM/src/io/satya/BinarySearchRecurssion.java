package io.satya;

import java.util.stream.IntStream;

public class BinarySearchRecurssion {

	public static void main(String[] args) {

		int[] array = IntStream.range(1, 100).sorted().toArray();

		int low = 0;
		int high = array.length - 1;
		int x = search(array, 10, low,high);

		if (x < 0)
			System.out.println("ITEM NOT FOUND");
		else
			System.out.println("ITEM FOUND ATT " + x);
		
	}

	

	private static int search(int[] array, int i, int low, int high) {

		int mid = (low + high) / 2;
		int index = -1;
		System.out.println("value of mid is " + mid + "  value of I is " + i + "array[mid] is " + array[mid]);
		if (array[mid] == i) {
			index = mid;
			return index;
		}
		if (low < high) {
			if (array[mid] > i) {
				return search(array, i, low, mid - 1);
			} else if (array[mid] < i) {
				return search(array, i, mid + 1, high);

			}
		}
		return index;
	}
}
