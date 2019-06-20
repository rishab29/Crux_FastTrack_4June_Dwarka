package Lecture8;

import java.util.ArrayList;

public class RecursionDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(getSS("abc"));
		System.out.println(getSSWAscii("ab"));
		System.out.println(getPermutations("abc"));
		System.out.println(getBoardPath(10, 0).size());

		printSS("abc", "");
		printSSWAscii("ab", "");
		printPermutations("abc", "");
		
		
		System.out.println(getKeypadCombinations("12"));

	}

	public static ArrayList<String> getSS(String str) {
		if (str.length() == 0) {
			ArrayList<String> br = new ArrayList<>();
			br.add("");
			return br;
		}
		char cc = str.charAt(0);
		String ros = str.substring(1);

		ArrayList<String> myResult = new ArrayList<>();
		ArrayList<String> recResult = getSS(ros);

		for (int i = 0; i < recResult.size(); i++) {
			myResult.add(recResult.get(i));
			myResult.add(cc + recResult.get(i));
		}

		return myResult;
	}

	public static ArrayList<String> getSSWAscii(String str) {
		if (str.length() == 0) {
			ArrayList<String> br = new ArrayList<>();
			br.add("");
			return br;
		}
		char cc = str.charAt(0);
		String ros = str.substring(1);

		ArrayList<String> myResult = new ArrayList<>();
		ArrayList<String> recResult = getSSWAscii(ros);

		for (int i = 0; i < recResult.size(); i++) {
			myResult.add(recResult.get(i));
			myResult.add(cc + recResult.get(i));
			myResult.add((int) cc + recResult.get(i));
		}

		return myResult;
	}

	public static ArrayList<String> getPermutations(String str) {
		if (str.length() == 0) {
			ArrayList<String> br = new ArrayList<>();
			br.add("");
			return br;
		}
		char cc = str.charAt(0);
		String ros = str.substring(1);

		ArrayList<String> myResult = new ArrayList<>();
		ArrayList<String> recResult = getPermutations(ros);
		for (int i = 0; i < recResult.size(); i++) {
			String recString = recResult.get(i);
			for (int j = 0; j <= recString.length(); j++) {
				String myString = recString.substring(0, j) + cc + recString.substring(j);
				myResult.add(myString);
			}
		}

		return myResult;
	}

	public static ArrayList<String> getBoardPath(int end, int curr) {
		if (end == curr) {
			ArrayList<String> br = new ArrayList<>();
			br.add("");
			return br;
		}

		if (curr > end) {
			ArrayList<String> br = new ArrayList<>();
			return br;
		}

		ArrayList<String> recResult = null;
		ArrayList<String> myResult = new ArrayList<>();
		for (int dice = 1; dice <= 6; dice++) {
			recResult = getBoardPath(end, curr + dice);
			for (int i = 0; i < recResult.size(); i++) {
				myResult.add(dice + recResult.get(i));
			}
		}

		return myResult;
	}

	public static void printSS(String str, String res) {
		if (str.length() == 0) {
			System.out.println(res);
			return;
		}
		char cc = str.charAt(0);
		String ros = str.substring(1);

		printSS(ros, res);
		printSS(ros, res + cc);
	}

	public static void printSSWAscii(String str, String res) {
		if (str.length() == 0) {
			System.out.println(res);
			return;
		}
		char cc = str.charAt(0);
		String ros = str.substring(1);

		printSSWAscii(ros, res);
		printSSWAscii(ros, res + cc);
		printSSWAscii(ros, res + (int)cc);
	}

	public static void printPermutations(String str, String res) {
		if (str.length() == 0) {
			System.out.println(res);
			return;
		}
		for (int i = 0; i < str.length(); i++) {
			char cc = str.charAt(i);
			String ros = str.substring(0, i) + str.substring(i + 1);
			printPermutations(ros, res + cc);
		}
	}
	
	public static ArrayList<String> getKeypadCombinations(String str) {
		
	}
	
	private static String getCode(char ch) {
		String retVal = "";

		switch (ch) {
		case '1':
			retVal = "abc";
			break;
		case '2':
			retVal = "def";
			break;
		case '3':
			retVal = "ghi";
			break;
		case '4':
			retVal = "jkl";
			break;
		case '5':
			retVal = "mno";
			break;
		case '6':
			retVal = "pqr";
			break;
		case '7':
			retVal = "stu";
			break;
		case '8':
			retVal = "vwx";
			break;
		case '9':
			retVal = "yz";
			break;
		case '0':
			retVal = ",. \n";
			break;
		default:
			retVal = "";
			break;
		}

		return retVal;

	}
	
	

}
