package site.programmers.other;

import java.util.ArrayList;

public class 순위_검색 {
    public int[] solution(String[] info, String[] query) {
        ArrayList<User> infos = new ArrayList<>();
        ArrayList<User> queries = new ArrayList<>();

        for (int i = 0; i < info.length; i++) {
            String[] split = info[i].split(" ");

            User user = new User(split[0], split[1], split[2], split[3], Integer.parseInt(split[4]));
            infos.add(user);
        }

        for(int i = 0; i < query.length; i++){
            String[] split = query[i].replaceAll(" and ", " ").split(" ");

            User user = new User(split[0], split[1], split[2], split[3], Integer.parseInt(split[4]));
            queries.add(user);
        }

        int index = 0;
        int[] answer = new int[queries.size()];

        for (User user : queries) {
            answer[index++] = (int) infos.stream()
                    .filter(i -> i.getScore() >= user.getScore())
                    .filter(i -> i.isMatch(user))
                    .count();
        }

        return answer;
    }

    class User {
        private String language;
        private String job;
        private String resume;
        private String soulFood;
        private int score;

        public User(String language, String job, String resume, String soulFood, int score) {
            this.language = language;
            this.job = job;
            this.resume = resume;
            this.soulFood = soulFood;
            this.score = score;
        }

        public String getLanguage() {
            return language;
        }

        public String getJob() {
            return job;
        }

        public String getResume() {
            return resume;
        }

        public String getSoulFood() {
            return soulFood;
        }

        public int getScore() {
            return score;
        }

        public boolean isMatch(User query) {
            if(!"-".equals(query.language) && !this.language.equals(query.language)) {
                return false;
            }

            if(!"-".equals(query.job) && !this.job.equals(query.job)) {
                return false;
            }

            if(!"-".equals(query.resume) && !this.resume.equals(query.resume)) {
                return false;
            }

            if(!"-".equals(query.soulFood) && !this.soulFood.equals(query.soulFood)) {
                return false;
            }

            return true;
        }
    }
}
