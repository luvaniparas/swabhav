package com.techlabs;

public class SeprateZeroTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SeprateZeroTest co = new SeprateZeroTest();
		co.seprateZero(new int[] {12, 0, 7, 0, 8, 0, 3});
		co.seprateZero(new int[] {1, -5, 0, 0, 8, 0, 1});
	}

	public void seprateZero(int arr[]) {
		int a=0;
		for(int i=0 ; i<arr.length;i++) {
			if(arr[i] != 0) {
				arr[a] = arr[i];
				a++ ;
			}	
		}
		while(a<arr.length) {
			arr[a] = 0 ;
			a++;
		}
		System.out.print("\nSeprated Array :");
		for(int i=0;i<arr.length-1;i++) {
			System.out.print(arr[i]+" ");
		}
	}
}
