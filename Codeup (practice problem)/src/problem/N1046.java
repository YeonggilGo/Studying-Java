package problem;

import java.util.Scanner;

public class N1046 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		System.out.print(String.format("%d\n%.1f", a + b + c, (a + b + c) / 3.0));

	}
}
