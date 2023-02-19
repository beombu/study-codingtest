package site.boj.문제집.알고리즘_기초.자료구조;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class 오큰수 {
    static int N;
    static List<Integer> A = new ArrayList<>();

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        N = Integer.parseInt(br.readLine());

        StringTokenizer st = new StringTokenizer(br.readLine());

        for (int i = 0; i < N; i++) {
            A.add(Integer.parseInt(st.nextToken()));
        }

        for (int i = 0; i < A.size(); i++) {
            int now = A.get(i);//현재 숫자
            int rightLargeNum = 0;
            int idx = i;

            while(now > rightLargeNum){
                if(idx == A.size() - 1){
                    rightLargeNum = -1;
                    break;
                }

                rightLargeNum = A.get(++idx);
            }

            sb.append(rightLargeNum).append(" ");
        }

        System.out.println(sb);
    }
}
