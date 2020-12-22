import java.util.Scanner;

public class N1092 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int d = 1;
        while (!(d % a == 0 && d % b == 0 && d % c == 0)) d++;
        System.out.println(d);
    }
}
