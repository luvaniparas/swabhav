package com.techlabs;

public class SumOfPairTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = { 4, 6, 5, -10, 8, 5, 20 };
		int add = 10;
		SumOfPairTest co = new SumOfPairTest();
		co.findPair(arr, add);
	}

	public void findPair(int arr[], int add) {
		int i, j;
		int len = arr.length;
		for (i = 0; i < (len / 2) + 1; i++) {
			int find = 10 - arr[i];
			for (j = i+1; j < len; j++) {
				if (find == arr[j]) {
					System.out.println("Pair :" + arr[i] + "+" + arr[j]);
				}
			}
		}
	}
}
