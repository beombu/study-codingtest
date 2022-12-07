package site.inflearn.twoPointer_slidingWindow;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class 최대_매출 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());//일수
        int K = Integer.parseInt(st.nextToken());//연속된 일수
        int[] arr = new int[N];

        st = new StringTokenizer(br.readLine());
        for(int i = 0; i < N; i++){
            arr[i] = Integer.parseInt(st.nextToken());
        }

        int max = slidingWindow(N, K, arr);

        System.out.println(max);
    }

    private static int slidingWindow(int N, int K, int[] arr) {
        int max = Integer.MIN_VALUE;//초기 비교값
        int sum = 0;//window size가 K인 값의 합
        int idx = 0;//뺄 인덱스

        //초기 window
        for(int i = 0; i < K; i++){
            sum += arr[i];
            max = Math.max(max, sum);
        }

        //sliding window
        for(int i = K; i < N; i++){
            int nextValue = arr[i];
            int preValue = arr[idx];
            sum = sum - preValue + nextValue;

            max = Math.max(max, sum);
            idx++;
        }
        return max;
    }
}
