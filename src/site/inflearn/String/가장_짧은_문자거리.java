package site.inflearn.String;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class 가장_짧은_문자거리 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        String s = st.nextToken();
        int[] result = new int[s.length()];

        char t = st.nextToken().charAt(0);
        int tIdx = 101;
        for(int i = 0; i < s.length(); i++){
            if(s.charAt(i) == t){
                tIdx = i;
                result[i] = 0;
            }else{
                result[i] = Math.abs(tIdx - i);
            }
        }

        for(int i = s.length() -1; i >= 0; i--){
            if(result[i] == 0){
                tIdx = i;
            }else{
                if(result[i] > Math.abs(tIdx - i)){
                    result[i] = Math.abs(tIdx - i);
                }
            }
        }

        for(int i : result){
            System.out.print(i + " ");
        }
    }
}
