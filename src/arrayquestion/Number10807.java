package arrayquestion;

import java.util.*;
import java.io.*;


public class Number10807 {

    public static void main(String[] args) throws IOException {

        StringBuilder sb = new StringBuilder();
        sb.append(findCount());
        System.out.println(sb);
    }

    public static int findCount() throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] numberArray = new int[n];
        StringTokenizer st = new StringTokenizer(br.readLine());

        for (int i = 0; i < n; i++) {
            numberArray[i] = Integer.parseInt(st.nextToken());
        }

        int v = Integer.parseInt(br.readLine());

        int count = 0;
        for (int i : numberArray) {
            if (i == v) {
                count++;
            }
        }
        return count;
    }
}
