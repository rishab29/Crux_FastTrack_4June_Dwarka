package Lecture9;

import java.util.ArrayList;

public class RecursionDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(countMazepath(2, 2, 0, 0));
		System.out.println(getMazePath(2, 2, 0, 0));
		printMazePath(2, 2, 0, 0, "");
		System.out.println(getMazePathWD(2, 2, 0, 0));
		printMazePathWD(2, 2, 0, 0, "");
		boolean[][] board = new boolean[4][4];
		System.out.println(countNQueens(board, 0));

		int[][] arr = { { 0, 0, 9, 0 }, { 0, 0, 9, 0 }, { 9, 0, 0, 0 }, { 0, 9, 0, 9 } };
		printAllPathsWithMine(arr, 0, 0, 3, 3);

	}

	public static int countMazepath(int er, int ec, int cr, int cc) {
		if (er == cr && ec == cc) {
			return 1;
		}

		if (cr > er || cc > ec) {
			return 0;
		}

		int mycount = 0;
		mycount = countMazepath(er, ec, cr, cc + 1) + countMazepath(er, ec, cr + 1, cc);
		return mycount;
	}

	public static ArrayList<String> getMazePath(int er, int ec, int cr, int cc) {
		if (er == cr && ec == cc) {
			ArrayList<String> br = new ArrayList<>();
			br.add("");
			return br;
		}

		if (cr > er || cc > ec) {
			ArrayList<String> br = new ArrayList<>();
			return br;
		}
		ArrayList<String> myResult = new ArrayList<>();
		ArrayList<String> hResult = getMazePath(er, ec, cr, cc + 1);
		ArrayList<String> vResult = getMazePath(er, ec, cr + 1, cc);
		for (int i = 0; i < hResult.size(); i++) {
			myResult.add("H" + hResult.get(i));
		}

		for (int i = 0; i < vResult.size(); i++) {
			myResult.add("V" + vResult.get(i));
		}

		return myResult;

	}

	public static void printMazePath(int er, int ec, int cr, int cc, String res) {
		if (er == cr && ec == cc) {
			System.out.println(res);
			return;
		}
		if (cr > er || cc > ec) {
			return;
		}
		printMazePath(er, ec, cr, cc + 1, res + "H");
		printMazePath(er, ec, cr + 1, cc, res + "V");
	}

	public static ArrayList<String> getMazePathWD(int er, int ec, int cr, int cc) {
		if (er == cr && ec == cc) {
			ArrayList<String> br = new ArrayList<>();
			br.add("");
			return br;
		}

		if (cr > er || cc > ec) {
			ArrayList<String> br = new ArrayList<>();
			return br;
		}
		ArrayList<String> myResult = new ArrayList<>();
		ArrayList<String> hResult = getMazePathWD(er, ec, cr, cc + 1);
		ArrayList<String> vResult = getMazePathWD(er, ec, cr + 1, cc);
		ArrayList<String> dResult = getMazePathWD(er, ec, cr + 1, cc + 1);
		for (int i = 0; i < hResult.size(); i++) {
			myResult.add("H" + hResult.get(i));
		}

		for (int i = 0; i < vResult.size(); i++) {
			myResult.add("V" + vResult.get(i));
		}

		for (int i = 0; i < dResult.size(); i++) {
			myResult.add("D" + dResult.get(i));
		}

		return myResult;
	}

	public static void printMazePathWD(int er, int ec, int cr, int cc, String res) {
		if (er == cr && ec == cc) {
			System.out.println(res);
			return;
		}
		if (cr > er || cc > ec) {
			return;
		}
		printMazePathWD(er, ec, cr, cc + 1, res + "H");
		printMazePathWD(er, ec, cr + 1, cc, res + "V");
		printMazePathWD(er, ec, cr + 1, cc + 1, res + "D");
	}

	public static int countNQueens(boolean[][] board, int row) {
		if (row == board.length) {
			return 1;
		}
		int count = 0;
		for (int col = 0; col < board[row].length; col++) {
			if (isItSafe(board, row, col)) {
				board[row][col] = true;
				count = count + countNQueens(board, row + 1);
				board[row][col] = false;
			}
		}
		return count;
	}

	public static boolean isItSafe(boolean[][] board, int row, int col) {
		for (int i = row; i >= 0; i--) {
			if (board[i][col]) {
				return false;
			}
		}

		for (int i = row, j = col; i >= 0 && j >= 0; i--, j--) {
			if (board[i][j]) {
				return false;
			}
		}

		for (int i = row, j = col; i >= 0 && j < board.length; i--, j++) {
			if (board[i][j]) {
				return false;
			}
		}

		return true;
	}

	public static void printAllPathsWithMine(int[][] arr, int cr, int cc, int er, int ec) {
		if (er == cr && ec == cc) {
			arr[cr][cc] = 1;
			for (int i = 0; i < arr.length; i++) {
				for (int j = 0; j < arr[i].length; j++) {
					System.out.print(arr[i][j] + " ");
				}
				System.out.println();
			}
			System.out.println("*********************");
			arr[cr][cc] = 0;
			return;
		}
		if (cr > er || cc > ec) {
			return;
		}
		if (arr[cr][cc] == 9) {
			return;
		}

		arr[cr][cc] = 1;
		printAllPathsWithMine(arr, cr, cc + 1, er, ec);
		printAllPathsWithMine(arr, cr + 1, cc, er, ec);
		arr[cr][cc]=0;

	}

}
