import java.util.Scanner;

public class N1076 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char s = sc.next().charAt(0);

        for (char a = 'a'; a <= s; a++) {
            System.out.printf("%c ", a);
        }
    }
}
