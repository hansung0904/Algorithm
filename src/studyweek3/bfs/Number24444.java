package studyweek3.bfs;

import java.util.*;
import java.io.*;

public class Number24444 {

    private static int[][] graph; // 그래프
    private static boolean[] visited; // 방문 체크 배열
    private static int[] visitCountArray; // 방문 순서를 저장할 배열

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        int r = Integer.parseInt(st.nextToken());
        graph = new int[n + 1][n + 1];
        visited = new boolean[n + 1];
        visitCountArray = new int[n + 1];


        for (int i = 0; i < m; i++) {
            st = new StringTokenizer(br.readLine());
            int start = Integer.parseInt(st.nextToken());
            int end = Integer.parseInt(st.nextToken());
            graph[start][end] = graph[end][start] = 1;
        }

        BFS(r);

        for (int i = 1; i < visitCountArray.length; i++) {
            System.out.println(visitCountArray[i]);
        }
    }

    private static void BFS(int start) {
        Queue<Integer> q = new ArrayDeque<>();
        q.add(start);
        visited[start] = true;
        int count = 1;
        visitCountArray[1] = count;

        while (!q.isEmpty()) {
            int nowPoint = q.poll();

            for (int i = 1; i < graph.length; i++) {
                int newPoint = graph[nowPoint][i];
                if (newPoint == 1) {
                    if (visited[i]) {
                        continue;
                    } else {
                        q.add(i);
                        visited[i] = true;
                        count++;
                        visitCountArray[i] = count;
                    }
                }

            }
        }
    }
}
