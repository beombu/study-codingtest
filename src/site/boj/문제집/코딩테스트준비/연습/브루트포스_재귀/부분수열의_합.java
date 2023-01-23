package site.boj.문제집.코딩테스트준비.연습.브루트포스_재귀;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class 부분수열의_합 {
    static int N;
    static int S;
    static int[] arr;
    static boolean[] visited;
    static int result;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        N = Integer.parseInt(st.nextToken());
        S = Integer.parseInt(st.nextToken());
        arr = new int[N];
        visited = new boolean[N];

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        DFS(0, 0);

        if (S == 0) {
            System.out.println(result - 1);
        } else {
            System.out.println(result);
        }
    }

    public static void DFS(int depth, int sum) {
        if (depth == N) {//마지막 깊이까지 갔다면
            if (sum == S) {
                result++;
            }
            return;
        }

        DFS(depth + 1, sum + arr[depth]);
        DFS(depth + 1, sum);
    }
}
