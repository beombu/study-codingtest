package site.inflearn.DFS_BFS;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

class Node {
    private int x;
    private int y;

    public Node(int x, int y) {
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

public class 미로의_최단거리_통로 {
    static int row;
    static int col;
    static int[][] board;
    static int[][] dis;
    static boolean[][] visited;
    static Queue<Node> queue = new LinkedList<>();
    static int[] dx = {1, 0, 0, -1};
    static int[] dy = {0, 1, -1, 0};

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        col = 7;
        row = 7;
        board = new int[col][row];
        visited = new boolean[col][row];
        dis = new int[col][row];

        for (int i = 0; i < col; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < row; j++) {
                board[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        BFS(0, 0);
        if (dis[6][6] == 0) {
            System.out.println(-1);
        } else {
            System.out.println(dis[6][6]);
        }
    }

    public static void BFS(int startX, int startY) {
        visited[startX][startY] = true;
        queue.add(new Node(startX, startY));

        while (!queue.isEmpty()) {
            Node tmp = queue.poll();

            for (int i = 0; i < 4; i++) {
                int nx = tmp.getX() + dx[i];
                int ny = tmp.getY() + dy[i];

                if (nx >= 0 && nx <= 6 && ny >= 0 && ny <= 6 && board[nx][ny] == 0) {
                    if (!visited[nx][ny]) {
                        visited[nx][ny] = true;
                        queue.add(new Node(nx, ny));
                        dis[nx][ny] = dis[tmp.getX()][tmp.getY()] + 1;
                    }
                }
            }
        }
    }
}
