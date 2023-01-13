package site.inflearn.DFS_BFS;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

class Point {
    private int x;
    private int y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }
}

public class 토마토 {
    static int[] dx = {1, 0, 0, -1};
    static int[] dy = {0, 1, -1, 0};
    static int row;
    static int col;
    static int[][] board, dis;
    static Queue<Point> queue = new LinkedList<>();

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        row = Integer.parseInt(st.nextToken());
        col = Integer.parseInt(st.nextToken());
        board = new int[col][row];
        dis = new int[col][row];

        for (int i = 0; i < col; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < row; j++) {
                board[i][j] = Integer.parseInt(st.nextToken());

                if (board[i][j] == 1) {
                    queue.add(new Point(i, j));
                }
            }
        }
        BFS();
        System.out.println(checkRipe());

    }

    private static int BFS() {
        while (!queue.isEmpty()) {
            Point tmp = queue.poll();

            for (int i = 0; i < 4; i++) {
                int nx = tmp.getX() + dx[i];
                int ny = tmp.getY() + dy[i];

                if (nx >= 0 && nx < col && ny >= 0 && ny < row && board[nx][ny] == 0) {
                    board[nx][ny] = 1;
                    queue.add(new Point(nx, ny));
                    dis[nx][ny] = dis[tmp.getX()][tmp.getY()] + 1;
                }
            }
        }

        int result = Integer.MIN_VALUE;

        for (int i = 0; i < col; i++) {
            for (int j = 0; j < row; j++) {
                if (board[i][j] == 0) {
                    return -1;
                }

                result = Math.max(result, board[i][j]);
            }
        }

        if (result == 1) {
            return 0;
        } else {
            return result - 1;
        }
    }


    private static int checkRipe() {
        int answer = Integer.MIN_VALUE;

        for (int i = 0; i < col; i++) {
            for (int j = 0; j < row; j++) {
                if (board[i][j] == 0) {
                    return -1;
                }
                answer = Math.max(answer, dis[i][j]);
            }
        }

        if(answer == 1){
            return 0;
        }else{
            return answer;
        }
    }
}
