package com.techlab.sstatic.test;

public class CounterWithoutStaticTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Count c1 = new Count();
		Count c2 = new Count();
		Count c3 = new Count();
	}
}

class Count {
	public  Count() {
		int count = 1;
		System.out.println(count);
		count += 1;
	}

}
