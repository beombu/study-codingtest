package site.inflearn.Recursive_Tree_Graph;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class 피보나치_수열 {
    static int[] memoization;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        memoization = new int[N + 1];

        fibo(N);
        for (int i = 1; i <= N; i++) {
            System.out.print(memoization[i] + " ");
        }


    }

    public static int fibo(int N){
        if(memoization[N] > 0){
            return memoization[N];
        }

        if(N == 1){
            return memoization[N] = 1;
        } else if (N == 2) {
            return memoization[N] = 1;
        } else {
            return memoization[N] = fibo(N - 2) + fibo(N - 1);
        }
    }
}
