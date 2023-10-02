package site.boj.문제집.코딩테스트준비.기초.브루트_포스;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class 수_이어_쓰기_1 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int testCase = Integer.parseInt(br.readLine());
        int result = 0;
        int cnt = 1;
        int len = 10;

        for (int i = 1; i <= testCase; i++) {
            if (i == len) {
                len *= 10;
                cnt++;
            }
            result += cnt;
        }

        System.out.println(result);
    }
}
