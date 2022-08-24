package com.algorithmrefactor;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/*첫째 줄에 다음 세 가지 중 하나를 출력한다.
A가 B보다 큰 경우에는 '>'를 출력한다.
A가 B보다 작은 경우에는 '<'를 출력한다.
A와 B가 같은 경우에는 '=='를 출력한다.*/
public class Number1330 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer stringTokenizer = new StringTokenizer(bufferedReader.readLine());
        int aNumber = Integer.parseInt(stringTokenizer.nextToken());
        int bNumber = Integer.parseInt(stringTokenizer.nextToken());

        if (aNumber > bNumber) {
            System.out.println(">");
        } else if (aNumber < bNumber) {
            System.out.println("<");
        } else {
            System.out.println("==");
        }
        bufferedReader.close();
    }
}
