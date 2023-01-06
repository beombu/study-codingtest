package site.inflearn.DFS_BFS;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Collections;
import java.util.StringTokenizer;

public class 동전교환 {
    static int N;
    static Integer[] arr;
    static int M;
    static int result = Integer.MAX_VALUE;

    //coinNum : 레벨
    //sum : 동전의 값의 합
    public static void DFS(int coinNum, int sum) {
        if (sum > M) {
            return;
        }

        if (coinNum >= result) {
            return;
        }

        if (sum == M) {
            result = Math.min(result, coinNum);
        } else {
            for (int i = 0; i < arr.length; i++) {
                DFS(coinNum + 1, sum + arr[i]);
            }
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());
        arr = new Integer[N];
        StringTokenizer st = new StringTokenizer(br.readLine());

        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }
        Arrays.sort(arr, Collections.reverseOrder());

        M = Integer.parseInt(br.readLine());
        DFS(0, 0);

        System.out.println(result);
    }
}
