package site.inflearn.Recursive_Tree_Graph;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class 송아지_찾기 {
    static int[] dis = {1, -1, 5};
    static int[] ch;
    static int result;
    static Queue<Integer> Q = new LinkedList<>();

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());

        int S = Integer.parseInt(st.nextToken());
        int E = Integer.parseInt(st.nextToken());

        result = BFS(S, E);

        System.out.println(result);
    }

    private static int BFS(int S, int E) {
        ch = new int[10001];
        ch[S] = 1;
        Q.offer(S);
        int L = 0;

        while (!Q.isEmpty()) {
            int len = Q.size();
            for (int i = 0; i < len; i++) {
                int x = Q.poll();
                for (int j = 0; j < 3; j++) {
                    int nx = x + dis[j];
                    if (nx == E) {
                        return L + 1;
                    }

                    if (nx >= 1 && nx <= 10000 && ch[nx] == 0) {
                        ch[nx] = 1;
                        Q.offer(nx);
                    }
                }
            }
            L++;
        }
        return 0;
    }
}
