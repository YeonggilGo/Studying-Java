import java.util.Scanner;

public class N1096 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String buffer = sc.nextLine();
        String[][] order = new String[n][2];

        for (int i = 0; i < n; i++) {
            order[i] = sc.nextLine().split(" ");
        }

        int[][] board = new int[20][20];

        for (int i = 0; i < n; i++) {
            board[Integer.parseInt(order[i][0])][Integer.parseInt(order[i][1])] = 1;
        }

        for (int i = 1; i < 20; i++) {
            for (int j = 1; j < 20; j++) {
                System.out.printf("%d ", board[i][j]);
            }
            System.out.println("\n");
        }

    }
}
