package problem;

import java.util.Scanner;

public class N1057 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		Boolean A = a == 1 ? true : false;
		Boolean B = b == 1 ? true : false;

		System.out.println(!A ^ B ? 1 : 0);
	}
}
