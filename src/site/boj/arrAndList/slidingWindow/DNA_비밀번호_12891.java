package site.boj.arrAndList.slidingWindow;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.StringTokenizer;

public class DNA_비밀번호_12891 {
    public static int S;
    public static int P;
    public static String dna;
    public static char[] dnaArr = {'A', 'C', 'G', 'T'};
    public static HashMap<Character, Integer> dnaMap;
    public static int cnt;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        st = new StringTokenizer(br.readLine());
        S = Integer.parseInt(st.nextToken());//문자열 길이
        P = Integer.parseInt(st.nextToken());//부분 문자열 길이

        dna = br.readLine();
        dnaMap = new HashMap<>();
        st = new StringTokenizer(br.readLine());
        for(int i = 0; i < dnaArr.length; i++){
            int cnt = Integer.parseInt(st.nextToken());
            dnaMap.put(dnaArr[i],cnt);
        }

        //초기 slidingWindow 문자 작업
        for(int i = 0; i < P; i++){
            char ch = dna.charAt(i);//앞 문자
            dnaMap.put(ch, dnaMap.get(ch) - 1);
        }

        if(checkDna()){
            cnt++;
        }

        slidingWindow();

        System.out.println(cnt);
    }

    private static void slidingWindow() {
        for(int i = 0; i < S - P; i++){
            char startChar = dna.charAt(i);
            char endChar = dna.charAt(i + P);
            dnaMap.put(startChar, dnaMap.get(startChar) + 1);
            dnaMap.put(endChar, dnaMap.get(endChar) - 1);
            if(checkDna()){
                cnt++;
            }
        }
    }

    private static boolean checkDna(){
        for (char c : dnaArr) {
            if (dnaMap.get(c) > 0) {
                return false;
            }
        }
        return true;
    }

}
