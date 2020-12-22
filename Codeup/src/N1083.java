import java.util.Scanner;

public class N1083 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.valueOf(sc.nextLine(), 16);
        ;
        for (int i = 1; i <= n; i++) {
            if (i % 3 == 0) {
                System.out.printf("X ");
            } else {
                System.out.printf("%d ", i);
            }
        }
    }
}
