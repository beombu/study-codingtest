package site.programmers.codingKit.hash;

import java.util.HashSet;

public class 전화번호_목록 {
    public boolean solution(String[] phone_book) {
        HashSet<String> hashSet = new HashSet<>();

        for (String str : phone_book) {
            hashSet.add(str);
        }

        for (int i = 0; i < phone_book.length; i++) {
            for (int j = 0; j < phone_book[i].length(); j++) {
                if (hashSet.contains(phone_book[i].substring(0, j))) {
                    return false;
                }
            }
        }

        return true;
    }
}
