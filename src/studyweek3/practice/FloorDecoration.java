package studyweek3.practice;

import java.io.*;
import java.util.*;

public class FloorDecoration {

    /**
     * 먼저 BFS 구현하려면 탐색할 그래프 (보통 2차원 배열로 구현)
     * 방문 처리를 위한 boolean 타입의 배열 (위에서 그래프가 2차원 배열로 구현하였으면 당연히 방문처리를 위한 그래프도 2차원으로 따라가야한다)
     * Queue
     * -> 큐를 구현할때 LinkedList도 있지만 ArrayDequeue가 속도적인 측면에서 더 빠르다.
     * -> 큐에서 값을 넣어줄 때 add 메소드와 offer메소드가 있는데 add는 예외를 리턴하고 offer는 null이나 , true / false를 반환한다.
     */


    static int n;
    static int m;
    static char[][] treeArray;
    static boolean[][] visitedArray;

    static class Point {
        int x;
        int y;

        public Point(int x, int y) {
            this.x = x;
            this.y = y;
        }
    }

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();

        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());
        treeArray = new char[n][];
        visitedArray = new boolean[n][m];

        for (int i = 0; i < n; i++) {
            treeArray[i] = br.readLine().toCharArray();
        }

        int count = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (visitedArray[i][j]) {
                } else {
                    if (treeArray[i][j] == '-') {
                        BFS(new Point(i, j), 0, 1);
                        count++;
                    } else {
                        BFS(new Point(i, j), 1, 0);
                        count++;
                    }
                }

            }
        }
        sb.append(count);
        System.out.print(sb);
    }

    public static void BFS(Point point, int dx, int dy) {
        Queue<Point> queue = new ArrayDeque<>();
        queue.add(new Point(point.x, point.y));
        visitedArray[point.x][point.y] = true;

        while (!queue.isEmpty()) {
            Point nowPoint = queue.poll();
            Point newPoint = new Point(nowPoint.x + dx, nowPoint.y + dy);

            if (newPoint.x < 0 || newPoint.y < 0 || newPoint.x >= n || newPoint.y >= m) {
                continue;
            }
            if (visitedArray[newPoint.x][newPoint.y]) {
                continue;
            }
            if (treeArray[nowPoint.x][nowPoint.y] == treeArray[newPoint.x][newPoint.y]) {
                queue.add(newPoint);
                visitedArray[newPoint.x][newPoint.y] = true;
            }
        }
    }
}
