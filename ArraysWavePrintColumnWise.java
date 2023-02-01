package HackerBlogs;

import java.util.Scanner;

public class ArraysWavePrintColumnWise {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int m = sc.nextInt();
		int n = sc.nextInt();
		int[][] arr = new int[m][n];
//			{ { 11, 12, 13, 14 }, { 21, 22, 23, 24 }, { 31, 32, 33, 34 }, { 41, 42, 43, 44 } };
		
		for(int i = 0; i < m; i++) {
			for(int j = 0; j < n; j++) {
				arr[i][j] = sc.nextInt();
			}
		}
		
		for (int i = 0; i < n; i++) {
			if (i % 2 == 0) {
				for (int j = 0; j < m; j++) {
					System.out.print(arr[j][i] + ", ");
				}
			}else {
				for (int j = m - 1; j >= 0; j--) {
					System.out.print(arr[j][i] + ", ");
				}
			}
		}
		System.out.print("END");
	}

}
