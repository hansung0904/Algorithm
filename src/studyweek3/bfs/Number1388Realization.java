package studyweek3.bfs;

import java.io.*;
import java.util.*;

public class Number1388Realization {

    static int n; // 세로크기
    static int m; // 가로크기
    static char[][] treeBoard;
    static boolean[][] checkVisit;


    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());
        treeBoard = new char[n][];
        checkVisit = new boolean[n][m];

        for (int i = 0; i < n; i++) {
            treeBoard[i] = br.readLine().toCharArray();
        }

        int count = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (checkVisit[i][j]) {
                    continue;
                }
                if (treeBoard[i][j] == '-') {
                    bfs(i, j, 0, 1);
                    count++;
                } else if (treeBoard[i][j] == '|') {
                    bfs(i, j, 1, 0);
                    count++;
                }
            }
        }
        System.out.println(count);
    }

    public static void bfs(int xPoint, int yPoint, int i, int j) {
        Queue<int[]> queue = new ArrayDeque<>();
        queue.add(new int[]{xPoint, yPoint});
        checkVisit[xPoint][yPoint] = true;

        while (!queue.isEmpty()) {
            int[] now = queue.poll(); // 현재좌표.

            // 좌표를 이동해서 이동한 좌표가 범위 내에 있는지 확인하고
            int newX = now[0] + i;
            int newY = now[1] + j;
            if (newX < 0 || newY < 0 || newX >= n || newY >= m) {
                continue;
            }
            if (!checkVisit[newX][newY] && treeBoard[newX][newY] == treeBoard[now[0]][now[1]]) {
                queue.add(new int[]{newX, newY});
                checkVisit[newX][newY] = true;
            }
        }
    }
}
