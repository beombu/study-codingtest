package site.boj.문제집.코딩테스트준비.연습.알고리즘_기초;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.StringTokenizer;

public class 덱 {
    static Deque<Integer> dq = new ArrayDeque<>();

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        int N = Integer.parseInt(br.readLine());

        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            String command = st.nextToken();

            if(command.equals("push_front")){
                push_front(Integer.parseInt(st.nextToken()));
            }else if(command.equals("push_back")){
                push_back(Integer.parseInt(st.nextToken()));
            }else if(command.equals("pop_front")){
                System.out.println(pop_front());
            }else if(command.equals("pop_back")){
                System.out.println(pop_back());
            }else if(command.equals("size")){
                System.out.println(dq.size());
            }else if(command.equals("empty")){
                System.out.println(empty());
            }else if(command.equals("front")){
                System.out.println(front());
            }else if(command.equals("back")){
                System.out.println(back());
            }
        }
    }

    private static void push_front(int X){
        dq.addFirst(X);
    }

    private static void push_back(int X){
        dq.addLast(X);
    }

    private static int pop_front() {
        if(dq.size() < 1){
           return -1;
        }

        return dq.pollFirst();
    }

    private static int pop_back() {
        if(dq.size() < 1){
           return -1;
        }

        return dq.pollLast();
    }

    private static int empty() {
        if(dq.size() < 1){
           return 1;
        }

        return 0;
    }
    
    private static int front() {
        if(dq.size() < 1){
           return -1;
        }

        return dq.peekFirst();
    }
    
    private static int back() {
        if(dq.size() < 1){
           return -1;
        }

        return dq.peekLast();
    }
}
