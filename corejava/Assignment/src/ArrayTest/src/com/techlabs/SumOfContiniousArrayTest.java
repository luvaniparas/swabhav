package com.techlabs;

public class SumOfContiniousArrayTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SumOfContiniousArrayTest co = new SumOfContiniousArrayTest();
		co.findSubArray(new int[] { 42, 15, 12, 8, 6, 32 }, 26);
		co.findSubArray(new int[] { 12, 5, 31, 13, 21, 8 }, 49);
	}

	public void findSubArray(int array[], int add) {

		int sum = array[0];
		int start = 0;

		for (int i = 1; i < array.length; i++) {
			sum = sum + array[i];

			while (sum > add && start <= i - 1) {
				sum = sum - array[start];
				start++;
			}

			if (sum == add) {
				System.out.print("Continuous sub array :");

				for (int j = start; j <= i; j++) {
					System.out.print(array[j] + " ");
				}
				System.out.print("Addition Number :"+add);
				System.out.println();
			}
		}
	}
}
