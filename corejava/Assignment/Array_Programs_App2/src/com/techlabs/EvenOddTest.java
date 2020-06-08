package com.techlabs;

import java.util.Scanner;

public class EvenOddTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int arrip[] = { 10, 3, 17, 16, 23, 57, 60, 13 };
		EvenOddTest co = new EvenOddTest();
		co.findEven(arrip);
		co.findOdd(arrip);
	}

	public void findEven(int arrip[]) {
		System.out.print("Odd Numbers:");
		for (int i = 0; i < arrip.length; i++) {
			if (arrip[i] % 2 != 0) {
				System.out.print(arrip[i] + " ");
			}
		}
	}

	public void findOdd(int arrip[]) {
		System.out.print("\nEven Numbers:");
		for (int i = 0; i < arrip.length; i++) {
			if (arrip[i] % 2 == 0) {
				System.out.print(arrip[i] + " ");
			}
		}
	}

}
