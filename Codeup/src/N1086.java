import java.util.Scanner;

public class N1086 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int w = sc.nextInt();
        int h = sc.nextInt();
        int bit = sc.nextInt();
        System.out.printf("%.2f MB", (h*w*bit)/(double)(1024*1024*8));
    }
}
