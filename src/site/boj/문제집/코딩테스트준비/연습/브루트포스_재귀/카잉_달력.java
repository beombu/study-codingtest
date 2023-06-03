package site.boj.문제집.코딩테스트준비.연습.브루트포스_재귀;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class 카잉_달력 {
    public static int M;
    public static int N;
    public static int x;
    public static int y;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int testCase = Integer.parseInt(br.readLine());
        StringTokenizer st;

        for (int i = 0; i < testCase; i++) {
            st = new StringTokenizer(br.readLine());
            M = Integer.parseInt(st.nextToken());
            N = Integer.parseInt(st.nextToken());
            x = Integer.parseInt(st.nextToken());
            y = Integer.parseInt(st.nextToken());

            boolean check = false;
            int count = 0;
            int nowX = 0;
            int nowY = 0;

            for (int j = 0; j < M * N; j++) {
                nowX++;
                nowY++;

                if (nowX == x && nowY == y) {
                    System.out.println(++count);
                    check = true;
                    break;
                }

                if (nowX == M) {
                    nowX = 0;
                }
                if (nowY == N) {
                    nowY = 0;
                }

                count++;
            }
            if (!check) {
                System.out.println(-1);
            }
        }
    }
}
