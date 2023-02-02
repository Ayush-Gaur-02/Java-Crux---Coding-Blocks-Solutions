package HackerBlogs;

import java.util.Scanner;

public class SplitArrayRecursion {
	static int count = 0;

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc= new Scanner(System.in);
		
		int n = sc.nextInt();
		int[] arr = new int[n];
		
		for(int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		
		printSplitArray(arr, 0, "", 0, "", 0);
		System.out.println(count);
		
	}
	
	public static void printSplitArray(int[] arr, int i, String ans, int sum, String ans1, int sum1) {
		
		if(i == arr.length) {
			if(sum == sum1) {
				System.out.println(ans + " and" + ans1);
				count++;
			}
			
			return;
		}
		
		printSplitArray(arr, i + 1, ans + arr[i] + " ", sum + arr[i], ans1, sum1);
		printSplitArray(arr, i + 1, ans, sum, ans1 + " " + arr[i], sum1 + arr[i]);
	}

}
