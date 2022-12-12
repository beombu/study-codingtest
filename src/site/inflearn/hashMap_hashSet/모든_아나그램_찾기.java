package site.inflearn.hashMap_hashSet;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;

public class 모든_아나그램_찾기 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        HashMap<Character, Integer> hashMap1 = new HashMap<>();
        HashMap<Character, Integer> hashMap2 = new HashMap<>();
        int result = 0;

        String str1 = br.readLine();
        String str2 = br.readLine();

        for(char a : str2.toCharArray()){
            hashMap2.put(a, hashMap2.getOrDefault(a, 0) + 1);
        }

        for(int i = 0; i < str2.length(); i++){
            hashMap1.put(str1.charAt(i), hashMap1.getOrDefault(str1.charAt(i), 0)+1);
        }

        if(hashMap1.equals(hashMap2)){
            result++;
        }

        int start = 0;
        for(int end = str2.length(); end < str1.length(); end++){
            hashMap1.put(str1.charAt(end), hashMap1.getOrDefault(str1.charAt(end), 0) + 1);
            hashMap1.put(str1.charAt(start), hashMap1.get(str1.charAt(start)) - 1);
            if(hashMap1.get(str1.charAt(start)) == 0){
                hashMap1.remove(str1.charAt(start));
            }
            if(hashMap1.equals(hashMap2)){
                result++;
            }
            start++;
        }

        System.out.println(result);
    }
}
