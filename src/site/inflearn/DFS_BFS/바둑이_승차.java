package site.inflearn.DFS_BFS;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class 바둑이_승차 {
    static int result = Integer.MIN_VALUE;
    static int N;
    static int C;

    public static void DFS(int idx, int sum, int[] arr) {
        if (sum > C) {
            return;
        }

        if (idx == N) {//합이 C를 넘지 않으면
            result = Math.max(result, sum);
        } else {
            DFS(idx + 1, sum + arr[idx], arr);
            DFS(idx + 1, sum, arr);
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        C = Integer.parseInt(st.nextToken());
        N = Integer.parseInt(st.nextToken());
        int[] arr = new int[N];

        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }

        DFS(0, 0, arr);

        System.out.println(result);
    }
}
