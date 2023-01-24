package studyweek3.bfs;

import java.io.*;
import java.util.*;

public class Number16173Realization {

    static int n;
    static int[][] map;
    static boolean[][] checkGraph; // 방문 체크 배열

    static class Point { // 좌표
        int x;
        int y;

        public Point(int x, int y) {
            this.x = x;
            this.y = y;
        }
    }

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        n = Integer.parseInt(br.readLine());
        map = new int[n][n];
        checkGraph = new boolean[n][n];


        for (int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            for (int j = 0; j < n; j++) {
                map[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        bfs(new Point(0, 0));
    }

    static void bfs(Point point) {

        Queue<Point> queue = new ArrayDeque<>();
        queue.add(new Point(point.x, point.y)); // 방문 체크 할 애들을 queue에 넣음
        checkGraph[point.x][point.y] = true;

        while (!queue.isEmpty()) {
            Point now = queue.poll(); // 현재 좌표
            int value = map[now.x][now.y];

            if (value == -1) {
                System.out.println("HaruHaru");
                return;
            } else {
                int[] x = {value, 0};
                int[] y = {0, value};
                for (int i = 0; i < 2; i++) {
                    Point ppp = new Point(now.x + x[i], now.y + y[i]);
                    if (ppp.x < 0 || ppp.x >= n || ppp.y < 0 || ppp.y >= n) {
                        continue;
                    }
                    if (map[ppp.x][ppp.y] != -1 && checkGraph[ppp.x][ppp.y] == false) {
                        queue.add(new Point(ppp.x, ppp.y));
                        checkGraph[ppp.x][ppp.y] = true;
                    } else if (map[ppp.x][ppp.y] == -1) {
                        queue.add(new Point(ppp.x, ppp.y));
                    }
                }
            }
        }
        System.out.println("Hing");
    }
}
