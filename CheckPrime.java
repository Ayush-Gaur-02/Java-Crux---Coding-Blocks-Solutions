package HackerBlogs;

import java.util.Scanner;

public class CheckPrime {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int num = sc.nextInt();
		int div = 2;
		int count = 2;
		if (num > 2 && num <= 1000000000) {
			while (div < num) {
				if (num % div == 0) {
					count++;
				}
				div++;
			}
			if (count == 2) {
				System.out.println("Prime");
			} else {
				System.out.println("Not Prime");
			}
		}
	}

}
