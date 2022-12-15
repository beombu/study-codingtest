package site.inflearn.stack_queue;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

public class 교육과정_설계 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String requiredSubject = br.readLine();
        String subject = br.readLine();
        String result = "YES";
        Queue<Character> queue = new LinkedList<>();

        for(char ch : requiredSubject.toCharArray()){
            queue.offer(ch);
        }

        for (Character ch : subject.toCharArray()) {
            /* 순서를 어길 경우 */
            if(queue.contains(ch) && queue.peek() != ch){
                result = "NO";
                break;
            }/* 필수과목과 순서가 일치한 경우 */
            else if(queue.peek() == ch){
                queue.poll();
            }
        }

        /* 만일 필수과목을 모두 이수하지 않은 경우 */
        if(!queue.isEmpty()){
            result = "NO";
        }

        System.out.println(result);
    }
}
