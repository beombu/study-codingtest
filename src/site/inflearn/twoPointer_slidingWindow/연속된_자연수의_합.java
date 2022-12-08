package site.inflearn.twoPointer_slidingWindow;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class 연속된_자연수의_합 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        int result = twoPointer(N);

        System.out.println(result);
    }

    private static int twoPointer(int N) {
        int p1 = 0;
        int p2 = 0;
        int M = N / 2;
        int sum = 0;
        int result = 0;

        while (p1 <= M) {
            if (sum <= N) {//N이 sum보다 크면
                sum += p2++;
                if (sum == N) {
                    result++;
                }
            } else if (sum > N) {//N보다 sum이 크면
                sum -= p1++;
                if (sum == N) {
                    result++;
                }
            }
        }
        return result;
    }
}
