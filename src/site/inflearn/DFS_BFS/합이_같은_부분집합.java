package site.inflearn.DFS_BFS;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class 합이_같은_부분집합 {
    static String answer = "NO";
    static int N;
    static int total = 0;
    static boolean flag = false;

    public static void DFS(int idx, int sum, int[] arr) {
        if (flag) {
            return;
        }

        if (sum > total / 2) {
            return;
        }

        if (idx == N) {
            if ((total - sum) == sum) {
                answer = "YES";
                flag = true;
            }
        } else {
            //해당 원소를 포함하는 경우
            DFS(idx+1, sum + arr[idx], arr);

            //해당 원소를 포함하지 않는 경우
            DFS(idx+1, sum, arr);
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());

        int[] arr = new int[N];

        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
            total += arr[i];
        }

        DFS(0, 0, arr);
        System.out.println(answer);
    }
}
