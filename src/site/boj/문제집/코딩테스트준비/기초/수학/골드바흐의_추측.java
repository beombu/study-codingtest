package site.boj.문제집.코딩테스트준비.기초.수학;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class 골드바흐의_추측 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        while (true) {
            int n = Integer.parseInt(br.readLine());
            if (n == 0) {
                break;
            }

            int minNum = 3;
            boolean flag = false;

            for (int i = n - minNum; i >= n / 2 - 2; i -= 2) {
                if (isPrime(i) && isPrime(minNum)) {
                    System.out.println(n + " = " + minNum + " + " + i);
                    flag = true;
                    break;
                }

                minNum += 2;
            }

            if (!flag) {
                System.out.println("Goldbach's conjecture is wrong.");
            }
        }
    }

    private static boolean isPrime(int num) {
        if (num == 1) {
            return false;
        }

        for (int i = 2; i <= (int) Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }

        return true;
    }
}
