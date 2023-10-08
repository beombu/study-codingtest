package site.boj.문제집.gitTonyWorkbook;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

public class 카드_2 {
    public static void main(String[] args) throws IOException {
        Queue<Integer> deque = new LinkedList<>();

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        for (int i = 1; i <= N; i++) {
            deque.add(i);
        }

        while (deque.size() != 1) {
            deque.poll();
            deque.add(deque.poll());
        }

        System.out.println(deque.peek());
    }
}
