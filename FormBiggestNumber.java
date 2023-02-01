package HackerBlogs;

import java.util.Scanner;

public class FormBiggestNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();

		for (int t = 0; t < T; t++) {

			int n = sc.nextInt();
			int[] arr = new int[n];
			
			for(int i = 0; i < n; i++) {
				arr[i] = sc.nextInt();
			}
			
			String str="";
			
			int max = 0;
			for(int i = 0; i < n; i++) {
				int a = arr[i];
				int cnt = 0;
				while(a!=0) {
					cnt++;
					a/=10;
				}
				int b = arr[i+1];
				int cnt1 = 0;
				while(b!=0) {
					cnt1++;
					b/=10;
				}
			}
			
		}

	}

}
