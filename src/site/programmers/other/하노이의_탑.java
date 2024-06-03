package site.programmers.other;

import java.util.ArrayList;

public class 하노이의_탑 {
    public static ArrayList<int[]> arr = new ArrayList<>();

//    public static void main(String[] args) {
//        int[][] print = solution(3);
//
//        for (int i = 0; i < print.length; i++) {
//            for(int j = 0; j < print[i].length; j++) {
//                System.out.print(print[i][j] + ", ");
//            }
//
//            System.out.println();
//        }
//    }

    public static int[][] solution(int n) {
        hanoi(n, 1, 3, 2);
        int[][] answer = convertArrayListToArray(arr);

        return answer;
    }

    public static void move(int start, int to) {
        int[] history = new int[]{start, to};
        arr.add(history);
    }

    public static void hanoi(int n, int start, int to, int via) {
        if (n == 1) {
            move(start, to);
        } else {
            hanoi(n - 1, start, via, to);
            move(start, to);
            hanoi(n - 1, via, to, start);
        }
    }

    public static int[][] convertArrayListToArray(ArrayList<int[]> list) {
        int[][] array = new int[list.size()][];

        for (int i = 0; i < list.size(); i++) {
            array[i] = list.get(i);
        }

        return array;
    }
}
