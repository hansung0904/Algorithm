package studyweek5.studyweek6.divideandconquer;

import java.util.*;
import java.io.*;

public class Number24460 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        int N = Integer.parseInt(br.readLine());
        int[][] arr = new int[N][N];

        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < N; j++) {
                arr[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        System.out.println(solve(arr, 0, 0, N));
    }

    public static int solve(int[][] arr, int i, int j, int N) {
        if (N == 1)
            return arr[i][j];

        int next = N / 2;
        int[] result = new int[4];
        result[0] = solve(arr, i, j, next);
        result[1] = solve(arr, i + next, j, next);
        result[2] = solve(arr, i, j + next, next);
        result[3] = solve(arr, i + next, j + next, next);

        Arrays.sort(result);
        return result[1];
    }
}
