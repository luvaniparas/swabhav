package com.techlabs;

import java.util.Arrays;

public class MissingNumberTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MissingNumberTest co = new MissingNumberTest();
		co.missingNumber(new int[] { 1, 4, 5, 3, 2, 8, 6 });
	}

	public void missingNumber(int arr[]) {
		int find=1 ;
		Arrays.sort(arr) ;
		for(int i=0; i < arr.length - 1;i++) {
			if(find == arr[i]) {
				find++;
			}
		}
			System.out.println("Missing Number is :"+find);
			
	}
}
