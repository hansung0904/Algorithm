package studyweek3.bfs;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Queue;
import java.util.StringTokenizer;

public class Number1697 {

    static int n; // 수빈이 점
    static int k; // 동생의 점
    static boolean[] visited; // 방문 체크 배열
    static int count;

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        n = Integer.parseInt(st.nextToken());
        k = Integer.parseInt(st.nextToken());
        visited = new boolean[100001]; // 0 ~ 10000까지

        count = BFS(n);

        System.out.println(count);
    }

    public static int BFS(int start) {
        Queue<int[]> q = new ArrayDeque<>();
        q.add(new int[]{start, 0});
        visited[start] = true;

        while (!q.isEmpty()) {
            int[] currentArray = q.poll();
            int currentStart = currentArray[0];
            int count = currentArray[1];

            if (currentStart == k) {
                return count;
            }

            if (currentStart - 1 >= 0 && !visited[currentStart - 1]) {
                q.add(new int[]{currentStart - 1, count + 1});
                visited[currentStart - 1] = true;
            }

            if (currentStart + 1 < 100001 && !visited[currentStart + 1]) {
                q.add(new int[]{currentStart + 1, count + 1});
                visited[currentStart + 1] = true;
            }

            if (currentStart * 2 < 100001 && !visited[currentStart * 2]) {
                q.add(new int[]{currentStart * 2, count + 1});
                visited[currentStart * 2] = true;
            }
        }

        return -1;
    }
}
