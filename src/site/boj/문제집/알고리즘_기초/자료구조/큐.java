package site.boj.문제집.알고리즘_기초.자료구조;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class 큐 {
    static int[] queue = new int[10001];
    static int lastIndex = 0;
    static int firstIndex = 0;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        int N = Integer.parseInt(br.readLine());

        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            String command = st.nextToken();

            if (command.equals("push")) {
                int X = Integer.parseInt(st.nextToken());
                push(X);
            } else if (command.equals("pop")) {
                pop();
            } else if (command.equals("size")) {
                size();
            } else if (command.equals("empty")) {
                empty();
            } else if (command.equals("front")) {
                front();
            } else if (command.equals("back")) {
                back();
            }
        }
    }

    private static void push(int X) {
        queue[lastIndex++] = X;
    }

    private static void pop() {
        if (firstIndex == lastIndex) {
            System.out.println(-1);
        } else {
            System.out.println(queue[firstIndex++]);
        }
    }

    private static void size() {
        System.out.println(lastIndex - firstIndex);
    }

    private static void empty() {
        if (lastIndex - firstIndex == 0) {
            System.out.println(1);
        } else {
            System.out.println(0);
        }
    }

    private static void front() {
        if (firstIndex == lastIndex) {
            System.out.println(-1);
        } else {
            System.out.println(queue[firstIndex]);
        }
    }

    private static void back() {
        if (firstIndex == lastIndex) {
            System.out.println(-1);
        } else {
            System.out.println(queue[lastIndex - 1]);
        }
    }
}
