package site.boj.문제집.코딩테스트준비.기초.수학;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class 약수의_합 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());

        for (int i = 0; i < T; i++) {
            int N = Integer.parseInt(br.readLine());
            int answer = 0;

            for (int j = 1; j <= N; j++) {
                answer += (N / j) * j;
            }

            System.out.println(answer);
        }
    }
}
