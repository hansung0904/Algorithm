package com.algorithmrefactor;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*예를 들어, 2012년은 4의 배수이면서 100의 배수가 아니라서 윤년이다. 1900년은 100의 배수이고 400의 배수는 아니기 때문에 윤년이 아니다.
하지만, 2000년은 400의 배수이기 때문에 윤년이다.
연도가 주어졌을 때, 윤년이면 1, 아니면 0을 출력하는 프로그램을 작성하시오.
*/
public class Number2753 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int inputLeapYear = Integer.parseInt(bufferedReader.readLine());

        if ((inputLeapYear % 4 == 0 && inputLeapYear % 100 != 0) || inputLeapYear % 400 == 0) {
            System.out.println(1);
        } else {
            System.out.println(0);
        }
        bufferedReader.close();
    }
}

