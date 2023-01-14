package studyweek2.binarysearch;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class Number10815 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int n = Integer.parseInt(br.readLine());
        Map<Integer, Integer> nMap = new HashMap<>();

        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            int compareNumber = Integer.parseInt(st.nextToken());

            nMap.put(compareNumber, 1);
        }

        int m = Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine());

        for (int i = 0; i < m; i++) {
            int compareNumber = Integer.parseInt(st.nextToken());

            if (nMap.containsKey(compareNumber)) {
                sb.append(1);
            } else {
                sb.append(0);
            }
            sb.append(" ");
        }
        System.out.print(sb);
        br.close();
    }
}
