package site.inflearn.twoPointer_slidingWindow;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class 최대_길이_연속부분수열 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());
        int[] arr = new int[N];

        st = new StringTokenizer(br.readLine());
        for(int i = 0; i < N; i++){
            arr[i] = Integer.parseInt(st.nextToken());
        }

        int maxLength = twoPointer(N, K, arr);

        System.out.println(maxLength);
    }

    private static int twoPointer(int N, int K, int[] arr) {
        int p1 = 0;
        int p2 = 0;
        int zeroCnt = 0;
        int maxLength = Integer.MIN_VALUE;

        while(p2 < N){
            if(zeroCnt <= K){
                if(arr[p2++] == 0){
                    zeroCnt++;
                }

                if(zeroCnt == K){
                    maxLength = Math.max(maxLength, p2 - p1);
                }

            }else{
                if(arr[p1++] == 0){
                    zeroCnt--;
                }

                if(zeroCnt == K){
                    maxLength = Math.max(maxLength, p2 - p1);
                }
            }
        }
        return maxLength;
    }
}
