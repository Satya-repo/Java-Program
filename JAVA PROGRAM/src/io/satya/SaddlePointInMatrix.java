package io.satya;

public class SaddlePointInMatrix {

	public static void main(String[] args) {

		int mat[][] = { { 1, 2, 3 }, { 4, 5, 6 }, { 10, 8, 9 } };
		findSaddlePoint(mat, 3);
	}
	private static void findSaddlePoint(int[][] mat, int n) {

		int min = 0;
		int index = -1;
		int k = 0;
		for (int i = 0; i < n; i++) {
			min = mat[i][0];
			index = 0;

			for (int j = 1; j < n; j++) {

				if (mat[i][j] < min) {
					min = mat[i][j];
					index = j;
				} else {
					continue;
				}
			}
			// Giving output as 1 , 4 ,7
			System.out.println(min + "index is ++ " + index);
			// int max = mat[0][index];
			for (k = 1; k < n; k++) {

				if (mat[k][index] > min)
					break;

			}
			if (k == n)
				System.out.println("saddle point is ::  " + min);
		}
	}

}
