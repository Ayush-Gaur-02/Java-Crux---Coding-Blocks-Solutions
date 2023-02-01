package HackerBlogs;

import java.util.Scanner;

public class SumOfOddPlacedAndEvenPlacedDigits {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int sumOdd = 0;
		int sumEven = 0;
		int count = 1;
		while (n > 0) {
			int digit = n % 10;
			if (count % 2 == 0) {
				sumEven += digit;
			} else {
				sumOdd += digit;
			}
			count++;
			n /= 10;
		}
		System.out.println(sumOdd);
		System.out.println(sumEven);

	}

}
