package studyweek1.sort;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Number2752 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int[] saveNumbers = new int[3];

        for (int i = 0; i < saveNumbers.length; i++) {
            saveNumbers[i] = Integer.parseInt(st.nextToken());
        }
        Arrays.sort(saveNumbers);
        for (int i = 0; i < saveNumbers.length; i++) {
            System.out.print(saveNumbers[i] + " ");
        }
    }
}
