package HackerBlogs;

import java.util.Scanner;

public class MatrixSearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

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
		int element = sc.nextInt();
		int a = 0;
		int i = 0;
		int j = arr[0].length -1;
		
		while(i < arr.length && j >=0) {
			if(arr[i][j] == element ) {
				a = 1;
				break;
			}else if (arr[i][j] < element) {
				i++;
			}else {
				j--;
			}
		}
		System.out.println(a);
		
	}

}
