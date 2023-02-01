package HackerBlogs;

import java.util.Scanner;

public class VonNeumanLovesBinary {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int i = 0;
		while (i < n) {
			int mult = 1;
			int count = 0;
			int binaryNumber = sc.nextInt();
			int decimalNumber = 0;
			while (binaryNumber > 0) {
				int digit = binaryNumber % 10;
				decimalNumber += digit * Math.pow(2, count);
				binaryNumber /= 10;
				mult *= 10;
				count++;
			}
			System.out.println(decimalNumber);
			i++;
		}

	}
}
