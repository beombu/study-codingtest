package site.inflearn.hashMap_hashSet;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;

public class 아나그램 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        HashMap<Character, Integer> hashMap = new HashMap<>();
        String result = "YES";

        for(char a : br.readLine().toCharArray()){
            hashMap.put(a, hashMap.getOrDefault(a, 0) + 1);
        }

        for(char a : br.readLine().toCharArray()){
            if(!hashMap.containsKey(a) || hashMap.get(a) == 0){
                result = "NO";
                break;
            }
            hashMap.put(a, hashMap.get(a) - 1);
        }

        System.out.println(result);
    }
}
