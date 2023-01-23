package site.boj.문제집.코딩테스트준비.연습.알고리즘_기초;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class 단어_뒤집기 {
    static int T;


    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuilder sb;//전체 문장을 저장
        StringBuilder sb2;//단어만 저장

        T = Integer.parseInt(st.nextToken());

        for (int i = 0; i < T; i++) {
            st = new StringTokenizer(br.readLine());
            sb = new StringBuilder();

            while(st.hasMoreTokens()){
                sb2 = new StringBuilder();
                sb2.append(st.nextToken()).reverse();
                sb.append(sb2).append(" ");
            }
            System.out.println(sb);
        }
    }
}
