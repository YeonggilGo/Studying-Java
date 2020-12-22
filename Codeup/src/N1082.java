import java.util.Scanner;

public class N1082 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.valueOf(sc.nextLine(), 16);
;
        for (int i = 1; i < 16; i++) {
            System.out.printf("%H*%H=%H\n", n, i, n * i);
        }

    }
}
