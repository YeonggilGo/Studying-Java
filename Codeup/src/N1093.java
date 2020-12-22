import java.util.Scanner;

public class N1093 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String buffer = sc.nextLine();
        String[] atts = sc.nextLine().split(" ");

        int[] takeAtt = new int[24];
        for (String att : atts) {
            takeAtt[Integer.parseInt(att)] += 1;
        }

        for (int i = 1; i < 24; i++) {
            System.out.printf("%d ", takeAtt[i]);
        }
    }
}
