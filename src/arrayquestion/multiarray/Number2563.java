package arrayquestion.multiarray;

import java.io.*;
import java.util.*;

public class Number2563 {

    static boolean[][] largePaper = new boolean[101][101];
    static int count;

    public static void main(String[] args) throws IOException {
        blackDomain();
    }

    private static void blackDomain() throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int coloredNumber = Integer.parseInt(br.readLine());

        for (int i = 0; i < coloredNumber; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());

            aa(x, y);
        }
        result();

    }

    private static void result() {
        for (int i = 0; i < largePaper.length; i++) {
            for (int j = 0; j < largePaper.length; j++) {
                if (largePaper[i][j]) {
                    count++;
                }
            }
        }
        System.out.println(count);
    }

    private static void aa(int x, int y) {
        for (int i = x; i < (x + 10); i++) {
            for (int j = y; j < (y + 10); j++) {
                largePaper[i][j] = true;
            }
        }
    }
}
