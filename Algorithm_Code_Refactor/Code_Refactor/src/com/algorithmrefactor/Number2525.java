package com.algorithmrefactor;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;


/*훈제오리구이를 시작하는 시각과 오븐구이를 하는 데 필요한 시간이 분단위로 주어졌을 때,
오븐구이가 끝나는 시각을 계산하는 프로그램을 작성하시오.
첫째 줄에 종료되는 시각의 시와 분을 공백을 사이에 두고 출력한다.
*/
public class Number2525 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer stringTokenizer = new StringTokenizer(bufferedReader.readLine());

        int currentTimeHour = Integer.parseInt(stringTokenizer.nextToken());
        int currentTimeMinute = Integer.parseInt(stringTokenizer.nextToken());
        int needCookingTime = Integer.parseInt(bufferedReader.readLine());

        currentTimeMinute += needCookingTime; //+= 연사자 개념이 제대로 안잡혀있는듯

        if (currentTimeMinute >= 60) { // 2중 if문에 대해서 다시 한 번 다른 문제를 풀어보든지 2884번 문제를 다시 한 번 풀어보든지 해야할듯
            int result = currentTimeMinute / 60;
            currentTimeHour += result;
            currentTimeMinute -= (60 * result);
            if (currentTimeHour > 23) {
                currentTimeHour = currentTimeHour - 24;
            }
        }
        System.out.println(currentTimeHour + " " + currentTimeMinute);
        bufferedReader.close();
    }
}
