package HackerBlogs;

import java.util.Scanner;

public class LongestSubstringWithSAtmostKDistinctCharacters {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();

		for (int t = 0; t < T; t++) {
			String str = sc.next();
			int k = sc.nextInt();

			String[] arr = str.split(" ");
			int max = 1;
			int maxI = 0;

			for (int i = 0; i < arr.length; i++) {

				if (max < arr[i].length()) {
					maxI = i;
				}
			}
			
			
			
			System.out.println(arr[maxI].chars().distinct());
		}

	}

}
