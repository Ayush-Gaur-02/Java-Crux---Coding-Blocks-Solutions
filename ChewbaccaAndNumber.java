package HackerBlogs;

import java.util.Scanner;

public class ChewbaccaAndNumber {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		long num = sc.nextLong();
		long n = num;
		long mult = 1;
		long ans = 0;
		if (num > 0) {
			while (num > 0) {
				int digit = (int) (num % 10);
				int newDigit = 9 - digit;
				
				if (newDigit < digit) {
					ans += newDigit * mult;
				} else {
					ans += digit * mult;
				}
				mult *= 10;
				num /= 10;
			}
		}else {
			ans = 0;
		}
		mult /=10;
		if((n/mult) == 9) {
			ans += 9*mult;
		}
		
		System.out.println(ans);
	}
}
