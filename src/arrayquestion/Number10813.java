package arrayquestion;

import java.io.*;
import java.util.StringTokenizer;

public class Number10813 {

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
        int temp;

        for (int i = 0; i < array.length; i++) {
            array[i] = i + 1;
        }

        for (int j = 0; j < M; j++) {
            st = new StringTokenizer(br.readLine());
            int I = Integer.parseInt(st.nextToken());
            int J = Integer.parseInt(st.nextToken());

            temp = array[I - 1];
            array[I - 1] = array[J - 1];
            array[J - 1] = temp;
        }

        for (int k = 0; k < array.length; k++) {
            bw.write(array[k] + " ");
        }
        br.close();
        bw.flush();
        bw.close();
    }
}
