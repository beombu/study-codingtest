package site.inflearn.Recursive_Tree_Graph;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;

public class 경로탐색_인접행렬 {
    static int[][] graph;
    static boolean[] checked;
    static int N;
    static int answer = 0;
    static Stack<Integer> stack = new Stack<>();

    public static void DFS(int v){
        if(v == N){
            answer++;
        }else{
            for(int i = 1; i <= N; i++){
                if(graph[v][i] == 1 && !checked[i]){
                    checked[i] = true;
                    DFS(i);
                    checked[i] = false;
                }
            }
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());

        N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        graph = new int[N + 1][N + 1];
        checked = new boolean[N + 1];

        for (int i = 0; i < M; i++) {
            st = new StringTokenizer(br.readLine());
            int startVertex = Integer.parseInt(st.nextToken());
            int endVertex = Integer.parseInt(st.nextToken());

            graph[startVertex][endVertex] = 1;
        }

        checked[1] = true;
        stack.push(1);

//        while (!stack.isEmpty()) {
//            int v = stack.pop();
//
//            for(int i = 1; i <= N; i++){
//                int linkedNode = graph[v][i];
//
//                if(!checked[linkedNode]){
//                    stack.push(linkedNode);
//                    checked[linkedNode] = true;
//                }
//            }
//        }

        DFS(1);

        System.out.println(answer);

    }
}
