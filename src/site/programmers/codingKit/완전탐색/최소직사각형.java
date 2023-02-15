package site.programmers.codingKit.완전탐색;

public class 최소직사각형 {
    public int solution(int[][] sizes) {
        int x = 0;
        int y = 0;

        for (int i = 0; i < sizes.length; i++) {
            int max = Math.max(sizes[i][0], sizes[i][1]);
            int min = Math.min(sizes[i][0], sizes[i][1]);

            x = Math.max(x, max);
            y = Math.max(y, min);
        }

        return x * y;
    }
}
