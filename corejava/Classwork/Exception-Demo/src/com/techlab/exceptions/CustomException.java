package com.techlab.exceptions;

public class CustomException {

	public static void main(String[] args) {
		int i=8,j=9 ;
		
		try {
			int k = i/j ;
			if(k == 0) {
				throw new MyException(" Custom Exception ");
			}
		}catch(Exception e) {
			System.out.println("Catch Exception"+e.getMessage());
		}
	}

}
