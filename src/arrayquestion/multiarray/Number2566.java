package arrayquestion.multiarray;

import java.util.*;
import java.io.*;

public class Number2566 {

    static int[][] array;
    static int max;
    static int x, y;

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        array = new int[9][9];
        max = 0;

        for (int i = 0; i < 9; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            for (int j = 0; j < 9; j++) {
                array[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                if (max < array[i][j]) {
                    max = array[i][j];
                    x = i;
                    y = j;
                }
            }
        }
        System.out.println(max);
        System.out.print((x + 1) + " " + (y + 1));
    }
}
