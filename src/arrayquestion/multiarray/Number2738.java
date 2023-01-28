package arrayquestion.multiarray;

import java.util.*;
import java.io.*;

public class Number2738 {

    static int n; // 행렬의 크기 N
    static int m; // 행렬의 크기 M
    static int[][] aArray;
    static int[][] bArray;
    static int[][] resultArray;


    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());

        aArray = new int[n][m];
        bArray = new int[n][m];
        resultArray = new int[n][m];

        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < m; j++) {
                aArray[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < m; j++) {
                bArray[i][j] = Integer.parseInt(st.nextToken());
            }
        }


        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                resultArray[i][j] = aArray[i][j] + bArray[i][j];
                System.out.print(resultArray[i][j] + " ");
            }
            System.out.println();
        }
    }
}
