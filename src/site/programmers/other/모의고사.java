package site.programmers.other;

import java.util.ArrayList;

public class 모의고사 {

    public int[] solution(int[] answers) {
        int[] answer;
        User user1 = new User(new int[]{1, 2, 3, 4, 5});
        User user2 = new User(new int[]{2, 1, 2, 3, 2, 4, 2, 5});
        User user3 = new User(new int[]{3, 3, 1, 1, 2, 2, 4, 4, 5, 5});

        for(int i = 0; i < answers.length; i++) {
            checkProblem(answers, i, user1);
            checkProblem(answers, i, user2);
            checkProblem(answers, i, user3);
        }

        answer = highScoreUsers(user1, user2, user3);

        return answer;
    }

    private static int[] highScoreUsers(User... users) {
        int maxScore = 0;
        int order = 1;
        ArrayList<Integer> arr = new ArrayList<>();

        for(User user : users) {
            maxScore = Math.max(user.getScore(), maxScore);
        }

        for(User user : users) {
            if(user.getScore() == maxScore) {
                arr.add(order);
            }

            order++;
        }

        return arr.stream().mapToInt(i -> i).toArray();
    }

    private static void checkProblem(int[] answers, int i, User user1) {
        if (answers[i] == user1.getAnswer()[i % user1.getAnswer().length]) {
            user1.addScore();
        }
    }

    class User {
        private int score = 0;
        private int[] answer;

        public User(int[] answer) {
            this.answer = answer;
        }

        public int getScore() {
            return score;
        }

        public int[] getAnswer() {
            return answer;
        }

        public void addScore() {
            score++;
        }
    }
}
