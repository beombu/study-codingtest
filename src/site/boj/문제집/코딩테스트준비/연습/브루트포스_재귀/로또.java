package site.boj.문제집.코딩테스트준비.연습.브루트포스_재귀;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class 로또 {
    static int[] arr;
    static boolean[] visited;
    static int k;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        while (true) {
            st = new StringTokenizer(br.readLine());
            k = Integer.parseInt(st.nextToken());

            if (k == 0) {
                break;
            }
            arr = new int[k];
            visited = new boolean[k];

            for (int i = 0; i < k; i++) {
                arr[i] = Integer.parseInt(st.nextToken());
            }

            DFS(0, 0);
            System.out.println();
        }
    }

    public static void DFS(int start, int depth) {
        if (depth == 6) {//6개의 숫자가 다 들어온 경우
            print();
        }

        for (int i = start; i < k; i++) {
            visited[i] = true;
            DFS(i + 1, depth + 1);
            visited[i] = false;
        }
    }

    private static void print() {
        for (int i = 0; i < k; i++) {
            if (visited[i]) {
                System.out.print(arr[i] + " ");
            }
        }
        System.out.println();
    }
}
