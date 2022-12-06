package site.inflearn.array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class 멘토링 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());//학생 수
        int M = Integer.parseInt(st.nextToken());//시험 횟수
        int result = 0;

        int[][] examRank = new int[M][N];

        for(int i = 0; i < M; i++){
            st = new StringTokenizer(br.readLine());
            for(int j = 0; j < N; j++){
                examRank[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        for(int i = 1; i <= N; i++){//멘토
            for(int j = 1; j <= N; j++){//멘티
                if(i == j){
                    continue;
                }

                int count = 0;
                int mentor = 0;
                int mentee = 0;

                for(int k = 0; k < M; k++){//k번째 시험
                    for(int z = 0; z < N; z++){//등수
                        if(examRank[k][z] == i){
                            mentee = z;
                        }
                        if(examRank[k][z] == j){
                            mentor = z;
                        }
                    }

                    if(mentor < mentee){
                        count++;
                    }
                }

                if(count == M){
                    result++;
                }
            }
        }

        System.out.println(result);

    }
}
