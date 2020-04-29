package com.techlabs;

import java.util.Scanner;

public class EvenOddTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		int arrip[] = { 10, 3, 17, 16, 23, 57, 60, 13 };
		EvenOddTest co = new EvenOddTest();
		co.findEvenOdd(arrip);

	}

	public void findEvenOdd(int arrip[]) {
		System.out.print("Odd Numbers:");
		for (int i = 0; i < arrip.length; i++) {
			if (arrip[i] % 2 != 0) {
				System.out.print(arrip[i] + " ");
			}
		}
		System.out.print("\nEven Numbers:");
		for (int i = 0; i < arrip.length; i++) {
			if (arrip[i] % 2 == 0) {
				System.out.print(arrip[i] + " ");
			}
		}
	}

}
