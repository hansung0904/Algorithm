package stringquestion;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Number2908 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int inputNumberOne = Integer.parseInt(new StringBuilder(st.nextToken()).reverse().toString());
        int inputNumberTwo = Integer.parseInt(new StringBuilder(st.nextToken()).reverse().toString());

        System.out.println(inputNumberOne > inputNumberTwo ? inputNumberOne : inputNumberTwo);
        br.close();


    }
}
