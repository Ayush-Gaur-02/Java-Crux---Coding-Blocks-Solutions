package HackerBlogs;

import java.util.Scanner;

public class LCM {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int devisor = sc.nextInt();
		int n1 = devisor;
		int dividend = sc.nextInt();
		int n2 = dividend;
		if (devisor > 0 && dividend > 0) {
			while (devisor > 0) {

				int remainder = dividend % devisor;
				dividend = devisor;
				devisor = remainder;
			}
		}

		int lcm = (n1 * n2) / dividend;
		System.out.println(lcm);

	}
}
