package HackerBlogs;

import java.util.Scanner;

public class BuyAndSellStock {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];

		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		int maxProfit = 0;
		int buyPrice = Integer.MAX_VALUE;
		for (int i = 0; i < n - 1; i++) {

			if(arr[i] < buyPrice) {
				buyPrice = arr[i];
			}
			if(maxProfit < arr[i] - buyPrice) {
				maxProfit = arr[i] - buyPrice;
			}
		
		}
		
		System.out.println(maxProfit);
		

	}

}
