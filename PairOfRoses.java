package HackerBlogs;

import java.util.Scanner;

public class PairOfRoses {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();

		for (int i = 0; i < t; i++) {
			int n = sc.nextInt();
			int[] arr = new int[n];
			for (int j = 0; j < n; j++) {
				arr[j] = sc.nextInt();
			}
			int m = sc.nextInt();
			int minJ = 0;
			int minK = 0;
			int diff = Integer.MAX_VALUE;
			for (int j = 0; j < n - 1; j++) {
				for (int k = j + 1; k < n; k++) {
					if (arr[j] + arr[k] == m) {
						if(arr[j] > arr[k]) {
							if(diff >= arr[j] - arr[k]) {
								minJ = j;
								minK = k;
								diff = arr[j] - arr[k];
							}
							
						} else if(arr[j] < arr[k]){
							if(diff >= arr[k] - arr[j]) {
								minJ = k;
								minK = j;
								diff = arr[k] - arr[j];
							}
						}else {
							minJ = minK = k;
						}
					}
				}
			}
			System.out.println("Deepak should buy roses whose prices are " + arr[minK] + " and " + arr[minJ] + ".");
			sc.nextLine();
		}
	}

}
