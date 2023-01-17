package studyweek3.bfs;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Queue;
import java.util.StringTokenizer;

/**
 * -가 같은 행에 있다면 같은 나무 판자.
 * |가 같은 열에 있다면 같은 나무 판자.
 * 따라서 각 좌표마다 방문하지 않았다면 BFS를 돌림
 * -인 경우에는 오른쪽을 보도록 BFS를 돌림
 * |인 경우에는 아래쪽을 보도록 BFS를 돌림
 * 왼쪽에서부터 차례로 for문을 돌려 BFS를 돌리기 때문에 오른쪽과 아래쪽만 봐도 된다.
 */

public class Number1388 {

    static int N, M;
    static char[][] Map;
    static boolean[][] visit;

    static class Point {
        int i, j;

        public Point(int i, int j) {
            super();
            this.i = i;
            this.j = j;
        }

    }

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] inArr = br.readLine().split(" ");
        N = Integer.parseInt(inArr[0]);
        M = Integer.parseInt(inArr[1]);
        Map = new char[N][];
        for (int p = 0; p < N; p++) {
            Map[p] = br.readLine().toCharArray();
        } // end input;

        visit = new boolean[N][M];
        int cnt = 0;
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                if (visit[i][j])
                    continue;
                if (Map[i][j] == '-') { // 오른쪽만 보기
                    BFS(new Point(i, j), 0, 1);
                    cnt++;
                } else if (Map[i][j] == '|') { // 아래쪽만 보기
                    BFS(new Point(i, j), 1, 0);
                    cnt++;
                }
            }
        }
        System.out.println(cnt);
    }

    static void BFS(Point a, int di, int dj) {
        char ch = Map[a.i][a.j];
        Queue<Point> Q = new ArrayDeque<>();
        Q.add(a);
        visit[a.i][a.j] = true;
        while (!Q.isEmpty()) {
            Point pnt = Q.poll();
            int ni = pnt.i + di;
            int nj = pnt.j + dj;
            if (ni < 0 || nj < 0 || ni >= N || nj >= M)
                continue;
            if (visit[ni][nj])
                continue;
            if (ch == Map[ni][nj]) {
                Q.add(new Point(ni, nj));
                visit[ni][nj] = true;
            }
        }
    }
}
