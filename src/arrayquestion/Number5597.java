package arrayquestion;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Number5597 {
    public static void main(String[] args) throws IOException {
        answer();
    }

    public static void answer() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] array = new int[31];

        for (int i = 1; i < 29; i++) {
            int attendance = Integer.parseInt(br.readLine());
            array[attendance] = 1;
        }

        for (int i = 1; i < array.length; i++) {
            if (array[i] != 1) {
                System.out.println(i);
            }
        }
    }
}
