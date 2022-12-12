package site.inflearn.hashMap_hashSet;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class 매출액의_종류 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();

        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());
        int[] arr = new int[N];
        ArrayList<Integer> result = new ArrayList<>();
        HashMap<Integer, Integer> hashMap = new HashMap<>();
        st = new StringTokenizer(br.readLine());

        for(int i = 0; i < N; i++){
            arr[i] = Integer.parseInt(st.nextToken());
        }

        for(int i = 0; i < K - 1; i++){
            hashMap.put(arr[i], hashMap.getOrDefault(arr[i], 0) + 1);
        }

        int lt = 0;
        for(int i = K - 1; i < N; i++){
            hashMap.put(arr[i], hashMap.getOrDefault(arr[i], 0) + 1);
            result.add(hashMap.size());
            hashMap.put(arr[lt], hashMap.getOrDefault(arr[lt], 0) - 1);
            if(hashMap.get(arr[lt]) == 0){
                hashMap.remove(arr[lt]);
            }
            lt++;
        }

        for(int i : result){
            System.out.print(i + " ");
        }
    }
}
