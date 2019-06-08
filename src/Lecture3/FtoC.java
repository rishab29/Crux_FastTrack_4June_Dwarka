package Lecture3;

public class FtoC {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int fcurrent = 0;
		while (fcurrent <= 300) {
			int celsius = (int)((5.0 / 9) * (fcurrent - 32));
			System.out.println(fcurrent + "\t" + celsius);
			fcurrent = fcurrent + 20;
		}
	}

}
