package site.inflearn.array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class 점수계산 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        int N = Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine());
        int score = 0;
        int cnt = 1;

        for(int i = 0; i < N; i++){
            String checkExam = st.nextToken();

            if(checkExam.equals("1")){
                score += cnt;
                cnt++;
            }else if(checkExam.equals("0")){
                cnt = 1;
            }
        }

        System.out.println(score);
    }
}
