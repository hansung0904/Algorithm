package studyweek2.binarysearch;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Number2805 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        int[] treeHeight = new int[n];

        int min = 0;
        int max = 0;

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            treeHeight[i] = Integer.parseInt(st.nextToken());
            if (max < treeHeight[i]) {
                max = treeHeight[i];
            }
        }

        while (min < max) {

            int mid = (min + max) / 2;
            long sum = 0;
            for (int tree : treeHeight) {
                if (tree - mid > 0) {
                    sum += tree - mid;
                }
            }

            if (sum < m) {
                max = mid;
            } else {
                min = mid + 1;
            }
        }
        sb.append(min - 1);
        System.out.print(sb);
        br.close();
    }
}
