package site.boj.문제집.gitTonyWorkbook;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class 큐_2 {
    public static int[] queue = new int[2000001];
    public static int start = 0;
    public static int end = 0;


    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        StringBuilder sb = new StringBuilder();

        int T = Integer.parseInt(br.readLine());

        for (int i = 0; i < T; i++) {
            st = new StringTokenizer(br.readLine());
            String command = st.nextToken();

            if (command.equals("push")) {
                int X = Integer.parseInt(st.nextToken());
                push(X);
            } else if (command.equals("pop")) {
                sb.append(pop()).append("\n");
            } else if (command.equals("size")) {
                sb.append(size()).append("\n");
            } else if (command.equals("empty")) {
                sb.append(empty()).append("\n");
            } else if (command.equals("front")) {
                sb.append(front()).append("\n");
            } else if (command.equals("back")) {
                sb.append(back()).append("\n");
            }
        }

        System.out.println(sb);
    }

    public static void push(int X) {
        queue[end++] = X;
    }

    public static int pop() {
        if (end - start == 0) {
            return -1;
        }

        return queue[start++];
    }

    public static int size() {
        return end - start;
    }

    public static int empty() {
        return end - start == 0 ? 1 : 0;
    }

    public static int front() {
        if (end - start == 0) {
            return -1;
        }

        return queue[start];
    }

    public static int back() {
        if(end - start == 0) {
            return -1;
        }

        return queue[end - 1];
    }
}
