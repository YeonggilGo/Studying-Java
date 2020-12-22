package problem;

import java.util.Scanner;

public class N1026 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String minute;

		String time[] = sc.nextLine().split(":");
		minute = time[1];
		System.out.println(minute);
	}

}
