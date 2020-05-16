package CounterWithStatictest;

public class CounterWithStatictest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Count c1 = new Count();
		Count c2 = new Count();
		Count c3 = new Count();
	}

}

class Count {
	static int count = 1;
	public  Count() {
		System.out.println(count);
		count += 1;
	}

}
