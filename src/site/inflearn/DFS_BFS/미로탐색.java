package site.inflearn.DFS_BFS;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class 미로탐색 {
    static int[][] arr = new int[7][7];
    static boolean[][] visited = new boolean[7][7];
    static int[] dx = {1, 0, 0, -1};
    static int[] dy = {0, 1, -1, 0};
    static int answer = 0;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        for (int i = 0; i < 7; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < 7; j++) {
                arr[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        visited[0][0] = true;
        DFS(0, 0);
        System.out.println(answer);
    }

    public static void DFS(int startX, int startY) {
        if (startX == 6 && startY == 6) {
            answer++;
        } else {
            for (int i = 0; i < 4; i++) {
                int nx = startX + dx[i];
                int ny = startY + dy[i];
                if (nx >= 0 && nx <= 6 && ny >= 0 && ny <= 6 && arr[nx][ny] == 0) {
                    if(!visited[nx][ny]){
                        visited[nx][ny] = true;
                        DFS(nx, ny);
                        visited[nx][ny] = false;
                    }
                }
            }
        }
    }
}
