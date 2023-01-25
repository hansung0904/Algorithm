package studyweek3.bfs;

import java.io.*;
import java.util.*;


public class Number2606 {
    static int computerNumber;
    static int computerPairNumber;
    static int[][] graph;
    static boolean[] visited;

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        computerNumber = Integer.parseInt(br.readLine());
        computerPairNumber = Integer.parseInt(br.readLine());
        graph = new int[computerNumber + 1][computerNumber + 1];
        visited = new boolean[computerNumber + 1];

        for (int i = 0; i < computerPairNumber; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int firstNumber = Integer.parseInt(st.nextToken());
            int secondNumber = Integer.parseInt(st.nextToken());

            graph[firstNumber][secondNumber] = graph[secondNumber][firstNumber] = 1;
        }
        BFS(1);
    }

    public static void BFS(int start) {
        StringBuilder sb = new StringBuilder();
        Queue<Integer> q = new ArrayDeque<>();
        q.add(start);
        visited[start] = true;

        int virus = 0;
        while (!q.isEmpty()) {
            int nowPoint = q.poll();
            for (int i = 0; i < graph.length; i++) {
                if (!visited[i] && graph[nowPoint][i] == 1) {
                    q.add(i);
                    visited[i] = true;
                    virus++;
                }
            }
        }
        sb.append(virus);
        System.out.println(sb);
    }
}
