package site.boj.문제집.코딩테스트준비.기초.브루트_포스;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class 리모컨 {
    static boolean[] broken;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        int N = Integer.parseInt(br.readLine());
        int M = Integer.parseInt(br.readLine());
        broken = new boolean[10];

        if (M != 0) {
            st = new StringTokenizer(br.readLine());

            for (int i = 0; i < M; i++) {
                int num = Integer.parseInt(st.nextToken());
                broken[num] = true;
            }
        }

        int min_cnt = Math.abs(N - 100);
        for (int i = 0; i <= 1000000; i++) {
            int len = check(i);
            if (len > 0) {
                int press = Math.abs(N - i);
                min_cnt = Math.min(min_cnt, len + press);
            }
        }

        System.out.println(min_cnt);
    }

    static int check(int n) {
        if (n == 0) {
            if (broken[0]) {
                return 0;
            } else {
                return 1;
            }
        }

        int len = 0;
        while (n > 0) {
            if (broken[n % 10]) {
                return 0;
            }
            n /= 10;
            len++;
        }
        return len;
    }
}
