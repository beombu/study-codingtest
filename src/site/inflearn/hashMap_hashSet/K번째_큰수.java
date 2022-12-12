package site.inflearn.hashMap_hashSet;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class K번째_큰수 {
    public static final int SELECT_CARD_NUM = 3;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int result = 0;
        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());
        int[] arr = new int[N];
        TreeSet<Integer> treeSet = new TreeSet<>(Comparator.reverseOrder());
        int sum = 0;

        st = new StringTokenizer(br.readLine());
        for(int i = 0; i < N; i++){
            arr[i] = Integer.parseInt(st.nextToken());
        }

        for(int i = 0; i < SELECT_CARD_NUM; i++){
            sum += arr[i];
        }
        treeSet.add(sum);

        int start = 0;
        for(int i = SELECT_CARD_NUM; i < N; i++){
            sum += arr[i];
            sum -= arr[start++];

            treeSet.add(sum);
        }

        for(int i = 1; i <= treeSet.size(); i++){
            if(treeSet.isEmpty()){
                result = -1;
                break;
            }

            if(i == K){
                result = treeSet.first();
                break;
            }

            treeSet.remove(treeSet.first());
        }

        System.out.println(result);
    }
}
