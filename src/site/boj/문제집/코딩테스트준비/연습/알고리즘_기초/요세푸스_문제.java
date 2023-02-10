package site.boj.문제집.코딩테스트준비.연습.알고리즘_기초;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class 요세푸스_문제 {
    static int N;//사람의 수
    static int K;//죽는 순번
    static Queue<Integer> queue = new LinkedList<>();

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();
        N = Integer.parseInt(st.nextToken());
        K = Integer.parseInt(st.nextToken());

        for(int i = 1; i <= N; i++){
            queue.add(i);
        }
        sb.append("<");
        while(queue.size() != 1){

            for(int i = 0; i < K - 1; i++){
                queue.add(queue.poll());
            }
            sb.append(queue.poll());
            sb.append(", ");
        }
        sb.append(queue.poll());
        sb.append(">");
        System.out.println(sb);
    }
}
