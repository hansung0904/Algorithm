package com.algorithmrefactor;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
/*입력 시간은 24시간 표현을 사용한다. 24시간 표현에서 하루의 시작은 0:0(자정)이고, 끝은 23:59(다음날 자정 1분 전)이다.
시간을 나타낼 때, 불필요한 0은 사용하지 않는다.
45분 일찍 일어날 수 있도록 하는 알람을 맞추게 한다.
첫째 줄에 상근이가 창영이의 방법을 사용할 때, 설정해야 하는 알람 시간을 출력한다.
(입력과 같은 형태로 출력하면 된다.)
*/
public class Number2884 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer stringTokenizer = new StringTokenizer(bufferedReader.readLine());

        int inputHour = Integer.parseInt(stringTokenizer.nextToken());
        int inputMinute = Integer.parseInt(stringTokenizer.nextToken());

        if (inputMinute < 45) {
            inputHour--; // 핵심
            inputMinute = 60 - (45 - inputMinute);
            if (inputHour < 0) {
                inputHour = 23;
            }
            System.out.println(inputHour + " " + inputMinute);
        } else {
            System.out.println(inputHour + " " + (inputMinute - 45));
        }

        bufferedReader.close();
    }
}
