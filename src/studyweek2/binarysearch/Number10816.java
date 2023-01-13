package studyweek2.binarysearch;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class Number10816 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int n = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());

        Map<Integer, Integer> nMap = new HashMap<>();

        for (int i = 0; i < n; i++) {

            int checkNumber = Integer.parseInt(st.nextToken());

            if (nMap.containsKey(checkNumber)) {
                int val = nMap.get(checkNumber) + 1;
                nMap.put(checkNumber, val);
            } else {
                nMap.put(checkNumber, 1);
            }
        }

        int m = Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine());

        for (int i = 0; i < m; i++) {

            int findNumber = Integer.parseInt(st.nextToken());

            if (nMap.containsKey(findNumber)) {
                sb.append(nMap.get(findNumber));
            } else {
                sb.append(0);
            }
            sb.append(" ");
        }
        System.out.println(sb);
    }
}
