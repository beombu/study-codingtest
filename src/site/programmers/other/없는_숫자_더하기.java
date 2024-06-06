package site.programmers.other;

import java.util.HashSet;
import java.util.Iterator;

public class 없는_숫자_더하기 {
    public int solution(int[] numbers) {
        int answer = 0;

        HashSet<Integer> set = new HashSet<>();

        for (int i = 0; i <= 9; i++) {
            set.add(i);
        }

        for (int i : numbers) {
            set.remove(i);
        }

        Iterator<Integer> iterator = set.iterator();

        while (iterator.hasNext()) {
            answer += iterator.next();
        }

        return answer;
    }
}
