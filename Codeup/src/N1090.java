import java.util.Scanner;

public class N1090 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int r = sc.nextInt();
        int n = sc.nextInt();
        System.out.println((int)Math.pow(r, n - 1) * a);
    }
}
