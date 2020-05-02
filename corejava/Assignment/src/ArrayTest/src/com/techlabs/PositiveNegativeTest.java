package com.techlabs;

public class PositiveNegativeTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = { -3, 16, 20, 54, -6, -23, 10 };
		PositiveNegativeTest co = new PositiveNegativeTest();
		co.findPositive(arr);
		co.findNegative(arr);
	}

	public void findPositive(int arr[]) {
		System.out.print("Positive Numbers are: ");
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] >= 0) {
				System.out.print(arr[i] + " ");
			}
		}
	}

	public void findNegative(int arr[]) {
		System.out.print("\nNegative Numbers are: ");
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] <= 0) {
				System.out.print(arr[i] + " ");
			}
		}

	}
}
