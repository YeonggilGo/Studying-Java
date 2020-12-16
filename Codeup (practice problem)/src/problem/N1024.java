package problem;

import java.util.Scanner;

public class N1024 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();

		int length = s.length();
		for (int i = 0; i < length; i++) {
			System.out.println(String.format("'%c'", s.charAt(i)));
		}
	}
}
