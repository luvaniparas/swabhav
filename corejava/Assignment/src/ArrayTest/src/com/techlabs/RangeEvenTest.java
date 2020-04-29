package com.techlabs;

import java.util.Scanner;

public class RangeEvenTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int s, l;
		Scanner sc = new Scanner(System.in);
		RangeEvenTest co = new RangeEvenTest();
		System.out.println("Enter Starting Number :");
		s = sc.nextInt();
		System.out.println("Enter last Number :");
		l = sc.nextInt();
		co.findEven(s, l);
	}

	public void findEven(int s, int l) {

		for (int i = s; i <= l; i++) {
			if (i % 2 == 0) {
				System.out.print(i + " ");
			}
		}
	}
}
