package site.inflearn.twoPointer_slidingWindow;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class 연속_부분수열 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        int[] arr = new int[N];

        st = new StringTokenizer(br.readLine());
        for(int i = 0; i < N; i++){
            arr[i] = Integer.parseInt(st.nextToken());
        }

        int result = twoPointer(N, M, arr);

        System.out.println(result);
    }

    private static int twoPointer(int N, int M, int[] arr) {
        int p1 = 0;//start
        int p2 = 0;//end
        int sum = 0;
        int result = 0;

        while(p2 < N){
            if(sum > M){//M보다 크다면
                sum -= arr[p1++];
                if(sum == M){
                    result++;
                }
            }else if(sum <= M){//M이 더 크면
                sum += arr[p2++];
                if(sum == M){
                    result++;
                }
            }
        }
        return result;
    }
}
