package site.inflearn.sort_search;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.List;
import java.util.StringTokenizer;

public class LeastRecentlyUsed {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int S = Integer.parseInt(st.nextToken());
        int N = Integer.parseInt(st.nextToken());
        List<Integer> cache = new LinkedList<>();

        st = new StringTokenizer(br.readLine());

        for(int i = 0; i < N; i++){
            int work = Integer.parseInt(st.nextToken());

            if(cache.size() >= S){
                if(!cache.contains(work)){//cache miss의 경우
                    cache.remove(S - 1);
                    cache.add(0, work);
                }else{//cache hit의 경우
                    cache.remove(cache.indexOf(work));
                    cache.add(0, work);
                }
            }else{
                if (!cache.contains(work)) {
                    cache.add(0, work);
                }else{
                    cache.remove(cache.indexOf(work));
                    cache.add(0, work);
                }
            }
        }

        for (int x : cache) {
            System.out.print(x + " ");
        }
    }
}
