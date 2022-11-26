package site.boj.arrAndList;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class 숫자의_합_구하기 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        int result = 0;
        String[] a = br.readLine().split("");
        for(int i = 0; i < N; i++){
            result += Integer.parseInt(a[i]);
        }

        System.out.println(result);
    }
}
