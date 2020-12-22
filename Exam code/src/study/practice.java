package study;

public class practice {
    public static int solution(int n) {
        int answer = 0;
        for (int i = 1; i <= Math.sqrt(n); i++) {
            if (Math.pow(i, 2) == n) {
                answer += i;
            } else if (n % i == 0) {
                answer += i + n / i;
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        int i = 25;
        System.out.println(solution(i));
    }
}