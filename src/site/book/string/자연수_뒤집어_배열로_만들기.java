package site.book.string;

public class 자연수_뒤집어_배열로_만들기 {
    public int[] solution(long n) {
        String str = Long.toString(n);

        String reversed = new StringBuilder(str).reverse().toString();
        int[] answer = new int[reversed.length()];

        for(int i = 0; i < reversed.length(); i++) {
            answer[i] = reversed.charAt(i) - '0';
        }

        return answer;
    }
}
