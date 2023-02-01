package HackerBlogs;

import java.util.Scanner;

public class InverseOfNumber {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int num = sc.nextInt();
		int n = num;
		int nod = 0;
		int number = 0;
		while (n > 0) {
			n /= 10;
			nod++;
		}
		int i = 1;
		while (i <= nod) {
			int digit = num % 10;
			number = number + i * (int) Math.pow(10, digit - 1);
			num /= 10;
			i++;
		}
		System.out.println(number);
	}

}
