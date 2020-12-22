import java.util.Scanner;

public class N1096 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String buffer = sc.nextLine();
        String[] atts = sc.nextLine().split(" ");
        int min = Integer.parseInt(atts[0]);

        for (int i = 1; i < atts.length; i++) {
            if (Integer.parseInt(atts[i]) < min) {
                min = Integer.parseInt(atts[i]);
            }
        }

        System.out.println(min);

    }
}
