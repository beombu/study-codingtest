package site.inflearn.DFS_BFS;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class 조합_구하기 {
    static int N;
    static int M;
    static int[] combi;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());

        combi = new int[M];
        DFS(0, 1);
    }

    public static void DFS(int level, int startNum) {
        if (level == M) {
            for (int x : combi) {
                System.out.print(x + " ");
            }
            System.out.println();
        } else {
            for (int i = startNum; i <= N; i++) {
                combi[level] = i;
                DFS(level + 1, i + 1);
            }
        }
    }
}
