import java.util.Scanner;

public class N1070 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();

		if (a <= 100 && a >= 90) {
			System.out.println("A");
		} else if (a < 90 && a >= 70) {
			System.out.println("B");
		} else if (a < 70 && a >= 40) {
			System.out.println("C");
		} else {
			System.out.println("D");
		}

	}
}
