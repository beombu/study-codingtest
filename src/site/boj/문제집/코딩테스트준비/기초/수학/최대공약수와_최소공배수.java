package site.boj.문제집.코딩테스트준비.기초.수학;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class 최대공약수와_최소공배수 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int num1 = Integer.parseInt(st.nextToken());
        int num2 = Integer.parseInt(st.nextToken());
        int maxAnswer = 1;
        int minAnswer = 1;


        for (int i = Math.min(num1, num2); i >= 2; i--) {
            if (num1 % i == 0 && num2 % i == 0) {
                maxAnswer *= i;
                minAnswer *= i;
                num1 /= i;
                num2 /= i;
            }
        }

        minAnswer = minAnswer * num1 * num2;

        System.out.println(maxAnswer);
        System.out.println(minAnswer);
    }
}
