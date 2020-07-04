import java.util.Scanner;

public class Prime {

	public static void main(String[] args) {

		int primeNumber[] = new int[10];

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter 'N' ");
		int N = sc.nextInt();

		for (int i = 2; i < N + 1; i++) {
			System.out.println(i);

			for (int j = 2; j < N + 1; j++) {
				if (i % j == 0) {
					break;
				} else {
					primeNumber[i] = j;
				}
			}

		}
		
		for (int i = 0; i < primeNumber.length; i++) {

			System.out.println("Prime Numbers are " + i);

		}

	}

}
