package site.boj.문제집.코딩테스트준비.연습.알고리즘_기초;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.List;
import java.util.StringTokenizer;
import java.util.stream.Collectors;

public class 에디터 {
    static List<Character> editor = new LinkedList<>();
    static int cursor;
    static String str = "";

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        str = br.readLine();
        for (Character c : str.toCharArray()) {
            editor.add(c);
        }
        cursor = str.length();

        int test_case = Integer.parseInt(br.readLine());

        for (int i = 0; i < test_case; i++) {
            st = new StringTokenizer(br.readLine());
            String command = st.nextToken();

            adaptCommand(st, command);
        }

        System.out.println(editor.stream()
                .map(String::valueOf)
                .collect(Collectors.joining()));
    }

    private static void adaptCommand(StringTokenizer st, String command) {
        if (command.equals("P")) {
            String s = st.nextToken();
            AddStr(s.charAt(0));
        } else {
            if (command.equals("L")) {
                moveLeft();
            } else if (command.equals("D")) {
                moveRight();
            } else if (command.equals("B")) {
                deleteStr();
            }
        }
    }

    private static void moveLeft() {
        if (cursor == 0) {
            return;
        }
        cursor--;
    }

    private static void moveRight() {
        if (cursor == editor.size()) {
            return;
        }
        cursor++;
    }

    private static void deleteStr() {
        if (cursor == 0) {
            return;
        }

        editor.remove(--cursor);
    }

    private static void AddStr(char ch) {
        editor.add(cursor++, ch);
    }
}
