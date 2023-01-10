package studyweek2.binarysearch;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Number1654 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int k = Integer.parseInt(st.nextToken());
        int n = Integer.parseInt(st.nextToken());

        int[] arr = new int[k];

        long max = 0;

        for (int i = 0; i < k; i++) {
            arr[i] = Integer.parseInt(br.readLine());
            if (max < arr[i]) {
                max = arr[i];
            }
        }

        max++;

        long minLength = 0;
        long middleLength = 0;

        while (minLength < max) {

            middleLength = (max + minLength) / 2;

            int count = 0;

            for (int i = 0; i < arr.length; i++) {
                count += (arr[i] / middleLength);
            }

            if (count < n) {
                max = middleLength;
            } else {
                minLength = middleLength + 1;
            }
        }
        System.out.println(minLength - 1);
    }
}
