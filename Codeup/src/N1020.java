package problem;

import java.util.Scanner;

public class N1020 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String num = sc.nextLine();
		System.out.println(num.substring(0, 6) + num.substring(7));
	}

}
