package problem;

import java.util.Scanner;

public class N1025 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();

		for (int i = 4; i >= 0; i--) {
			int curValue = num / (int) Math.pow(10, i) * (int) Math.pow(10, i);
			System.out.println("[" + curValue + "]");
			num -= curValue;
		}
	}
}
