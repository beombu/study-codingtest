package site.inflearn.stack_queue;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class 공주_구하기 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());//왕자 수
        int K = Integer.parseInt(st.nextToken());//특정 숫자
        Queue<Integer> queue = new LinkedList<>();
        int startNum = 1;
        Integer result = 0;

        for(int i = 1; i <= N; i++){
            queue.offer(i);
        }

        while(!queue.isEmpty()){
            if(isContainNum(K,startNum)){//특정 숫자라면
                result = queue.poll();
            }else{
                queue.offer(queue.poll());
            }
            startNum++;
        }

        System.out.println(result);
    }

    private static boolean isContainNum(int K, int num){
        for(char ch : String.valueOf(num).toCharArray()){
            if((char) K == ch){
                return true;
            }
        }

        return false;
    }
}
