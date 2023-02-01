	package HackerBlogs;

public class RecursionConvertStringToInteger {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		printStringtoInt("1032", 0, 10);
	}

	
	public static void printStringtoInt(String str, int num, int mult) {
		if(str.length() == 0) {
			System.out.println(num);
			return;
		}
		
		char a = str.charAt(0);
		printStringtoInt(str.substring(1), num*mult + (a - 48), mult);
		
		
	}
}
