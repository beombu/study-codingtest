package site.boj.문제집.코딩테스트준비.기초.브루트_포스;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class 날짜_계산 {
    public static final int MAX_E = 15;
    public static final int MAX_S = 28;
    public static final int MAX_M = 19;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int E = Integer.parseInt(st.nextToken());
        int S = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        int startE = 1;
        int startS = 1;
        int startM = 1;
        int count = 1;

        while (true) {
            if (startE > MAX_E) {
                startE = 1;
            }

            if (startS > MAX_S) {
                startS = 1;
            }

            if (startM > MAX_M) {
                startM = 1;
            }

            if (startE == E && startS == S && startM == M) {
                break;
            }

            startE++;
            startS++;
            startM++;
            count++;
        }

        System.out.println(count);
    }
}
