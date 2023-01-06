package site.inflearn.DFS_BFS;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class 조합의_경우의_수 {
    static int[][] dy = new int[35][35];

    static int DFS(int n, int r) {
        if (dy[n][r] > 0) {
            return dy[n][r];
        }

        if (n == r || r == 0) {
            return 1;
        } else {
            return dy[n][r] = DFS(n - 1, r - 1) + DFS(n - 1, r);
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());//자연수의 갯수
        int r = Integer.parseInt(st.nextToken());//조합하는 수의 갯수

        System.out.println(DFS(n, r));
    }
}
