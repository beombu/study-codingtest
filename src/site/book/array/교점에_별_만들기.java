package site.book.array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class 교점에_별_만들기 {
    public String[] solution(int[][] line) {
        List<Point> points = new ArrayList<>();

        for (int i = 0; i < line.length; i++) {
            for (int j = i + 1; j < line.length; j++) {
                Point intersection = intersection(line[i][0], line[i][1], line[i][2],
                        line[j][0], line[j][1], line[j][2]);

                if (intersection != null) {
                    points.add(intersection);
                }
            }
        }


        Point minimum = getMinimumPoint(points);//-1,-1
        Point maximum = getMaximumPoint(points);//2, 3

        int width = (int) (maximum.getX() - minimum.getX() + 1);//2 - (-1) + 1 = 4
        int height = (int) (maximum.getY() - minimum.getY() + 1);//3 - (-1) + 1 = 5

        char[][] arr = new char[height][width];//5, 4
        for (char[] row : arr) {
            Arrays.fill(row, '.');
        }

        for (Point p : points) {
            int x = (int) (p.getX() - minimum.getX());//-1 - (-1) = 0
            int y = (int) (maximum.getY() - p.getY());//3 - (-1) = 4
            arr[y][x] = '*';
        }

        String[] result = new String[arr.length];
        for (int i = 0; i < result.length; i++) {
            result[i] = new String(arr[i]);
        }

        return result;
    }

    private static class Point {
        private final long x;
        private final long y;

        public long getX() {
            return x;
        }

        public long getY() {
            return y;
        }

        public Point(long x, long y) {
            this.x = x;
            this.y = y;
        }
    }

    private Point intersection(long a1, long b1, long c1, long a2, long b2, long c2) {
        double x = (double) (b1 * c2 - b2 * c1) / (a1 * b2 - a2 * b1);
        double y = (double) (a2 * c1 - a1 * c2) / (a1 * b2 - a2 * b1);

        if (x % 1 != 0 || y % 1 != 0) {
            return null;
        }

        return new Point((long) x, (long) y);
    }

    private Point getMinimumPoint(List<Point> points) {
        long x = Long.MAX_VALUE;
        long y = Long.MAX_VALUE;

        for (Point p : points) {
            if (p.getX() < x) {
                x = p.getX();
            }
            if (p.getY() < y) {
                y = p.getY();
            }
        }

        return new Point(x, y);
    }

    private Point getMaximumPoint(List<Point> points) {
        long x = Long.MIN_VALUE;
        long y = Long.MIN_VALUE;

        for (Point p : points) {
            if (p.getX() > x) {
                x = p.getX();
            }
            if (p.getY() > y) {
                y = p.getY();
            }
        }

        return new Point(x, y);
    }
}
