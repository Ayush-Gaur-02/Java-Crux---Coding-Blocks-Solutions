package HackerBlogs;

import java.util.Scanner;

public class MaxFrequencyCharacter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		String s = sc.next();
//		int max = 0;
//		int maxI = 0;
//		int cnt = 1;
//		for(int i = 0; i < s.length() - 1; i++) {
//			if(s.charAt(i) == s.charAt(i + 1)) {
//				cnt++;
//				
//			}else {
//				if(max<cnt) {
//					max = cnt;
//					maxI = i -1;
//				}
//				cnt = 1;
//			}
//			if(max<cnt) {
//				max = cnt;
//				maxI = i -1;
//			}
//		}
//		
//		if(max == 1) {
//			maxI = 0;
//		}
//		
//		System.out.println(s.charAt(maxI));

		int[] arr = new int[26];
		for(int i = 0; i < s.length(); i++) {
			char c = s.charAt(i);
			if(c>='a' && c<='z') {
				arr[c-97]++;
			}else {
				arr[c-65]++;
			}
		}
		
		int max = -1;
		char c = ' ';
		
		for(int i = 0; i < 26; i++) {
			if(max<arr[i]) {
				max=arr[i];
				int a = i+ 97;
				c = (char)a;
			}
		}
		System.out.println(c);
	}

}
