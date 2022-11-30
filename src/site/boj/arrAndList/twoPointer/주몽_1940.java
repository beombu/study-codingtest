package site.boj.arrAndList.twoPointer;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class 주몽_1940 {
    public static int N;
    public static int M;
    public static int[] arr;
    public static int cnt;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        N = Integer.parseInt(br.readLine());
        M = Integer.parseInt(br.readLine());
        arr = new int[N];

        st = new StringTokenizer(br.readLine(), " ");

        for(int i = 0 ; i < arr.length; i++){
            arr[i] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(arr);

        twoPointer();

        System.out.println(cnt);
    }

    private static void twoPointer() {
        int l = 0;
        int r = arr.length - 1;

        while(l < r){
            int sum = arr[l] + arr[r];

            if(sum == M){
                cnt++;
            }

            if(sum >= M){
                r--;
            }else if(sum < M){
                l++;
            }
        }
    }
}
