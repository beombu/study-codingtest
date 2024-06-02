package site.programmers.other;

public class 크기가_작은_부분_문자열 {
    public int solution(String t, String p) {
        int answer = 0;
        long num = Long.parseLong(p);

        for(int i = 0; i < t.length() - p.length() + 1; i++) {
            long diff = Long.parseLong(t.substring(i, i + p.length()));

            if (diff <= num) {
                answer++;
            }
        }

        return answer;
    }
}
