package HackerBlogs;

import java.util.Scanner;

public class RecursionPattern1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		printTriangle(n);
	}

	public static void printTriangle (int leftInLine, int currLineSize, int leftLinesCount) {
	    if (leftLinesCount == 0)
	        return;
	    if (leftInLine == 0){ //Completed current line?
	        System.out.println();
	        printTriangle(currLineSize+1, currLineSize+1, leftLinesCount-1);
	    }else{
	        System.out.print("*");
	        printTriangle(leftInLine-1,currLineSize,leftLinesCount);
	    }
	}

	public static void printTriangle(int size){
	    printTriangle(1, 1, size);
	}

}
