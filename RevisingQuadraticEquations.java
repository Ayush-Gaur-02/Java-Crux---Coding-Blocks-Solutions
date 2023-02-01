package HackerBlogs;

import java.util.Scanner;

public class RevisingQuadraticEquations {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		int d = b * b - (4 * a * c);
		if (a >= -100 && b >= -100 && c >= -100 && a <= 100 && b <= 100 && c <= 100) {
			int root1 = (-b + (int) Math.sqrt(d)) / (2 * a);
			int root2 = (-b - (int) Math.sqrt(d)) / (2 * a);

			if (d < 0) {
				System.out.println("Imaginary");
			} else if (d == 0) {
				System.out.println("Real and Equal");
				System.out.println(root1 + " " + root2);
			} else if (root1 > root2) {
				System.out.println("Real and Distinct");
				System.out.println(root2 + " " + root1);
			} else if (root1 < root2) {
				System.out.println("Real and Distinct");
				System.out.println(root1 + " " + root2);
			}
		}
	}
}
