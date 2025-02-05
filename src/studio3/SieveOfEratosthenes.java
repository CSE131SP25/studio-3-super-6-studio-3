package studio3;

import java.util.*;

public class SieveOfEratosthenes {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Up to what value do you want to find a prime number?");
		

		int n = in.nextInt();
	//	int[] filledArray = { 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25,
		//		26, 27, 28, 29, 30, 31, 32, 33, 34, 35, 36, 37, 38, 39, 40 };
		int[] primeNumbers;
		primeNumbers = new int[n];
		int position = 0;
		for (int k = 2; k <= primeNumbers.length + 1; k++) {
			primeNumbers[position] = k;
			position++;
		}
		System.out.println(Arrays.toString(primeNumbers));

		int j = n + 2;
		for (int p = 2; p < j; p++) {
			int turn = n / p;
			for (int i = 1; i <= turn; i++) {
				int number = p * i;
				primeNumbers[number + 1] = 1;
				
				
		}
		}
		if primeNumbers == 0;
		for (int i = 0; i < n; i ++);{
		System.out.println();


	}
}