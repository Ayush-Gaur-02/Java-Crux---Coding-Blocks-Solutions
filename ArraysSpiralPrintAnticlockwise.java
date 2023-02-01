package HackerBlogs;

import java.util.Scanner;

public class ArraysSpiralPrintAnticlockwise {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int m = sc.nextInt();
		int n = sc.nextInt();
		int[][] arr = new int[m][n];
//			{ { 11, 12, 13, 14 }, { 21, 22, 23, 24 }, { 31, 32, 33, 34 }, { 41, 42, 43, 44 } };

		for (int i = 0; i < m; i++) {
			for (int j = 0; j < n; j++) {
				arr[i][j] = sc.nextInt();
			}
		}
		int left = 0;
		int right = arr[0].length - 1;
		int top = 0;
		int bottom = arr.length - 1;
		int dir = 0;
		while (left <= right && top <= bottom) {

			if (dir == 1) {
				for (int i = left; i <= right; i++) {
					System.out.print(arr[bottom][i] + ", ");
				}
				bottom--;
				dir++;
			} else if (dir == 0) {
				for (int i = top; i <= bottom; i++) {
					System.out.print(arr[i][left] + ", ");
				}
				left++;
				dir++;
			} else if (dir == 3) {
				for (int i = right; i >= left; i--) {
					System.out.print(arr[top][i] + ", ");
				}
				top++;
				dir = 0;
			} else if (dir == 2) {
				for (int i = bottom; i >= top; i--) {
					System.out.print(arr[i][right] + ", ");
				}
				right--;
				dir++;
			}

		}

		System.out.println("END");

	}
}
