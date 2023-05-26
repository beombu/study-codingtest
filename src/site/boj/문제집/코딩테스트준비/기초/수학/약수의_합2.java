package site.boj.문제집.코딩테스트준비.기초.수학;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class 약수의_합2 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int answer = 0;

        for (int i = 1; i <= N; i++) {
            answer += sumDivisor(i);
        }

        System.out.println(answer);
    }

    private static int sumDivisor(int N) {
        int sum = 0;
        for (int i = 1; i <= (int) Math.sqrt(N); i++) {
            if (N % i == 0) {
                sum += i;

                if ((N / i) != i) {
                    sum += (N / i);
                }
            }
        }

        return sum;
    }
}
