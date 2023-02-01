package HackerBlogs;

import java.util.Scanner;

public class ReplaceThemAll {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		long l = sc.nextLong();
		long ans = 0;
		long mult = 1;
		if(l==0) {
			ans=5;
		}
		while(l > 0) {
			int digit = (int)(l % 10);
			if(digit == 0) {
				ans = ans + 5* mult;
				l = l/10;
			}else {
				ans = ans + digit * mult;
				l = l/10;
			}
			mult *= 10;
		}
		System.out.println(ans);
	}

}
