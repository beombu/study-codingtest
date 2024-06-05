package site.programmers.other;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class 두_개_뽑아서_더하기 {
    public int[] solution(int[] numbers) {
        //add 할때 정렬
        Set<Integer> set = new TreeSet<>();

        for(int i = 0 ; i < numbers.length ; i++) {
            for(int j = i + 1; j < numbers.length; j++) {
                set.add(numbers[i] + numbers[j]);
            }
        }

        int[] answer = new int[set.size()];
        int index = 0;

        Iterator<Integer> iterator = set.iterator();
        while ((iterator.hasNext())) {
            answer[index] = iterator.next();
            index++;
        }

        return answer;
    }
}
