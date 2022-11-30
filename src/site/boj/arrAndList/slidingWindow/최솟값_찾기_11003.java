package site.boj.arrAndList.slidingWindow;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Deque;
import java.util.LinkedList;
import java.util.StringTokenizer;

public class 최솟값_찾기_11003 {
    public static int N;
    public static int L;
    public static Deque<Node> deque;
    public static int[] arr;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        StringBuilder sb = new StringBuilder();

        st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        L = Integer.parseInt(st.nextToken());

        arr = new int[N];
        deque = new LinkedList<>();

        st = new StringTokenizer(br.readLine());
        for(int i = 0; i < N; i ++){
            int now = Integer.parseInt(st.nextToken());

            while(!deque.isEmpty() && deque.getLast().getValue() > now){
                deque.pollLast();
            }

            deque.offer(new Node(now, i));

            if(deque.getFirst().getIndex() <= i - L){
                deque.pollFirst();
            }

            sb.append(deque.getFirst().getValue()).append(" ");
        }

        System.out.println(sb);

    }

    static class Node{
        private int value;
        private int index;

        public Node(int value, int index) {
            this.value = value;
            this.index = index;
        }

        public int getValue() {
            return value;
        }

        public int getIndex() {
            return index;
        }
    }

}
