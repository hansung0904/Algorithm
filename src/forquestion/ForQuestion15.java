package forquestion;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ForQuestion15 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(br.readLine());
        int firstNum = num;
        int count = 0;

        while (true) {
            int tenDigit = num / 10; // 10의 자리
            int oneDigit = num % 10; // 1의자리
            int sum = tenDigit + oneDigit;
            count++;
            num = oneDigit * 10 + sum % 10;

            if (firstNum == num) {
                System.out.println(count);
                break;
            }
        }
    }
}