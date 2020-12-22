import java.util.Scanner;

public class N1087 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int b = sc.nextInt();
        int sum = 0;
        int i = 1;
        while (sum < b) {
            sum += i++;
        }
        System.out.println(sum);
    }
}
