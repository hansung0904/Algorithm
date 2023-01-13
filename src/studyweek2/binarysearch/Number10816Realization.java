package studyweek2.binarysearch;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class Number10816Realization {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int n = Integer.parseInt(br.readLine());
        Map<Integer, Integer> nMap = new HashMap<>();

        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            int compareNumber = Integer.parseInt(st.nextToken());

            if (nMap.containsKey(compareNumber)) {
                int value = nMap.get(compareNumber) + 1;
                nMap.put(compareNumber, value);
            } else {
                nMap.put(compareNumber, 1);
            }
        }

        int m = Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine());

        for (int i = 0; i < m; i++) {
            int compareNumber = Integer.parseInt(st.nextToken());

            if (nMap.containsKey(compareNumber)) {
                sb.append(nMap.get(compareNumber));
            } else {
                sb.append(0);
            }
            sb.append(" ");
        }
        System.out.print(sb);
    }
}
