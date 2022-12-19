package site.inflearn.sort_search;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;
import java.util.StringTokenizer;

public class 중복_확인 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String result = "U";

        int N = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        Set<Integer> set = new HashSet<>();

        for(int i = 0; i < N; i++){
            set.add(Integer.parseInt(st.nextToken()));
        }

        if(set.size() != N){
            result = "D";
        }

        System.out.println(result);
    }
}
