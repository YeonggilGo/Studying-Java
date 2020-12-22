import java.util.Scanner;
import java.util.Stack;
public class N1094 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String buffer = sc.nextLine();
        String[] atts = sc.nextLine().split(" ");
        Stack<Integer> stack = new Stack<>();

        for (String att : atts) {
            stack.push(Integer.parseInt(att));
        }

        while (!stack.empty()){
            System.out.printf("%d ", stack.pop());
        }

    }
}
