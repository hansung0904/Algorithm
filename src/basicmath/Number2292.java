package basicmath;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Number2292 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int inputNumber = Integer.parseInt(br.readLine());
        int count = 1; // 겹수 (최소루트)
        int range = 2; // 범위 (min 값 기준)

        if (inputNumber == 1) {
            System.out.print(1);
        } else {
            while (range <= inputNumber) {
                range = range + (6 * count);
                count++;
            }
            System.out.println(count);
        }


    }
}
