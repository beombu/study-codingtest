package site.inflearn.array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class 등수구하기 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        int[] score = new int[N];
        int[] rank = new int[N];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i = 0; i < N; i++){
            score[i] = Integer.parseInt(st.nextToken());
        }

        for(int i = 0; i < score.length; i++){
            int cnt = 1;
            for(int j = 0; j < score.length; j++){
                if(score[i] < score[j]){
                    cnt++;
                }
            }
            rank[i] = cnt;
        }

        for(int x : rank){
            System.out.print(x + " ");
        }
    }
}
