package HackerBlogs;

import java.util.Scanner;

public class SudokuSolver {

	public static void main(String[] args) {
//		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[][] arr = new int[n][n];
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				arr[i][j] = sc.nextInt();
			}
		}
		solveSudoku(arr, 0, 0);
	}

	public static void solveSudoku(int[][] arr, int row, int col) {

		if (col == 9) {
			row++;
			col = 0;
		}
		if (row == 9) {
			Display(arr);
			return;
		}

		if (arr[row][col] != 0) {
			solveSudoku(arr, row, col + 1);
		} else {
			for (int i = 1; i <= 9; i++) {
				if (isItPossible(arr, row, col, i) == true) {
					arr[row][col] = i;
					solveSudoku(arr, row, col + 1);
					arr[row][col] = 0;
				}
			}

		}
	}

	public static boolean isItPossible(int[][] arr, int row, int col, int val) {
		int r = 0;
		while (r < 9) {
			if (arr[r][col] == val) {
				return false;
			}
			r++;
		}
		int c = 0;
		while (c < 9) {
			if (arr[row][c] == val) {
				return false;
			}
			c++;
		}
		r = row - row % 3;
		c = col - col % 3;
		for (int i = r; i < r + 3; i++) {
			for (int j = c; j < c + 3; j++) {
				if (arr[i][j] == val) {
					return false;
				}
			}
		}

		return true;
	}

	public static void Display(int[][] arr) {
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length; j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
	}

}
