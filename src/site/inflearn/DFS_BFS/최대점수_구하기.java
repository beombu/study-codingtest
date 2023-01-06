package site.inflearn.DFS_BFS;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

class Problem{
    private int score;
    private int time;

    public Problem(int score, int time) {
        this.score = score;
        this.time = time;
    }

    public int getScore() {
        return score;
    }

    public int getTime() {
        return time;
    }
}

public class 최대점수_구하기 {
    static int M;
    static int result = 0;

    public static void DFS(int idx, int timeSum, int scoreSum, ArrayList<Problem> arrayList){
        if(timeSum > M){
            return;
        }

        if(idx == arrayList.size()){
            result = Math.max(result, scoreSum);
        }else{
            DFS(idx + 1, timeSum + arrayList.get(idx).getTime(), scoreSum + arrayList.get(idx).getScore(), arrayList);
            DFS(idx + 1, timeSum, scoreSum, arrayList);
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());//문제의 갯수
        M = Integer.parseInt(st.nextToken());//제한 시간
        ArrayList<Problem> arrayList = new ArrayList<>();

        for(int i = 0; i < N; i++){
            st = new StringTokenizer(br.readLine());
            int s = Integer.parseInt(st.nextToken());
            int t = Integer.parseInt(st.nextToken());

            arrayList.add(new Problem(s, t));
        }

        DFS(0, 0, 0, arrayList);

        System.out.println(result);
    }
}
