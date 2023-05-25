package site.boj.문제집.코딩테스트준비.기초.수학;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class _1 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s;

        while ((s = br.readLine()) != null) {
            int n = Integer.parseInt(s);
            int num = 0;

            for (int i = 1; ; i++) {
                num = (num * 10) + 1;
                num = num % n;

                if (num == 0) {
                    System.out.println(i);
                    break;
                }
            }
        }
    }
}
