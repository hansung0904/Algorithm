package arrayquestion;

import java.io.*;
import java.util.StringTokenizer;

public class Number10810 {

    public static void main(String[] args) throws IOException {
        answer();
    }

    public static void answer() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        int[] array = new int[N];

        for (int i = 0; i < M; i++) {
            st = new StringTokenizer(br.readLine());

            int A = Integer.parseInt(st.nextToken());
            int B = Integer.parseInt(st.nextToken());
            int C = Integer.parseInt(st.nextToken());

            for (int j = A - 1; j < B; j++) {
                array[j] = C;
            }
        }
        for (int k = 0; k < array.length; k++) {
            bw.write(array[k] + " ");
        }
        br.close();
        bw.flush();
        bw.close();
    }
}
