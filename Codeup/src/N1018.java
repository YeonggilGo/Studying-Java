package problem;

import java.util.Scanner;

public class N1018 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String hour, minute;

		String time[] = sc.nextLine().split(":");
		hour = time[0];
		minute = time[1];
		System.out.println(hour+":"+minute);
	}

}
