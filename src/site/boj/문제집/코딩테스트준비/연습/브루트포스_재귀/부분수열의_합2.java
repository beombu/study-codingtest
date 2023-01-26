package site.boj.문제집.코딩테스트준비.연습.브루트포스_재귀;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class 부분수열의_합2 {
    static int S;
    static int[] arr;
    static int[] result = new int[100001];
    static int answer = 0;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        S = Integer.parseInt(br.readLine());
        arr = new int[S];

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < S; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        DFS(0, 0);

        for (int i = 0; i < result.length; i++) {
            if (result[i] == 0) {
                answer = i;
                break;
            }
        }

        System.out.println(answer);
    }

    private static void DFS(int depth, int sum) {
        if (depth == S) {
            result[sum] = 1;
            return;
        }

        DFS(depth + 1, sum + arr[depth]);
        DFS(depth + 1, sum);
    }
}
