package site.programmers.other;

public class 콜라_문제 {
    public int solution(int a, int b, int n) {
        int answer = 0;

        while (n >= a) {
            int mod = n % a;
            int bottle = (n / a) * b;
            answer += bottle;
            n = bottle + mod;
        }

        return answer;
    }
}
