package site.inflearn.hashMap_hashSet;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class 학급_회장 {
    public static final char[] CANDIDACY = { 'A', 'B', 'C', 'D', 'E'};
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        HashMap<Character, Integer> hashMap = new HashMap<>();

        for(char a : CANDIDACY){//초기화
            hashMap.put(a, 0);
        }

        int N = Integer.parseInt(br.readLine());
        String str = br.readLine();
        for(int i = 0; i < N; i++){
            char sign = str.charAt(i);
            hashMap.put(sign, hashMap.getOrDefault(sign,0) + 1);
        }
        int max = Integer.MIN_VALUE;
        char result = '0';

        for(Map.Entry<Character, Integer> entry : hashMap.entrySet()){
            if(max < entry.getValue()){
                max = entry.getValue();
                result = entry.getKey();
            }
        }

        System.out.println(result);
    }
}
