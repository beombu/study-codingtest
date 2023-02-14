package site.programmers.codingKit.hash;

import java.util.HashMap;

public class 완주하지_못한_선수 {
    public String solution(String[] participant, String[] completion) {
        String answer = "";

        HashMap<String, Integer> hashMap = new HashMap<>();

        for(String str : participant){
            hashMap.put(str, hashMap.getOrDefault(str, 0) + 1);
        }

        for(String str : completion){
            if(hashMap.containsKey(str)){
                if(hashMap.get(str) != 1){
                    hashMap.put(str, hashMap.get(str) - 1);
                }else{
                    hashMap.remove(str);
                }
            }
        }

        for(String str : hashMap.keySet()){
            answer = str;
        }

        return answer;
    }
}
