package site.boj.문제집.코딩테스트준비.기초.수학;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class 소수_찾기 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        int count = 0;

        for (int i = 0; i < N; i++) {
            int num = Integer.parseInt(st.nextToken());
            if (isPrime(num)) {
                count++;
            }
        }

        System.out.println(count);
    }

    private static boolean isPrime(int num) {
        if (num == 1) {
            return false;
        }

        for (int j = 2; j <= (int) Math.sqrt(num); j++) {
            if (num % j == 0) {
                return false;
            }
        }

        return true;
    }
}
