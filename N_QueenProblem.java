package HackerBlogs;
import java.util.*;
public class N_QueenProblem {
	static int x = 0;
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		boolean[][] board = new boolean[n][n];
		
		printNQueen(board, 0, n);
		System.out.println();
		System.out.println(x);
	}
	
	public static void printNQueen(boolean[][] board, int row, int tq) {

		if(tq == 0) {
			Display(board);
			x++;
			return;
		}
		if(row >= board.length) {
			return;
		}
		
		for(int col = 0; col < board.length; col++) {
			if(isItPossible(board,row,col) == true) {
				board[row][col]=true;
				printNQueen(board, row + 1, tq - 1);
				board[row][col]=false;
			}
		}
	}
	
	public static boolean isItPossible(boolean[][] board, int row, int col) {
		
		int r = row;
		while(r >= 0) {
			if(board[r][col] == true) {
				return false;
			}
			r--;
		}
		
		r = row;
		int c = col;
		while(r>=0 && c>=0) {
			if(board[r][c] == true) {
				return false;
			}
			r--;
			c--;
		}
		
		r = row;
		c = col;
		while(r>=0 && c<board.length) {
			if(board[r][c] == true) {
				return false;
			}
			r--;
			c++;
		}
		return true;
	}
	
	public static void Display(boolean[][] board) {
		for (int i = 0; i < board.length; i++) {
			for (int j = 0; j < board.length; j++) {
				if(board[i][j] == true) {
					System.out.print("{"+(i+1) + "-" +(j+1)+"}"+" ");
					
				}
			}
		}
		System.out.print(" ");
	}

}
