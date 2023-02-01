package HackerBlogs;

import java.util.Scanner;

public class SimpleInput {

	public static void main(String[] args) {

		int sum = 0;
		Scanner sc = new Scanner(System.in);

		while (sum > -1) {
			int a = sc.nextInt();
			sum += a;
			if (sum > -1) {
				System.out.println(a);
			}
		}
	}

}
