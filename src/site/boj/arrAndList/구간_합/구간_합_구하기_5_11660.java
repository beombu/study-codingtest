package site.boj.arrAndList.구간_합;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class 구간_합_구하기_5_11660 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        StringBuilder sb = new StringBuilder();

        st = new StringTokenizer(br.readLine(), " ");
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        int[][] sumArr = new int[N + 1][N + 1];
        for(int i = 1; i < sumArr.length; i++){
            st = new StringTokenizer(br.readLine(), " ");
            for(int j = 1; j < sumArr[0].length; j++){
                sumArr[i][j] = sumArr[i][j - 1] + Integer.parseInt(st.nextToken());
            }
        }

        for(int a = 0; a < M; a++){
            st = new StringTokenizer(br.readLine(), " ");
            int sum = 0;
            int x1 = Integer.parseInt(st.nextToken());
            int y1 = Integer.parseInt(st.nextToken());
            int x2 = Integer.parseInt(st.nextToken());
            int y2 = Integer.parseInt(st.nextToken());

            for(int i = x1; i <= x2; i++){
                sum += sumArr[i][y2] - sumArr[i][y1 -1];
            }
            sb.append(sum + "\n");
        }
        System.out.print(sb);
    }
}
