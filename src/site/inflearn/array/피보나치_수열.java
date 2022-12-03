package site.inflearn.array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class 피보나치_수열 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int N = Integer.parseInt(br.readLine());
        int[] result = new int[N];
        for(int i = 0; i < N; i++){
            result[i] = fibo(i);
            sb.append(result[i]).append(" ");
        }

        System.out.println(sb);
    }

    public static int fibo(int N){
        if(N == 0){
            return 1;
        }

        if(N < 2){
            return N;
        }
        return fibo(N - 1) + fibo(N - 2);
    }
}
