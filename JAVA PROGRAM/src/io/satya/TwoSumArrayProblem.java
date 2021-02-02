package io.satya;

import java.util.HashMap;
import java.util.Map;

public class TwoSumArrayProblem {

	public static void main(String[] args) {

		int[] arr = { 1, 3, 7, 2, 4, 5, 6 };
		int target = 5;
		Map<Integer, Integer> map = new HashMap<Integer, Integer>();
		for (int i = 0; i < arr.length; i++) {
			// System.out.println(map.get(arr[i]));

			int value = target - arr[i];

			if (map.get(value) != null) {
				System.out.println(arr[i] + " " + value);

			} else {
				map.put(arr[i], i);
			}

		}
	}

}
