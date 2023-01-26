package studyweek3.bfs;

import java.util.*;
import java.io.*;

public class Number11724 {
    static int n;
    static int m;
    static int[][] graph;
    static boolean[] visited;

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());
        graph = new int[n + 1][n + 1];
        visited = new boolean[n + 1];

        for (int i = 0; i < m; i++) {
            st = new StringTokenizer(br.readLine());
            int u = Integer.parseInt(st.nextToken());
            int v = Integer.parseInt(st.nextToken());
            graph[u][v] = graph[v][u] = 1;
        }

        int count = 0;
        for (int i = 1; i <= n; i++) {
            if (!visited[i]) {
                BFS(i);
                count++;
            }
        }
        System.out.println(count);
    }

    public static void BFS(int start) {
        Queue<Integer> q = new ArrayDeque<>();
        q.add(start);
        visited[start] = true;

        while (!q.isEmpty()) {
            int nowPoint = q.poll();
            for (int i = 1; i <= n; i++) {
                if (!visited[i] && graph[nowPoint][i] == 1) {
                    visited[i] = true;
                    q.add(i);
                }
            }
        }
    }
}
