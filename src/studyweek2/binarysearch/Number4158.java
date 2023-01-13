package studyweek2.binarysearch;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;
import java.util.StringTokenizer;

public class Number4158 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        while (true) {
            Set<Integer> saveNumber = new HashSet<>();
            StringTokenizer st = new StringTokenizer(br.readLine());

            int sangeunCDCount = Integer.parseInt(st.nextToken());
            int sunyeongCDCount = Integer.parseInt(st.nextToken());

            if (sangeunCDCount == 0 && sunyeongCDCount == 0) {
                break;
            }

            while (sangeunCDCount-- > 0) {
                int value = Integer.parseInt(br.readLine());
                saveNumber.add(value);
            }
            int answer = 0;

            while (sunyeongCDCount-- > 0) {
                int value2 = Integer.parseInt(br.readLine());

                if (saveNumber.contains(value2)) {
                    answer++;
                }
            }
            sb.append(answer).append("\n");
        }
        System.out.print(sb);
    }
}