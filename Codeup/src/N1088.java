import java.util.Scanner;

public class N1088 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 1; i <= n; i++) {
            if (i % 3 != 0) {
                System.out.printf("%d ", i);
            }
        }
    }
}
