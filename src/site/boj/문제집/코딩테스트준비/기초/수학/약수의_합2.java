package site.boj.문제집.코딩테스트준비.기초.수학;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class 약수의_합2 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        long answer = 0;

        /**
         * N = 6
         * i = 1 -> (6 / 1) * 1
         * i = 2 -> (6 / 2) * 2
         * i = 3 -> (6 / 3) * 3
         * i = 4 -> (6 / 4) * 4
         * i = 5 -> (6 / 5) * 5
         * i = 6 -> (6 / 6) * 6
         */
        for (int i = 1; i <= N; i++) {
            answer += (N / i) * i;
        }

        System.out.println(answer);
    }
}
