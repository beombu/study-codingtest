package site.boj.arrAndList.twoPointer;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

//풀이 링크 : https://komas.tistory.com/75
public class 좋다_1253 {
    public static int N;
    public static int[] arr;
    public static int cnt;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        N = Integer.parseInt(br.readLine());

        arr = new int[N];

        st = new StringTokenizer(br.readLine(), " ");
        for(int i = 0; i < N; i++){
            arr[i] = Integer.parseInt(st.nextToken());
        }
        Arrays.sort(arr);

        for(int k = 0; k < N; k++){
            int find = arr[k];
            int l = 0;
            int r = N - 1;
            while(l < r){
                int sum = arr[l] + arr[r];

                if(sum == find){
                    cnt++;
                }

                if(sum > find){
                    r--;
                }else if(sum <= find){
                    l++;
                }
            }
        }
    }
}
