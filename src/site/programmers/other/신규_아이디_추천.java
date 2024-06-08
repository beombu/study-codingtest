package site.programmers.other;

public class 신규_아이디_추천 {
    public String solution(String new_id) {
        String step1 = checkStep1(new_id);
        String step2 = checkStep2(step1);
        String step3 = checkStep3(step2);
        String step4 = checkStep4(step3);
        String step5 = checkStep5(step4);
        String step6 = checkStep6(step5);
        String step7 = checkStep7(step6);

        return step7;
    }

    public String checkStep1(String id) { //대문자 -> 소문자
        return id.toLowerCase();
    }

    public String checkStep2(String id) {
        String str = "";
        String[] split = id.split("");

        for (int i = 0; i < id.length(); i++) {
            if (id.charAt(i) == '-' || id.charAt(i) == '_'
                    || id.charAt(i) == '.' || Character.isDigit(id.charAt(i))
                    || Character.isLowerCase(id.charAt(i))) {
                    str += split[i];
            }
        }

        return str;
    }

    public String checkStep3(String id) {
        while (id.contains("..")) {
            id = id.replace("..", ".");
        }

        return id;
    }

    public String checkStep4(String id) {
        if (id.length() > 0) {
            if (id.charAt(0) == '.') {
                id = id.substring(1, id.length());
            }
        }

        if (id.length() > 0) {
            if (id.charAt(id.length() - 1) == '.') {
                id = id.substring(0, id.length() - 1);
            }
        }

        return id;
    }

    public String checkStep5(String id) {
        if (id.isEmpty()) {
            id = "a";
        }

        return id;
    }

    public String checkStep6(String id) {
        if (id.length() > 15) {
            id = id.substring(0, 15);
        }

        if (id.charAt(id.length() - 1) == '.') {
            id = id.substring(0, id.length() - 1);
        }

        return id;
    }

    public String checkStep7(String id) {
        if (id.length() <= 2) {
            while (id.length() != 3) {
                id += id.charAt(id.length() - 1);
            }
        }

        return id;
    }
}
