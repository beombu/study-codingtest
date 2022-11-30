package site.inflearn.String;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class 문자_찾기 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String str = br.readLine();
        char findStr = br.readLine().charAt(0);


        int cnt = findChar(str, findStr);

        System.out.println(cnt);
    }

    private static int findChar(String str, char findStr) {
        int cnt = 0;
        for(int i = 0; i < str.length(); i++){
            char ch = str.charAt(i);

            if(Character.toLowerCase(ch) == findStr || Character.toUpperCase(ch) == findStr){
                cnt++;
            }
        }
        return cnt;
    }
}
