package io.satya;

import java.util.Scanner;

public class PrimeNumber {

	public static void main(String[] args) {

		int primeCount = 100;
		boolean print = false;

		for (int i = 1; i < primeCount; i++) {
			if (i <= 2) {
				System.out.println(i);
				continue;
			}

			
			for (int j = 2; j < i; j++) {
				if (i % j == 0) {
					print = false;
					break;
				}

				else {
					print = true;
				}

			}
			if (print)
				System.out.println(i);

		}
	}

}
