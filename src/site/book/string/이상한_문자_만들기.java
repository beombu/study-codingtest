package site.book.string;

public class 이상한_문자_만들기 {
    public String solution(String s) {
        StringBuilder builder = new StringBuilder();
        boolean flag = true;

        for(char c : s.toCharArray()) {
            if (!Character.isAlphabetic(c)) {
                builder.append(c);
                flag = true;
            } else {
                if (flag) {
                    builder.append(Character.toUpperCase(c));
                } else {
                    builder.append(Character.toLowerCase(c));
                }

                flag = !flag;
            }
        }

        return builder.toString();
    }
}
