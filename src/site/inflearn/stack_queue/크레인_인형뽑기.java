package site.inflearn.stack_queue;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class 크레인_인형뽑기 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        int N = Integer.parseInt(br.readLine());
        ArrayList<Queue<Integer>> board = new ArrayList<>();
        Stack<Integer> bucket = new Stack<>();
        int resultCnt = 0;

        //배열안에 queue생성
        for(int i = 0; i < N; i++){
            board.add(new LinkedList<>());
        }

        //queue에 값 넣기
        for(int i = 0; i < N; i++){
            st = new StringTokenizer(br.readLine());
            for(int j = 0; j < N; j++){
                int num = Integer.parseInt(st.nextToken());
                if(num == 0){
                    continue;
                }
                board.get(j).add(num);
            }
        }

        int M = Integer.parseInt(br.readLine());
        int[] moves = new int[M];
        st = new StringTokenizer(br.readLine());

        //그냥 보기 편하기 위해 배열에 넣은 것 바로 입력 받으면서 계산해도 상관없음
        for(int i = 0; i < M; i++){
            moves[i] = Integer.parseInt(st.nextToken());
        }

        for(int i = 0; i < M; i++){
            int lineNum = moves[i];//뽑을 번호

            Integer icon = board.get(lineNum - 1).poll();//뽑은 아이콘
            if(icon == null){
                continue;
            }

            if(bucket.isEmpty()){
                bucket.push(icon);
                continue;
            }

            if(icon == bucket.peek()){
                bucket.pop();
                resultCnt += 2;
                continue;
            }

            bucket.push(icon);
        }

        System.out.println(resultCnt);
    }
}
