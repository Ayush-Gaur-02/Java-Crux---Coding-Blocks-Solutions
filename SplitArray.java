package HackerBlogs;

import java.util.Scanner;

public class SplitArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		int sum = 0;
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
			sum += arr[i];
		}
		splitArray(n, arr, 0, "", 0, 0, sum / 2);

	}

	public static void splitArray(int n, int[] arr, int i, String ans, int a, int b, int sum) {

		if (a == b && a !=0) {
			System.out.println(ans);
			return;
		}
		for (int j = 0; j < n; j++) {
			if (a < sum) {
				splitArray(n, arr, i+1, ans + arr[i], a + arr[i], b, sum);
			}else if(a==sum && b!=sum){
				splitArray(n, arr, i+1, ans + arr[i], a, b + arr[i], sum);
				
			}
		}
	}

}
