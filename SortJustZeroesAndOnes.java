package HackerBlogs;

import java.util.Scanner;

public class SortJustZeroesAndOnes {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		if (n < Math.pow(10, 7)) {
			int zero = 0;
			int[] arr = new int[n];
			for (int i = 0; i < n; i++) {
				arr[i] = sc.nextInt();
				if(arr[i] == 0) {
					zero++;
				}
			}
			for (int i = 0; i < n; i++) {
				if(zero !=0) {
					arr[i] = 0;
					zero--;
				}else {
					arr[i] = 1;
				}
				
			}

			for (int i : arr) {

				System.out.print(i + " ");
			}
		}
	}

}
