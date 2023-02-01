package HackerBlogs;

import java.util.Scanner;

public class BasicCalculator {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		boolean flag = true;

		while (flag) {
			char ch = sc.next().charAt(0);
			int n1 = 0;
			int n2 = 0;
			if (ch == '+') {
				n1 = sc.nextInt();
				n2 = sc.nextInt();
				System.out.println(n1 + n2);
			} else if (ch == '-') {
				n1 = sc.nextInt();
				n2 = sc.nextInt();
				System.out.println(n1 - n2);
			} else if (ch == '*') {
				n1 = sc.nextInt();
				n2 = sc.nextInt();
				System.out.println(n1 * n2);
			} else if (ch == '/') {
				n1 = sc.nextInt();
				n2 = sc.nextInt();
				System.out.println(n1 / n2);
			} else if (ch == '%') {
				n1 = sc.nextInt();
				n2 = sc.nextInt();
				System.out.println(n1 % n2);
			} else if (ch == 'x' || ch == 'X') {
				flag = false;
			} else {
				System.out.println("Invalid operation. Try again.");
			}
		}
	}
}
