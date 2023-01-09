package studyweek1.sort;

import java.io.*;
import java.util.Arrays;
import java.util.Comparator;
import java.util.StringTokenizer;

public class Number1015 {

    public static void main(String[] args) throws IOException {

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(bufferedReader.readLine());
        int[][] array = new int[n][3];

        StringTokenizer stringTokenizer = new StringTokenizer(bufferedReader.readLine());

        for (int i = 0; i < n; i++) {
            int val = Integer.parseInt(stringTokenizer.nextToken());
            array[i] = new int[]{val, i, 0};
        }
        Arrays.sort(array, Comparator.comparingInt(o -> o[0]));

        for (int i = 0; i < n; i++) {
            array[i][2] = i;
        }

        Arrays.sort(array, Comparator.comparingInt(o -> o[1]));

        for (int i = 0; i < n; i++) {
            System.out.print(array[i][2] + " ");
        }
    }
}
