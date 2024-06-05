package site.programmers.other;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;

public class 두_개_뽑아서_더하기 {
    public int[] solution(int[] numbers) {
        HashSet<Integer> set = new HashSet<>();
        int[] answer;

        for(int i = 0 ; i < numbers.length ; i++) {
            for(int j = i + 1; j < numbers.length; j++) {
                set.add(numbers[i] + numbers[j]);
            }
        }

        List<Integer> list = new ArrayList<>();

        for (int i : set) {
            list.add(i);
        }

        Collections.sort(list);
        answer = list.stream().mapToInt(i -> i).toArray();

        return answer;
    }
}
