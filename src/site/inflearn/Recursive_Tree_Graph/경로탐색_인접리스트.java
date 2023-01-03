package site.inflearn.Recursive_Tree_Graph;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class 경로탐색_인접리스트 {
    static ArrayList<ArrayList<Integer>> graph;
    static boolean[] checked;
    static int N;
    static int answer = 0;

    public static void DFS(int v){
        if(v == N){
            answer++;
        }else{
            for(int nv : graph.get(v)){
                if(!checked[nv]){
                    checked[nv] = true;
                    DFS(nv);
                    checked[nv] = false;
                }
            }
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());

        N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        graph = new ArrayList<ArrayList<Integer>>();
        checked = new boolean[N + 1];

        for (int i = 0; i <= N; i++) {
            graph.add(new ArrayList<>());
        }

        for(int i = 0; i < M; i++){
            st = new StringTokenizer(br.readLine());
            int startVertex = Integer.parseInt(st.nextToken());
            int endVertex = Integer.parseInt(st.nextToken());

            graph.get(startVertex).add(endVertex);
        }

        checked[1] = true;
        DFS(1);

        System.out.println(answer);
    }
}
