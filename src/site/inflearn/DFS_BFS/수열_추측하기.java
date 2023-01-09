package site.inflearn.DFS_BFS;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class 수열_추측하기 {
    static int N;
    static int F;
    static boolean flag;
    static int[] arr;
    static boolean[] visited;
    static int[] output;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        N = Integer.parseInt(st.nextToken());//윗줄의 숫자의 갯수
        F = Integer.parseInt(st.nextToken());//결과 수

        arr = new int[N];
        visited = new boolean[N];
        output = new int[N];

        for (int i = 0; i < N; i++) {
            arr[i] = i + 1;
        }

        int depth = 0;
        dfs(depth, N, N);

        for (int i = 0; i < N; i++) {
            System.out.print(output[i] + " ");
        }
    }

    static void dfs(int depth, int N, int R) {
        if (depth == R) {
            if (isAnswer(output)) {
                flag = true;
                return;
            }
        }

        for (int i = 0; i < N; i++) {
            if (flag) {
                return;
            }

            if (!visited[i]) {
                visited[i] = true;
                output[depth] = arr[i];
                dfs(depth + 1, N, R);
                visited[i] = false;
            }
        }
    }

    static boolean isAnswer(int[] tmp) {
        int[] ch = tmp.clone();
        for (int j = ch.length - 1; j > 0; j--) {
            for (int i = 0; i < j; i++) {
                ch[i] = ch[i] + ch[i + 1];
            }
        }
        return ch[0] == F;
    }
}
