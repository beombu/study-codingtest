package site.programmers.codingKit.hash;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class 베스트앨범 {

    class Song implements Comparable<Song> {
        private int idx;
        private String genre;
        private int playCnt;

        public Song(int idx, String genre, int playCnt) {
            this.idx = idx;
            this.genre = genre;
            this.playCnt = playCnt;
        }

        public int getIdx() {
            return idx;
        }

        @Override
        public int compareTo(Song o) {
            if (this.playCnt < o.playCnt) {
                return 1;
            } else if (this.playCnt == o.playCnt) {
                if (this.idx < o.idx) {
                    return -1;
                } else {
                    return 1;
                }
            } else {
                return -1;
            }
        }
    }

    public int[] solution(String[] genres, int[] plays) {
        int[] answer;
        Map<String, Integer> map = new HashMap<>();
        for (int i = 0; i < genres.length; i++) {
            map.put(genres[i], map.getOrDefault(genres[i], 0) + plays[i]);
        }

        ArrayList<String> genresOrdered = new ArrayList<>();
        for (String key : map.keySet()) {
            genresOrdered.add(key);
        }
        Collections.sort(genresOrdered, ((o1, o2) -> map.get(o2) - map.get(o1)));

        ArrayList<Song> bestAlbum = new ArrayList<>();
        for (String genre : genresOrdered) {
            ArrayList<Song> list = new ArrayList<>();

            for (int i = 0; i < genres.length; i++) {
                if (genre.equals(genres[i])) {
                    list.add(new Song(i, genres[i], plays[i]));
                }
            }

            Collections.sort(list);
            bestAlbum.add(list.get(0));

            if (list.size() > 1) {
                bestAlbum.add(list.get(1));
            }
        }

        answer = new int[bestAlbum.size()];
        for (int i = 0; i < bestAlbum.size(); i++) {
            answer[i] = bestAlbum.get(i).getIdx();
        }

        return answer;
    }
}
