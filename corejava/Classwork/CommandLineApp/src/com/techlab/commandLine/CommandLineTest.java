package com.techlab.commandLine;

import java.util.*;

public class CommandLineTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		CommandLineTest commandLine = new CommandLineTest();

		ArrayList<Integer> even = new ArrayList<Integer>();
		ArrayList<Integer> odd = new ArrayList<Integer>();

		for (int i = 0; i < args.length - 1; i++) {
			if (Integer.parseInt(args[i]) % 2 == 0) {
				even.add(Integer.parseInt(args[i]));
			} else {
				odd.add(Integer.parseInt(args[i]));
			}
		}

		if (args[args.length - 1].equals("-e")) {
			commandLine.printEvenNumbers(even);
		} else if (args[args.length - 1].equals("-o")) {
			commandLine.printOddNumbers(odd);
		} else {
			commandLine.printNumber(args);
		}

		commandLine.calculateAvergae(args);
		commandLine.calculatePercentage(args);
	}


	void printEvenNumbers(ArrayList<Integer> even) {
		System.out.print("Numbers are: ");
		for (int x : even) {
			System.out.print(x + " ");
		}
	}

	void printOddNumbers(ArrayList<Integer> odd) {
		System.out.print("Numbers are: ");
		for (int x : odd) {
			System.out.print(x + " ");
		}
	}

	void printNumber(String[] arr) {
		System.out.print("Numbers are: ");
		for (String s : arr) {
			System.out.print(s + " ");
		}

	}

	void calculateAvergae(String[] arr) {
		int avg, total = 0;
		for (int i = 0; i < arr.length; i++) {
			total = total + Integer.parseInt(arr[i]);
		}
		avg = total / arr.length;
		System.out.println("");
		System.out.println("Average of total number is : " + avg);
	}
	
	void calculatePercentage(String[] arr) {
		
		final int MAX = 100 ;
		int evenNumberCount = 0; 
		double percentage =0.0;
		
		for(int i=0; i <arr.length-1 ;i++)
		{
			if(Integer.parseInt(arr[i]) % 2 == 0) {
				evenNumberCount++;
			}
		}
		percentage = (double)(evenNumberCount*100) / arr.length ;
		System.out.println("Percentage is :"+percentage);
	}

}
