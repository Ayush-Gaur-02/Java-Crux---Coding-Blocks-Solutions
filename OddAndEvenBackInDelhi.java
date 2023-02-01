package HackerBlogs;

import java.util.Scanner;

public class OddAndEvenBackInDelhi {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		if (n <= 1000) {
			int i = 0;
			while (i < n) {
				int carNumber = sc.nextInt();
				int sumOdd = 0;
				int sumEven = 0;
				if (carNumber >= 0) {
					while (carNumber > 0) {
						int digit = carNumber % 10;
						if (digit % 2 == 0) {
							sumEven += digit;
						} else {
							sumOdd += digit;
						}
						carNumber /= 10;
					}
					if (sumOdd % 3 == 0 || sumEven % 4 == 0) {
						System.out.println("Yes");
					} else {
						System.out.println("No");
					}
				}
				i++;
			}
		}
	}
}
