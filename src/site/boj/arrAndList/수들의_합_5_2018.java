package site.boj.arrAndList;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class 수들의_합_5_2018 {
    public static int N;
    public static int cnt;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        N = Integer.parseInt(br.readLine());
        twoPointer();

        System.out.println(cnt);
    }

    private static void twoPointer() {
        int sum = 1;
        int l = 1;
        int r = 1;

        while(l <= r){
            if(sum == N){
                cnt++;
            }

            if(sum < N){
                r++;
                sum += r;
            }else if(sum >= N){
                sum -= l;
                l++;
            }
        }
    }
}
