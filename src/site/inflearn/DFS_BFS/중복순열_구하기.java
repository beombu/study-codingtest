package site.inflearn.DFS_BFS;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class 중복순열_구하기 {
    static int N;
    static int M;
    static int[] pm;

    public static void DFS(int L) {
        if (L == M) {
            for (int a : pm) {
                System.out.print(a + " ");
            }
        } else {
            for (int i = 1; i <= N; i++) {
                pm[L] = i;
                DFS(L + 1);
            }
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        pm = new int[M];

        DFS(0);
    }
}
