package studyweek2.binarysearch;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Number1920Realization {

    public static int[] arr;

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        arr = new int[n];

        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(arr);

        int m = Integer.parseInt(br.readLine());

        st = new StringTokenizer(br.readLine());

        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < m; i++) {
            if (binarySearch(Integer.parseInt(st.nextToken())) >= 0) {
                sb.append(1).append('\n');
            } else {
                sb.append(0).append('\n');
            }
        }
        System.out.print(sb);
    }

    private static int binarySearch(int key) {

        int leftSideEndPoint = 0;
        int rightSideEndPoint = arr.length - 1;

        while (leftSideEndPoint <= rightSideEndPoint) {

            int middlePoint = (leftSideEndPoint + rightSideEndPoint) / 2;

            if (key < arr[middlePoint]) {
                rightSideEndPoint = middlePoint - 1;
            } else if (key > arr[middlePoint]) {
                leftSideEndPoint = middlePoint + 1;
            } else {
                return middlePoint;
            }
        }
        return -1;
    }
}
