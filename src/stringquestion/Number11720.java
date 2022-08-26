package stringquestion;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
 * N개의 숫자가 공백 없이 쓰여있다. 이 숫자를 모두 합해서 출력하는 프로그램을 작성하시오.
 * 입력으로 주어진 숫자 N개의 합을 출력한다.
 * */
public class Number11720 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int number = Integer.parseInt(br.readLine());

        String result = br.readLine();
        int sum = 0;

        for (int i = 0; i < number; i++) {
            sum += result.charAt(i) - '0';
        }

        System.out.println(sum);
    }
}
