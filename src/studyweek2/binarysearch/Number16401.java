package studyweek2.binarysearch;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Number16401 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st = new StringTokenizer(br.readLine());

        int nephewCount = Integer.parseInt(st.nextToken());
        int cookieCount = Integer.parseInt(st.nextToken());
        int[] cookieLength = new int[cookieCount];
        long max = 0;

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < cookieLength.length; i++) {
            cookieLength[i] = Integer.parseInt(st.nextToken());
            if (max < cookieLength[i]) {
                max = cookieLength[i];
            }
        }
        max++;

        long min = 1;
        long mid = 0;

        while (min < max) {
            mid = (min + max) / 2;
            int count = 0;
            for (int i = 0; i < cookieLength.length; i++) {
                count += (cookieLength[i] / mid);
            }

            if (count < nephewCount) {
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
