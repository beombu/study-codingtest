package site.inflearn.array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class 격자판_최대합 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        int[][] arr = new int[N][N];

        for(int i = 0; i < N; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            for(int j = 0; j < N; j++){
                arr[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        int maxValue = Integer.MIN_VALUE;
        int row = 0;
        int col = 0;

        for(int i = 0; i < N; i++){
            row = 0;
            col = 0;
            for(int j = 0; j < N; j++){
                row += arr[i][j];
                col += arr[j][i];
            }
            maxValue = Math.max(maxValue, row);
            maxValue = Math.max(maxValue, col);
        }

        int diagonal1 = 0;
        int diagonal2 = 0;
        for(int i = 0; i < N; i++){
            diagonal1 += arr[i][i];
            diagonal2 += arr[i][N-i-1];
        }
        maxValue = Math.max(maxValue, diagonal1);
        maxValue = Math.max(maxValue, diagonal2);

        System.out.println(maxValue);
    }
}
