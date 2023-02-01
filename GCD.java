package HackerBlogs;

import java.util.Scanner;

public class GCD {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int devisor = sc.nextInt();
		int dividend = sc.nextInt();
		if (devisor > 0 && dividend > 0) {
			while (devisor > 0) {

				int remainder = dividend % devisor;
				dividend = devisor;
				devisor = remainder;
			}
		}
		System.out.println(dividend);

	}

}
