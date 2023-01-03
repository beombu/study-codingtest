package site.inflearn.Recursive_Tree_Graph;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class 그래프_최단거리 {
    static int N;
    static int M;
    static ArrayList<ArrayList<Integer>> graph;
    static boolean[] checked;
    static int[] dis;

    public static void BFS(int root) {
        checked[root] = true;
        dis[root] = 0;
        Queue<Integer> queue = new LinkedList<>();

        queue.add(root);

        while (!queue.isEmpty()) {
            int cv = queue.poll();
            for (int nv : graph.get(cv)) {
                if(!checked[nv]){
                    checked[nv] = true;
                    queue.add(nv);
                    dis[nv] = dis[cv] + 1;
                }
            }
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());

        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        graph = new ArrayList<ArrayList<Integer>>();

        for (int i = 0; i <= N; i++) {
            graph.add(new ArrayList<>());
        }
        checked = new boolean[N + 1];
        dis = new int[N + 1];

        for (int i = 0; i < M; i++) {
            st = new StringTokenizer(br.readLine());
            int startVertex = Integer.parseInt(st.nextToken());
            int endVertex = Integer.parseInt(st.nextToken());

            graph.get(startVertex).add(endVertex);
        }

        BFS(1);
        for (int i = 2; i <= N; i++) {
            System.out.println(i + " : " + dis[i]);
        }

    }
}
