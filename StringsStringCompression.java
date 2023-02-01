package HackerBlogs;

import java.util.Scanner;

public class StringsStringCompression {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		String s = "";
		int cnt = 1;
		for(int i = 0; i < str.length() - 1; i++) {
			if(str.charAt(i) == str.charAt(i+1)) {
				cnt++;
			}else {
				s+=str.charAt(i);
				if(cnt>1) {
					s+=cnt;
				}
				cnt = 1;
			}
			
		}
		s+=str.charAt(str.length()-1);
		if(cnt>1) {
			s+=cnt;
		}
		System.out.println(s);
	}

}
