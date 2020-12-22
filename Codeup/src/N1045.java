package problem;

import java.util.Scanner;

public class N1045 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		System.out.print(String.format("%d\n%d\n%d\n%d\n%d\n%.2f", a + b, a - b, a * b, a / b, a % b, a/(double)b));

	}
}
